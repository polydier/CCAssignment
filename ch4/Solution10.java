package ch4;
//given a binary search tree with distinct elements, print all possible 
//arrays that could have led to this tree
public class Solution10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tTreeNode n1 = new tTreeNode(4);
		n1.left = new tTreeNode(2);
		n1.right = new tTreeNode(6);
		n1.left.left = new tTreeNode(1);
		n1.left.right = new tTreeNode(3);
		n1.right.left = new tTreeNode(5);
		n1.right.right = new tTreeNode(7);//construct a Binary Searching Tree
		System.out.println(findcommonNode(n1,n1.right));
	}

	static boolean findcommonNode(tTreeNode root, tTreeNode q){//q is the root of BST2 that I want to compare
		if(root == null){return false;}
		else if(root.value == q.value && CompareTree(root,q)){
			return true;
		}
		return findcommonNode(root.left,q)||findcommonNode(root.right,q);
	}
	
	static boolean CompareTree(tTreeNode p, tTreeNode q){
		if(p==null && q==null){
			return true;
		}else if(p==null || q==null){
			return false;//if one becomes empty and another have elements, not identical
		}else if(p.value==q.value){
			return true;
		}
		return CompareTree(p.left,q.left)&&CompareTree(p.right,q.right);
	}
}
