package ch4;

import java.util.LinkedList;
import java.util.ArrayList;

//given a binary tree, creates a linked list of all the nodes at each depth
//level tranversing: set size to record the number of this level, 
//set presize to record the upper level
public class Solution3 {
	public static void main(String[] args) {
		BinaryTree MyTree = new BinaryTree();
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		MyTree.root = MyTree.bBinaryTree(arr, 0, arr.length - 1);// construct a
																	// binary
																	// tree for
																	// testing
		MyTree.treeprinting(MyTree.root);
		print(levelLinkedList(MyTree.root));

	}

	public static ArrayList<LinkedList<TreeNode>> levelLinkedList(TreeNode root) {
		ArrayList<LinkedList<TreeNode>> result = new ArrayList<LinkedList<TreeNode>>();// construct
																						// the
																						// result
																						// storing
		int presize = 1;
		int size = 0;
		ArrayList<TreeNode> temp = new ArrayList<TreeNode>();// Array to store
																// the treenode
																// before
																// Linkedlist
		temp.add(root);
		while (!temp.isEmpty()) {
			presize = temp.size();
			LinkedList<TreeNode> current = new LinkedList<TreeNode>();
			while (presize > 0) {
				TreeNode forpop = temp.remove(0);// 一直把Array中的元素pop出来
				current.push(forpop);// 将temp中的元素push到linkedlist中
				if (forpop.left != null) {
					temp.add(forpop.left);// 把元素的左孩子push到ArrayList中
					size++;
				}
				if (forpop.right != null) {
					temp.add(forpop.right);// 把右孩子push到ArrayList中
					size++;
				}
				presize--;
			} // 把所有ArrayList中的暂时存入元素全部pop出来
			result.add(current);
		}
		return result;
	}

	public static void print(ArrayList<LinkedList<TreeNode>> n) {
		int sizeArray = n.size();
		for (int i = 0; i < sizeArray; i++) {
			int linkedsize = n.get(i).size();
			for (int j = 0; j < linkedsize; j++) {
				System.out.print(n.get(i).get(j).value + "->");
			}
			System.out.println();
		}
	}
}
