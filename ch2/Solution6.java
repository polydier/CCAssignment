package ch2;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

import ch2.Solution4.LinkedlistNode;

//implement a function to check if a linked list is a palindrome
public class Solution6 {
	class LinkedlistNode<Integer> {
		int data;
		LinkedlistNode<Integer> next;

		LinkedlistNode(int ndata) {
			this.data = ndata;
		}
	}

	public static boolean ispalindrome(LinkedlistNode build1) {
		Stack<Integer> buildline = new Stack<Integer>();
		LinkedlistNode fast = build1;
		LinkedlistNode slow = build1;
		if (fast != null && build1.next != null) {
			buildline.push(slow.data);
			slow = slow.next;
			fast = fast.next.next;
		}
		// after the buildline of stack storing all the values in LinkedList, we
		// start
		// to compare the nodes starting from the slow and poping one from the
		// stack
		while (slow != null) {
			if (buildline.pop().intValue() != slow.data) {
				return false;
			}
			slow = slow.next;
		}
		return true;
	}

	public static void main(String[] args){
		   Scanner in = new Scanner(System.in);
		   String input = in.nextLine(); 
			String[] split = input.split("\\-\\>");
			LinkedlistNode head = null;
			LinkedlistNode tail = null;
			 for(String s : split){
				 if(head == null){
					 int i = Integer.parseInt(s);
					 //head = new LinkedlistNode<Integer>(i);
					 tail = head;
				 }else{
					 int i = Integer.parseInt(s);
					 Solution6.LinkedlistNode<Integer> temp = new Solution6.LinkedlistNode<Integer>(i);
					 tail.next = temp;
					 tail = temp;
				 }
			 }
			 System.out.println(ispalindrome(head));
		}
}
