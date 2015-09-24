package ch3;

import java.util.Stack;

//sort a stack such the smallest items are on the top; can use additional temporary stack
public class Solution5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = { 1, 2, 3, 4, 6, 5 };
		myStack myss = new myStack();
		for (int i = 0; i < data.length; i++) {
			myss.push(data[i]);// put num into array
		}
		System.out.println(myss.sort());
	}
	// ?always return NullPointerException
}

class myStack {
	public Stack<Integer> temp;
	public Stack<Integer> inuse;

	public myStack() {
		temp = new Stack<Integer>();
		inuse = new Stack<Integer>();
	} // build two stack, one is in user, one is for storing temporary nums

	public void pop() {
		inuse.pop();
	}

	public void push(int value) {
		inuse.push(value);
	}

	public boolean isEmpty() {
		return inuse.isEmpty();
	}

	public int peek() {
		return inuse.peek();
	}

	public int sort() {
		int minimum = 100;//suppose that all the nums will not be bigger than 100?
		if(temp.isEmpty()){
			minimum = inuse.peek();//if this is the first comparision, then the minimum is the top num in Stack
			//System.out.println(minimum);
		}
		while(!inuse.isEmpty()) {
			minimum = (minimum> inuse.peek()) ? inuse.peek():minimum;
			temp.push(inuse.pop());
			}
		return minimum;
	}
}
