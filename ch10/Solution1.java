package ch10;

public class Solution1 {
	public static void main(String[] args){
		int a[]=new int[20];
		a[0]=1;
		a[1]=3;
		a[2]=5;
		int[] b={2,4};
        print(merge(a,b,3,2));
		//print(a);
	}
	
	static void print(int[] a){
		for(int i=0;i<a.length-1;i++){
			System.out.println(a[i]);
		}
	}
	
	static int[] merge(int[] a, int[] b, int lastNum, int firstNum){
		int indexA = lastNum-1;
		int indexB = firstNum -1;
		int MergeNum = lastNum+firstNum-1;
		//System.out.println(MergeNum);
		while(indexB>=0){
			if(a[indexA]>b[indexB] && indexA>=0){
				a[MergeNum]=a[indexA];
				indexA--;
			}
			else{
				a[MergeNum]=b[indexB];
				indexB--;
			}
			MergeNum--;
		}
		return(a);
	}
}
