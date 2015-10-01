package ch10;
//you have array with all numbers from 1 to N, where N is at most 32000
//The array may have duplicate arrays that you may not know where N is
//With only 4 kilobytes memory available, how would you print all the 
//duplicate elements in the array?

//I want to set up the hashset to store the number, if the element has appeared,
//just print it out.
public class Solution8 {
	 static public void main(String[] args){
		 
	 }
	
void CheckDuplicate(int[] arry){
	BitSet bs = new BitSet(32000);
	for(int i=0;i<arry.length;i++){
		int num = arry[i];
		int num0 = num-1;//is the number we locate in BitSet
		if(bs.get(num0)){
			System.out.println(num);
		}else{
			bs.set(num0);
		}
	}
}
}




class BitSet{
	int[] bitset;
	
	public BitSet(int size){
		bitset = new int[(size>>5)+1];
	}
	
	boolean get(int pos){
		int bigNum = (pos>>5);//set the num on big location
		int smallNum =(pos%32);
		return(bitset[bigNum] & (1<<smallNum))!=0;
	}
	
	void set(int pos){
		int bigNum = (pos>>5);
		int smallNum = (pos%32);
		bitset[bigNum]=bitset[bigNum]|(1<<smallNum);
	}
}