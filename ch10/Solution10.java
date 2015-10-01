package ch10;
import java.util.ArrayList;
//rank from stream
public class Solution10 {
	static public void main(String[] args){
		ArrayList<Integer> a= new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		System.out.println(getnum(a,2));
	}
	
	static int getnum(ArrayList<Integer> a, int n){
		a.toArray();
		for(int i=0;i<=a.size()-1;i++){
			if(n<a.get(i)){
				insert(a,n,i);
				return i+1;
			}
		}
		return a.size();
	}
	
	static void insert(ArrayList<Integer> a,int n,int i){//i is the rank you insert num
		for(int j = a.size(); j>i; j--){
			a.set(j, a.get(j-1));
		}
		a.set(i, n);
	}
}

