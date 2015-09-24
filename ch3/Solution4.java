package ch3;
import java.util.Stack;
//Implement a MyQueue class which implements a queue using two stacks
//clue:queue moves the oldest one but stack moves newest one
//
public class Solution4 {
	public class Queue{
		public Stack oldStack;
		public Stack newStack;
		int size;
		int topElement;	
		
		public Queue(){
		newStack = new Stack<Integer>();
		oldStack = new Stack<Integer>();
		//size = -1;
		//topElement =-1;
	  }
		
		public void transfer(){
			if(oldStack.isEmpty()) {
				while(!newStack.isEmpty()){
					oldStack.push(newStack.pop());
				}
			}
		}
		
		public void remove(){//pop the top element in the oldStack,transfer from newStack firstly
			this.transfer();	//ensure there is element in the oldStack			
			//return oldStack.peek();
			oldStack.pop();
			}
		
	
		public void add(int nvalue){//push the new element in the newStack
			newStack.push(nvalue);
			}

		public Object peek(){//return to the oldest value in the array
			this.transfer();
			return oldStack.pop();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {0,1,2,3,4,5};
		Solution4.Queue myque  =  new Solution4().new Queue();
		for(int i = 0; i< data.length; i++) {
			myque.add(i);//put num into array
		}
		System.out.println(myque.peek());
		
	}

}
