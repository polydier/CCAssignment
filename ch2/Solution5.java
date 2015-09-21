package ch2;

import java.util.LinkedList;
import java.util.ArrayList;

/*Sum Lists:you have two numbers represented by linked list, where each node contains a 
 * single digit. The digits are stored in reverse order, such that the 1's digit is at
 * the head of the list. Write a function that adds two numb and returns the sum as a 
 * linked list
 * Input (7->1->6)+(5->9->2), that is, 617+295
 * Output 2->1->9 , that is 912
 */

public class Solution5 {
	public static int reversenumformulation(LinkedList<Integer> head) {
		int sum = 0;
		for (int i = 0; i < head.size(); i++) {
			sum = (int) (head.get(i) * Math.pow(10, i));// how to return back to
														// a num not an object?
		}
		return sum;
	}// return a reversing number

	public static int formulation(LinkedList<Integer> head) {
		int sum = 0;
		while(!head.isEmpty()) {
			sum *= 10;
			sum += head.poll();
		}
//		for (int i = 0; i < head.size(); i++) {
//			sum = sum * 10 + head.get(i);// how to return back to a num not an
//											// object
//		}
		return sum;
	}// return a normal number

	public static void numprinting(int num) {
		while (num != 0) {
			System.out.printf("%s->", num % 10);
			num = num / 10;
		}
		System.out.println();
	}

	public static void reversenumprinting(int num) {
		ArrayList<Integer> storage = new ArrayList();
		int i = 0;
		while (num >= 10) {
			storage.add(num % 10);

		}
	}

	public static void main(String[] args) {
		LinkedList<Integer> build1 = new LinkedList<Integer>();
		build1.add(1);
		build1.add(2);
		build1.add(3);
		//numprinting(formulation(build1));
		LinkedList<Integer> build2 = new LinkedList<Integer>();
		build2.add(2);
		build2.add(3);
		build2.add(1);
		//numprinting(formulation(build1));
		int sum = formulation(build1) + formulation(build2);
		System.out.println(sum);
		numprinting(sum);
	}
}
