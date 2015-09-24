package ch4;
//find the next Node in given BST
public class Solution6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tTreeNode n1 = new tTreeNode(4);
		n1.left = new tTreeNode(2);
		n1.right = new tTreeNode(6);
		n1.left.left = new tTreeNode(1);
		n1.left.right = new tTreeNode(3);
		n1.right.left = new tTreeNode(5);
		n1.right.right = new tTreeNode(7);//construct a Binary Searching Tree
		System.out.println(nextvisit(n1).value);//testing line: output the next node of root
	}
	
	static public tTreeNode mostleftchild(tTreeNode n){
		tTreeNode node;
		if(n==null){
			return null;
		}
		while(n.left != null){
			node = n.left;
			n = n.left;
		}
	return n;
	}
	
	static public tTreeNode nextvisit(tTreeNode n){
		if(n.right != null){
			return mostleftchild(n.right);
		} else{
			tTreeNode x = n.parent;
			tTreeNode q = n;
			while(x!=null && x.left !=q){
				q = x;
				x = x.parent;//go up if searching is on the right subbranch
			}			
			return x;
		}
	}

}

class tTreeNode{
	int value;
	tTreeNode parent;
	tTreeNode left;
	tTreeNode right;
	
	tTreeNode(int nvalue){
		value = nvalue;
		parent = null;
		left = null;
		right = null;
	}
	
	
}