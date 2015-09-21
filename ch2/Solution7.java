package ch2;
//given two linked lists, determine if the two lists intersect

public class Solution7 {
		 class LinkedlistNode{//define nodes
			 int value;
			 LinkedlistNode next;
			 LinkedlistNode(int nvalue){
				 value = nvalue;
			 }
		 }
		 
		 public LinkedlistNode findintersection(LinkedlistNode l1, LinkedlistNode l2){
			 LinkedlistNode shorter = listsize(l1)>listsize(l2) ? l2 : l1;
		     LinkedlistNode longer = listsize(l1)>listsize(l2) ? l1 : l2;//define the different node as shorter or longer
		     int distance = listsize(longer)-listsize(shorter);//get the distance of two lists
             LinkedlistNode newlonger = movelongernode(longer,distance);
             
             //compare the two lists from the same position
             while(shorter!=null){
            	 if(newlonger != shorter){
            		 shorter = shorter.next;
            		 newlonger = newlonger.next;
            	 }else{
            		 return shorter;
            	 }
             }
             return null;
		 }
        
		 public int listsize(LinkedlistNode n){
			 int size = 0;
			 if(n==null){
				 return 0;
			 }
			 while(n!=null){
				 size ++;
				 n = n.next;
			 }
			 return size;
		 }
		 
		 public LinkedlistNode movelongernode(LinkedlistNode n, int move){
			 //move longer list the same position to short list
			 while(move>=0){
				 n = n.next;
				 move--;
			 }
			 return n;
		 }
	}
