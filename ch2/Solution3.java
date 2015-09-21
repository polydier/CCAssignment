package ch2;
//Delete middle Node:Implement an algorithm to delete a node in the middle of a singly
//Linkedlist. Given only access to that node.
//input the node c from the linked list a->b->c->d->e
//nothing is returned, but new linkedlist is a->b->d->e

//import ch2.Solution2.LinkedlistNode;
import java.util.LinkedList;

public class Solution3 {
	
    public static void printing(LinkedList head){
    	System.out.print(head.get(0));
    	for(int i =1; i<head.size(); i++){
    		System.out.printf("->%s", head.get(i));
    	}
    	System.out.println();
    }
    
    public static void main(String[] args){
		LinkedList<String> build = new LinkedList<String>();
		build.add("a");
		build.add("b");
		build.add("c");
		build.add("d");
		build.add("e");
		build.add("f");
		printing(build);
		int n = build.size()/2;
		Object obj=build.remove(n);
		printing(build);
	}
}
