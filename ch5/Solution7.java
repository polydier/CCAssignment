package ch5;
//write a program to swap odd and even bits in an integer with as few instructions as possible
//bit 0 and bit 1 are swapped, bit 2 and bit 3 are swapped, and so on
public class Solution7 {

	public static void main(String[] args) {
		
		
	}
// we can just mask all the even nums and all the odd nums and make logic move to them
	public static int swapOddEvent(int x){
		return ((x & 0xaaaaaaaa)>>>1) | (x & 0x55555555)<<1 ;
	}
}
