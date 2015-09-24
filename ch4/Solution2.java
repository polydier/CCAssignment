package ch4;

public class Solution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree MyTree = new BinaryTree();
		int[] arr = { 1, 2, 3, 4, 5, 6,7 };
		MyTree.root=MyTree.bBinaryTree(arr, 0, arr.length-1);
		//System.out.println(MyTree.root.value);
		MyTree.treeprinting(MyTree.root);
	}
}

class TreeNode {
	int value;
	TreeNode left;
	TreeNode right;

	public TreeNode(int nvalue) {
		value = nvalue;
		left = null;
		right = null;
	}
}

class BinaryTree {
	TreeNode root;

	TreeNode bBinaryTree(int[] arr, int start, int end) {
		if (end < start) {
			return null;
		}
		int Middle = (start + end) / 2;
		TreeNode n = new TreeNode(arr[Middle]);
		n.left = bBinaryTree(arr, start, Middle - 1);
		n.right = bBinaryTree(arr, Middle + 1, end);
		return n;
	}

	public void treeprinting(TreeNode n){
		if(n!=null){
		System.out.println(n.value);
		treeprinting(n.left);
		treeprinting(n.right);
		}
	}
}
