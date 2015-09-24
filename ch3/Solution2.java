package ch3;

//how would design a stack which, in addition to push and pop, has a function min
//which return the minimum element? push, pop and min should all operate in o(1) time
public class Solution2 {
	public static class MyStack <Integer>{
		public static class StackNode<Integer>{
			private int data;
			StackNode next;	
			public StackNode(int nvalue){
				this.data=nvalue;
			}
		}
		
		int minimum;//the minimum value of Stack
		StackNode top;
		
		public void push(int nvalue){ //push new Node to it
			if(this==null) {
				this.minimum = nvalue;
			}else{
				this.minimum = (this.minimum>nvalue) ? nvalue: this.minimum; 
			}
			StackNode t = new StackNode(nvalue);
			t.next = top;
			top = t;
		}
		public StackNode peek(){
			return top;
		}
		
		public void pop(){  //delete the top Node on it 
			if(this.top.data == this.minimum){
				this.minimum = this.min();
			}	
			this.top.data= this.top.next.data;
			this.top.next= this.top.next.next;
		}
		
		public int min(){
			StackNode<Integer> head = this.peek();
			int min = head.data;
			while(head.next != null){
			    if(min <= head.next.data){
			    	head = head.next;
			    }else {
			    	return head.data;
			    }
			}
			return min;
		}
	}
	public static void main(String[] args){
		MyStack outer = new MyStack();
		outer.push(1);
		//outer.push(2);
		System.out.println(outer.top.data);
		System.out.println("the minimum is:"+outer.minimum);
	}
}
