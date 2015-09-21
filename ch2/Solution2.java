package ch2;
import java.util.LinkedList;
import ch2.Solution1.LinkedlistNode;

//return Kth to Last: Implement an algorithm to find the Kth to last element
//of a singly linkedlist
public class Solution2 {
	
public static class LinkedlistNode{
		public int value;
		public LinkedlistNode next;
		LinkedlistNode(int newvalue){
			this.value=newvalue;
		}
	}
	
	public static LinkedlistNode findktolast(LinkedlistNode head, int k){
		if(head!=null&&k>=1){
			for(int i=0;i<k;i++){
				//System.out.println(head);
				head=head.next;
			}
			return head;
			}
		else{
			return null;
		}
		}

	public static void main(String[] args){
		LinkedList<Integer> build = new LinkedList<Integer>();
		build.add(1);
		build.add(2);
		build.add(5);
		build.add(3);
		build.add(8);
		build.add(7);
		System.out.println(build);
		LinkedlistNode head= new LinkedlistNode(build.getFirst());
		findktolast(head, 3);
		
	}
}
