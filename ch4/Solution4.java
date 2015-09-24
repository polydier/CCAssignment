package ch4;
import java.lang.Math;
//check the balance. 
public class Solution4 {

	public static void main(String[] args) {
		bnBinaryTree MyTree = new bnBinaryTree();
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		MyTree.root = MyTree.bBinaryTree(arr, 0, arr.length - 1);// construct a tree															
        boolean result = ifbalence(MyTree.root);
        System.out.println(result);
	}

	public static boolean ifbalence(newTreeNode n){
		if(n.left==null && n.right==null) {
			n.height = 0;
		}		
		if(Math.abs(n.left.height - n.right.height)>1 ){
			return false;
		}
		n.height = Math.max(n.left.height, n.right.height)+1;
		return true;
	}
}

 class newTreeNode {
	int value;
	int height;
	newTreeNode left;
	newTreeNode right;

	public newTreeNode(int nvalue) {
		value = nvalue;
		left = null;
		right = null;
	}
}

class bnBinaryTree {
	newTreeNode root;
	newTreeNode bBinaryTree(int[] arr, int start, int end) {
		if (end < start) {
			return null;
		}
		int Middle = (start + end) / 2;
		newTreeNode n = new newTreeNode(arr[Middle]);
		n.left = bBinaryTree(arr, start, Middle - 1);
		n.right = bBinaryTree(arr, Middle + 1, end);
		return n;
	}
}
