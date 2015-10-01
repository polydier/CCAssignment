package ch10;
import java.lang.*;
//in a array, "peak" is greater than or equal to adjacent numbers
//"valley" is less than or equal to adjacent numbers
//sort array into alternating peaks and valleys
public class Solution11 {
	public static void main(String[] args){
		int arry[]={1,2,3,4,5};
		sortpeakvalley(arry);
		printing(arry);
	}


static void sortpeakvalley(int[] arry){
	int l = arry.length;
	for(int i = 0; i<l; i+=2){
		int max = maxindex(arry, i-1, i , i+1);
		if(i!=maxindex(arry,i-1,i,i+1)){
			swap(arry, i , max);
		}
	}
}

static void printing(int[] arry){
	for(int i =0; i<arry.length;i++){
		System.out.println(arry[i]);
	}
}

static void swap(int[] arry, int i, int j){
	int swap = arry[i];
	arry[i] = arry[j];
	arry[j] = swap;
}

static int maxindex(int[] arry, int a, int b, int c){
	int len = arry.length;
	int avalue = a>=0 && a<len?arry[a]:Integer.MIN_VALUE;
	int bvalue = b>=0 && b<len?arry[b]:Integer.MIN_VALUE;
	int cvalue = c>=0 && c<len?arry[c]:Integer.MIN_VALUE;
	
	int max = Math.max(avalue, Math.max(bvalue,cvalue));
	if(avalue==max) return a;
	else if(bvalue==max) return b;
	else return c;
}
}