package ch4;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.LinkedList;

//given a directed graph, design an algorithm to find out
//whether there is a route between two nodes
public class Solution1 {
	public static void main(String[] args) {
		graph Mygraph = new graph();
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		Node node7 = new Node(7);
		Node node8 = new Node(8);
		ArrayList<Node> list1 = new ArrayList<Node>();
		ArrayList<Node> list2 = new ArrayList<Node>();
		ArrayList<Node> list3 = new ArrayList<Node>();
		ArrayList<Node> list4 = new ArrayList<Node>();
		ArrayList<Node> list5 = new ArrayList<Node>();
		ArrayList<Node> list6 = new ArrayList<Node>();
		ArrayList<Node> list7 = new ArrayList<Node>();
		list1.add(node2);
		list1.add(node3);
		list2.add(node4);
		list2.add(node5);
		list3.add(node6);
		list3.add(node7);
		list4 = null;
		list5 = null;
		list6 = null;
		list7 = null;
		node1.adjacentnode = list1;
		node2.adjacentnode = list2;
		node3.adjacentnode = list3;
		node4.adjacentnode = list4;
		node5.adjacentnode = list5;
		node6.adjacentnode = list6;
		node7.adjacentnode = list7;
		boolean result = Mygraph.search(node2, node3);
		System.out.println(result);
	}

}

enum State {
	Unvisited, Visited, Visiting;
}

class graph {

	LinkedList<Node> q = new LinkedList<Node>();// set q as the points will
												// visit next
	public boolean search(Node start, Node end) {// BSF
		if (start == end) {
			return true;
		}
		q.add(start);
		start.vi = State.Visiting;
		while (!q.isEmpty()) {
			Node u = q.removeFirst();
			System.out.println(u.label);//testing
			if (u.adjacentnode != null) {
				for (Node v : u.adjacentnode) {// traverse all the adjacent
					if (v == end) {
						return true;
					} else {
						q.add(v);
					}
					v.vi = State.Visiting;
				}
				u.vi = State.Visited;
			}
		}
		return false;
	}

}

class Node {
	int label;// the num of node
	ArrayList<Node> adjacentnode;
	State vi = State.Unvisited;

	public Node(int nlabel) {
		label = nlabel;
	}
}

/*
 * public void initgraph() { //Node node1,node2,node3,node4,node5,node6,node7;
 * Node node1 = new Node(1); Node node2 = new Node(2); Node node3 = new Node(3);
 * Node node4 = new Node(4); Node node5 = new Node(5); Node node6 = new Node(6);
 * Node node7 = new Node(7); Node node8 = new Node(8); ArrayList<Node> list1 =
 * new ArrayList<Node>(); ArrayList<Node> list2 = new ArrayList<Node>();
 * ArrayList<Node> list3 = new ArrayList<Node>(); ArrayList<Node> list4 = new
 * ArrayList<Node>(); ArrayList<Node> list5 = new ArrayList<Node>();
 * ArrayList<Node> list6 = new ArrayList<Node>(); ArrayList<Node> list7 = new
 * ArrayList<Node>(); list1.add(node2); list1.add(node3); list2.add(node4);
 * list2.add(node5); list3.add(node6); list3.add(node7); list4=null; list5=null;
 * list6=null; list7=null;
 * 
 * 
 * } }
 */
