package ch5;
import java.util.lang;
//note: I write two methods on this problem, this is the first one, but not concise enough, I build another code.
//you can score depending on the one you think better
//you have an integer and you can flip exactly one bit from 0 to 1
//write a code to find the length of longest sequence of 1s you could create
public class Solution3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// we calculate the amount of an array of same number, ST:1111=4*1=4
	// 00000=00000   11001111111000--2007000
	public static String longestone(int num) {
		StringBuilder arry = new StringBuilder();
		int LENGTH = 32;
		int count = 0;
		for (int i = 0; i < LENGTH; i++) {
			if(i==LENGTH-1){
				if(getbit(num,i-1)==false & getbit(num,1)==true){
					arry.append(1);
				}else if(getbit(num,i-1)==true & getbit(num,1)==true){
					arry.append(count+1);
				}
			}
			if (thesame(num, i)) {//if the ith and (i+1)th is the same
				if (getbit(num, i)) {// if the ith is 1
					count++;
				} else {// if the ith is 0
					arry.append(0);
				}
			} else {//if the ith and (i+1)th is different
				if(getbit(num,i)){//if the ith is 1, (i+1)th is 0
					arry.append(count);
					count=0;
				}else{//if the ith is 0, (i+1)th is 1
					arry.append(0);
				}
			}
		}
		return arry.toString();
	}

	public static int findlongest(String num){
		int i=Integer.parseInt(num);
		int length = num.length();
		int store[] = new int[length];
		for(int j=0;j<length;j++){
			store[j]=i/(int)(Math.pow(10, (length-1-i)));
		}
		
		//when we get arry like 30002010002,judge what is the largest number 
		boolean judge=true;//record whether the num before 0 is number bigger than 0 ot not
		int count=0;
		int max=0;
		for(int k=0;k<length;k++){
			if(store[k]==0){
				if(judge){
					if()
				}else{
					k++;
				}
			}else{// when the num is not 0 
				judge = true;
				count=store[k];
				
			}
		}
	}
	
	
	public static boolean thesame(int num, int i) {// judge whether the first
													// num is same as the second
													// num
		if (getbit(num, i) == getbit(num, i + 1)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean getbit(int num, int i) {
		return (num & (1 << i)) != 0;
	}

}
