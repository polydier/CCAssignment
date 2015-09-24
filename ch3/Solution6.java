package ch3;

import java.util.LinkedList;

//get the oldest animal in dog or cat
public class Solution6 {

	public static void main(String[] args) {
		//define objects of dogs and cats that I want to add in
		dog dog1 = new dog("Honey");
		dog dog2 = new dog("Hashiqi");
		dog dog3 = new dog("Samo");
		cat cat1 = new cat("Bosi");
		cat cat2 = new cat("Black");
		Animalqueue animal =  new Animalqueue();
		animal.Cats.addLast(cat1);
		animal.Dogs.addLast(dog1);
		animal.Cats.addLast(cat2);
		animal.Dogs.addLast(dog2);
		animal.Dogs.addLast(dog3);
		System.out.println(animal.dequeueDogs().name);
		System.out.println(animal.dequeueCats().name);
	}

}

class Animal {
	int order;
	String name;

	public int getorder() {
		return order;
	}

	public void setorder(int value) {
		order = value;
	}

	public boolean isolderthan(Animal a) {
		return this.order > a.order;
	}

	Animal(String n) {
		name = n;
	}
}

class Animalqueue {
	private int order =0;
	LinkedList<dog> Dogs = new LinkedList<dog>();
	LinkedList<cat> Cats = new LinkedList<cat>();

	public void enqueue(Animal a) {
		a.setorder(order);
		order++;// define the order of the animal in the queue

		if (a instanceof dog) {
			Dogs.addLast((dog) a);
		} else if (a instanceof cat) {
			Cats.addLast((cat) a);
		}
	}

	public Animal dequeueAny() {
		dog doglast = Dogs.peek();
		cat catlast = Cats.peek();
		if (doglast.isolderthan(catlast)) {
			return doglast;
		} else {
			return catlast;
		}
	}

	public dog dequeueDogs() {
		return Dogs.poll();// retrieve the last element in Dogs and delete it
	}

	public cat dequeueCats() {
		return Cats.poll();// retrieve the last element in Cats and delete it
	}

}

class dog extends Animal {
	public dog(String n) {
		super(n);
	}
}

class cat extends Animal {
	public cat(String n) {
		super(n);
	}
}