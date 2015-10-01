package ch10;
import java.io.*;
import java.util.Scanner;

//given input file with four billion non-negative integers, provide an algorithm
//to generate an integer that is not contained in the file.
//Assume you have 1GB of memory available for this task
public class Solution7 {
	public static void main(String[] args){
		static long numberofInts = ((long)Integer.MAX_VALUE)+1;
		static byte[] bitfield = new byte[(int)(numberofInts >> 3)];
		findOpenNumber();
		
		static void findOpenNumber() throws FileNotFoundException{
			Scanner in = new Scanner(new FileReader("demo.txt"));//build pointer to the file
			while(in.hasNextInt()){
				int n = in.nextInt();
				bitfield[n>>3]|=1<<(n & 7);//find the place that we want to put num
			}

			for(int i = 0; i < bitfield.length;i++){
				for(int j =0;j<8;j++){
					if((bitfield[i]&(1<<j))==0){//if the place is zero, means we do not have the num
						System.out.println(i*8+j);
						return;
					}
				}
			}
	}
}

