package ch5;
//given a positive integer, print the next smallest and the next largest number 
//that have the same number of 1 bits in their binary representation

//note: this code I have refered to the book
public class Solution4 {

	public static void main(String[] args){
		//如何输入一个binary的数字
	}
	
	public static int getNext(int n){
		int c=n;
		int c0=0;
		int c1=1;
		
		while(((c& 1)==0) && (c!=0)){
			c0++;
			c>>=1;
		}
		
		while((c &1)!=0){
			c1++;
			c>>=1;
		}
		
		if(c0+c1==31 || c0+c1==0){
			return -1;
		}
		
		int p=c0+c1;
		c |= (1<<p);//把最低位的0置1
		c &= ~((1<<p)-1);//把右边位全部置0
		c |= ((1<<c1)-1);//把低位的全部置1
		
		return c;
	}
	
	public static int Prv(int n){
		int c = n;
		int c0 = 0;
		int c1 = 0;
		while(((c&1)==0) && (c!=0)){
			c0++;
			c>>=1;
		}
		while((c&1)!=0){
			c1++;
			c>>=1;
		}
		
		int p = c0+c1;
		c &= (~0)<<p;//把后面先全部置为0
		int mask = (1<<(c1+1))-1;
		c |= mask <<(c0-1);
		
		return c;
		
	}
}

