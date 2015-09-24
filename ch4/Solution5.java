package ch4;
import java.lang.Math;
//Implement a function to check if a binary search tree
public class Solution5 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		compareNode root = new compareNode(4);
		root.left = new compareNode(2);
		root.right = new compareNode(6);
		root.left.left = new compareNode(1);
		root.left.right = new compareNode(3);
		root.right.left = new compareNode(5);
		root.right.right = new compareNode(7);
		boolean result = isSearchBinary(root, treemin(root), treemax(root));
		System.out.println(result);
	}

	static boolean isSearchBinary(compareNode n, int min, int max){
		if(n==null){
			return true;
		}
		if((n!=null && n.value<treemin(n.left)) || (n!=null && n.value>treemax(n.right))){
			return false;
		}
		if(!isSearchBinary(n.left,treemin(n),n.value)||(!isSearchBinary(n.right,n.value,treemax(n)))){
			return false;
		}
		
		return true;
	}
	
	static int treemax(compareNode n){
		if(n.left == null && n.right == null){
			return n.value;
		}else{
			return Math.max(Math.max(n.min, n.value),Math.max(n.value, n.max));
		}	
	}
	
	static int treemin(compareNode n){
		if(n.left == null && n.right == null){
			return n.value;
		}else{
			return Math.min(Math.min(n.min, n.value),Math.min(n.value, n.max));
		}
	}
}

class compareNode{
	int value;
	compareNode left;
	compareNode right;
	int min;
	int max;

	public compareNode(int nvalue) {
		value = nvalue;
		left = null;
		right = null;
	}
	
}