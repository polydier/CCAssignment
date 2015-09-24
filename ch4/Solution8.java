package ch4;
//design algorithm to find the first common ancestor of two nodes in a binary tree
//avoid storing additional nodes in a data structure
public class Solution8 {
	static void main(String[] args){
	tTreeNode n1 = new tTreeNode(4);
	n1.left = new tTreeNode(2);
	n1.right = new tTreeNode(6);
	n1.left.left = new tTreeNode(1);
	n1.left.right = new tTreeNode(3);
	n1.right.left = new tTreeNode(5);
	n1.right.right = new tTreeNode(7);//construct a Binary Searching Tree
	System.out.println(CommonAncestor(n1.left,n1.right).value);//testing line: output the next node of root
	}
	
	static tTreeNode CommonAncestor(tTreeNode p, tTreeNode q){
		if(p==q){return p;}
		tTreeNode test = p;
		while(test!=null){
			if(isOnPath(test,q)){
				return test;
			}	
			test=test.parent;
		}
		return null;
	}
	
	static boolean isOnPath(tTreeNode Ancestor, tTreeNode q){//judge whether the q is sub of Ancestor
		while(q!=null && q!=Ancestor ){
			q=q.parent;
		}
		return Ancestor==q;
	}
}


	