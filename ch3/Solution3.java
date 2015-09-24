package ch3;

import ch3.Solution2.MyStack.StackNode;

//stack of plates. if stack too high, it topple. Thus we start a new stack when 
//previous exceeds threshold. Implement SetOfStack that mimics this.
//SetOfStack should composed of stacks and create a new stack once the previous one exceeds.
//SetOfStack.push() and SetOf Stacks.pop() should behave identically to a single stack.
//Implement a function popAt which performs a pop operation on a specific sub-stack.
public class Solution3 {
	public static class MyStack <Integer>{
		public static class StackNode<Integer>{
			public int data;
			StackNode next;	
			public StackNode(int nvalue){
				this.data=nvalue;
			}
		}
		StackNode top=null;//the top element of the stack
		int size=0;//the number of elements in stack
		int Capacity;//the capacity of elements in stack
		public MyStack(int ncapacity){
			Capacity = ncapacity;
		}//contruction function
		
		public int getdata(StackNode n){
			return n.data;
		}//get the value of stackNode
		public int pop(){
			int ndata = this.top.data;
			this.top=this.top.next;
			size--;
			return ndata;
		}//pop top element out
		
		public boolean isfull(){
			return size==Capacity;
		}
		
		public void push(int nvalue){
			if(this.size<this.Capacity){
				StackNode Node = new StackNode(nvalue);
				Node.next=this.top;
				Node = this.top;
				size++;
				//return true;
			}else {
				//return false;
				size = 0;
				MyStack nstack = new MyStack(5);//construct a new one if the original is full
				StackNode Node = new StackNode(nvalue);
				Node.next=this.top;
				Node = this.top;
				size++;
			}
		}
		
		public static void main(String[] args){
			MyStack sstack = new MyStack(3);
			sstack.push(1);
			sstack.push(2);
			sstack.push(3);
			//sstack.push(4);
			//int popnum = sstack.pop();
			
			//System.out.println(sstack.getdata(top));
		}
	}
}
