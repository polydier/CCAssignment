package ch5;
//andrew ID:dzhu1
//import java.io.*;
import java.util.Scanner;
// given two 32-bit numbers, N and M, and two bit positions.
public class Solution1 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		String[] input = (s.split(" "));
		int newinput[] = new int[4];
		for(int i=0;i<4;i++){
			newinput[i]=Integer.parseInt(input[i]);
		}
		System.out.println(insert(newinput[0],newinput[1],newinput[2],newinput[3]));
		in.close();
	}
	
	public static int insert(int N, int M, int j, int i){
		int mask = (~(-1>>>(31-j)))|((1<<i)-1);
		System.out.println("mask+"+mask);
		int tmpN=N&mask;
		System.out.println("tmpN+"+tmpN);
		int tmpM=M<<i;
		System.out.println("tmpM+"+tmpM);
		return tmpN|tmpM;
	}
}
