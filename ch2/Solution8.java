package ch2;

import java.util.Scanner;

import ch2.Solution6.LinkedlistNode;

//import ch2.Solution7.LinkedlistNode;

public class Solution8 {
	 class LinkedlistNode{//define nodes
		 int value;
		 LinkedlistNode next;
		 LinkedlistNode(int nvalue){
			 value = nvalue;
		 }
	 }
	 
	 public LinkedlistNode runner(LinkedlistNode line){
		 LinkedlistNode faster = line;
	     LinkedlistNode slower = line;
	     while(faster!=null && faster.next !=null){
	    	 faster=faster.next.next;
	    	 slower=slower.next;
	    	 if(faster == slower){
	    		 break;
	    	 }
	     }
	     
	     if(faster ==null || faster.next == null){
	    	 return null;
	     }
	     
	     slower = line;
	     if(slower != faster){
	    	 slower = slower.next;
	    	 faster = faster.next;
	     }
	     return faster;
	 }
	 
	
}