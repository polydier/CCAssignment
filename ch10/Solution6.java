package ch10;

//如何写从文件的下一个chunk读取数据
//String的存储形式是一个大的，还是不同的小的String
//how to use chunk to control the document read and write
//
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution6 {

	static final int splitFileCharCount = 30;
	static final String splitFilePath = "split/";
	static final String splitFilePattern = "f%02d.data";

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// FileReader doc = new FileReader("demo.txt");
		// int str = doc.read();

		BufferedReader reader = new BufferedReader(
				new InputStreamReader(new FileInputStream(new File("demo.txt")), "UTF-8"));
		int curFileCharCount = 0;
		int nextChar = -1;
		int fileCount = 0;
		List<String> cache = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		while ((nextChar = reader.read()) != -1) {
			Character c = new Character((char) nextChar);
			if (c != ',')
				sb.append(c);
			else {
				// System.out.println(sb.toString());
				cache.add(sb.toString());
				curFileCharCount += sb.length();
				if(curFileCharCount >= splitFileCharCount) {
					Collections.sort(cache);
					writeStringsToFile(new File(splitFilePath, String.format(splitFilePattern, fileCount++)), cache);
					curFileCharCount = 0;
					cache.clear();
				}
				sb = new StringBuilder();
			}
		}
		if (sb.length() > 0)
			System.out.println(sb.toString());
		reader.close();
	}

	static void writeStringsToFile(File target, List<String> data) {
		if(target.getParentFile() != null && !target.getParentFile().exists())
			target.getParentFile().mkdirs();
		PrintWriter write = null;
		try {
			write = new PrintWriter(new FileOutputStream(target));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		for(String str : data) {
			write.write(str);
			write.write(",");
		}
		write.close();
	}
	
	public void externalsort(FileReader x) {

	}


	// Merge stage of external mergesort
	// Read from input file, already sorted into blocks of size blockSize
	// Write to output file, sorted into blocks of 2*blockSize
	public static void merge(String inputFile, String outputFile, long blockSize) throws IOException {
		// readers for block1/2
		FileInputStream fis1 = new FileInputStream(inputFile);
		DataInputStream dis1 = new DataInputStream(fis1);
		FileInputStream fis2 = new FileInputStream(inputFile);
		DataInputStream dis2 = new DataInputStream(fis2);

		// writer to output file
		FileOutputStream fos = new FileOutputStream(outputFile);
		DataOutputStream dos = new DataOutputStream(fos);

		// merging 2 sub lists
		// go along pairs of blocks in inputFile
		// continue until end of input

		// initialise block2 at right position
		dis2.skipBytes((int) blockSize);

		// while we haven't reached the end of the file
		while (dis1.available() > 0) {
			// if block1 is last block, copy block1 to output
			if (dis2.available() <= 0) {
				while (dis1.available() > 0)
					dos.writeInt(dis1.readInt());
				break;
			}
			// if block1 not last block, merge block1 and block2
			else {
				long block1Pos = 0;
				long block2Pos = 0;
				boolean block1Over = false;
				boolean block2Over = false;

				// data read from each block
				int e1 = dis1.readInt();
				int e2 = dis2.readInt();

				// keep going until fully examined both blocks
				while (!block1Over | !block2Over) {
					// copy from block 1 if:
					// block1 hasnt been fully examined AND
					// block1 element less than block2s OR block2 has been fully
					// examined
					while (!block1Over & ((e1 <= e2) | block2Over)) {
						dos.writeInt(e1);
						block1Pos += 4;
						if (block1Pos < blockSize & dis1.available() > 0)
							e1 = dis1.readInt();
						else
							block1Over = true;
					}
					// same for block2
					while (!block2Over & ((e2 < e1) | block1Over)) {
						dos.writeInt(e2);
						block2Pos += 4;
						if (block2Pos < blockSize & dis2.available() > 0)
							e2 = dis2.readInt();
						else
							block2Over = true;
					}
				}
			}
			// skip to next blocks
			dis1.skipBytes((int) blockSize);
			dis2.skipBytes((int) blockSize);
		}
		dis1.close();
		dis2.close();
	}
}
