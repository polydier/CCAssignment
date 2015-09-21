package ch2;
import java.util.LinkedList;// import class
import java.util.Hashtable;

//write code to remove duplicates from an unsorted linked list
//is to establish the HashTable to see if the element has been existed, if contains, then 
//skip it; if not contained, just add it to the table
public class Solution1 {
	
	public static class LinkedlistNode{
		public int value;
		public LinkedlistNode next;
		LinkedlistNode(int newvalue){
			this.value=newvalue;
		}
	}
	
	public static void deletedup(LinkedlistNode head){
		Hashtable<Integer,Boolean> build= new Hashtable<Integer,Boolean>();
		LinkedlistNode previous=null;
		if(head!=null){
			if(build.containsKey(head.value)){
				previous.next=head.next;
			}else{
				build.put(head.value,true);
				previous=head;
			}
			head=head.next;
		}//define one previous as null first as the pointer,学会移动指针	
	}
	
	public static void main(String[] args){
		LinkedList<Integer> lList = new LinkedList<Integer>();
		lList.add(1);
		lList.add(2);
		lList.add(5);
		lList.add(5);
		lList.add(3);
		System.out.println(lList);
		LinkedlistNode head = new LinkedlistNode(lList.getFirst());
		deletedup(head);
		System.out.println(lList);
	}
	
}
