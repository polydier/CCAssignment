package ch5;
//write function to determine the num of bits you would need to flip to convert 
//Integer A to Integer B
//11101,01111 output:2
public class Solution6 {
	public static void main(String[] args){
		
	}
	
	//the first method to check the flipping output
	static public int checkchange(int n1, int n2){
		int count=0;
		while(n1!=0 | n2!=0){
			if((n1&1)!=(n2&1)){
				count++;
			}
			n1>>=1;
			n2>>=1;
		}
		return count;
	}
	
	//the second method to check the flipping output
	static public int checkchange2(int n1, int n2){
		int count=0;
		int mul=n1^n2;
		while(mul!=0){
			count++;
			mul>>=1;
		}
		return count;
	}
}
