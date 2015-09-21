package ch2;

import java.util.LinkedList;
import java.util.Scanner;

//import ch2.Solution2.LinkedlistNode;

/* Write code to partition a linked list around a value x,
 * such that all nodes less than x before all nodes greater than or equal to x
 * If x is contained within the list, the value of x only need to be 
 * after the elements less than x(see below)
 * Input 3->5->8->5->10->2->1[Partition=5]
 * Output 3->1->2->10->5->5->8
 */
public class Solution4 {
	
    public static class LinkedlistNode{
		public int value;
		public LinkedlistNode next;
		LinkedlistNode(int newvalue){
			this.value=newvalue;
		}
    }
    
    public static LinkedlistNode partition(LinkedlistNode node, int compare){
    	LinkedlistNode head = node;
    	LinkedlistNode tail = node;  	
    	while(node != null){
    		LinkedlistNode next = node;
    		if(node.value < compare){
    			node.next = head;
    			head = node;
    		}
    		if(node.value >= compare){
    			tail.next = node;
    			tail = node;
    		}
    		node = next;
    	}
    	tail.next = null;
    	return head;
    }
	
    public static void printing(LinkedlistNode head){
    	System.out.print(head.value);
    	head=head.next;
    	while(head!= null){
    		System.out.print("->"+head.value);
    		head = head.next;
    	}
    }
    
   public static void main(String[] args){
	  // System.out.println("please input the comparing number:");
	  // Scanner in1 = new Scanner(System.in);
	   //int input1 = in1.nextInt();
	   Scanner in = new Scanner(System.in);
	   String input = in.nextLine(); 
		String[] split = input.split("\\-\\>");
		LinkedlistNode head = null;
		LinkedlistNode tail = null;
		 for(String s : split){
			 if(head == null){
				 head = new LinkedlistNode(Integer.parseInt(s));
				 tail = head;
			 }else{
				 LinkedlistNode temp = new LinkedlistNode(Integer.parseInt(s));
				 tail.next = temp;
				 tail = temp;
			 }
		 }
		 tail.next = null;
		 

		 LinkedlistNode test = partition(head,4);
		 System.out.println(test.value);
		 //printing(partition(head,5));
		 
   }
}
