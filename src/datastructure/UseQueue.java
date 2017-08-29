package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> queue = new LinkedList<>();

		queue.add("One");
		queue.add("Two");
		queue.add("Three");
		queue.add("Four");
		queue.add("Five");
		queue.add("Six");
		queue.add("Seven");

		System.out.println("Using For Each:");
		usingForEach(queue);
		System.out.println("\n");
		System.out.println("Using Iterator :");
		usingIterator(queue);

		System.out.println("\n");
		System.out.println("Removing Top Item, #1 :");
		queue.poll();
		usingForEach(queue);
		System.out.println("\nNew Top item, :" + queue.peek());
		System.out.println("\n Removing Top item, # 2 :");
		queue.poll();











	}

	public static void usingForEach(Queue<String> queue){
		for(String n : queue){
			System.out.println(n);
		}
	}

	public static void usingIterator(Queue<String> queue){
		Iterator<String> it = queue.iterator();
		while (it.hasNext()){
			System.out.println(it.next());
		}
	}

}
