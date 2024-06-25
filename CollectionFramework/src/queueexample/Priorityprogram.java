package queueexample;

import java.util.PriorityQueue;

public class Priorityprogram {
	public static void main(String[] args) {
		PriorityQueue<Integer> ob = new PriorityQueue<Integer>();
		ob.add(78);
		ob.add(45);
		ob.add(74);
		ob.add(75);
		System.out.println(ob.toString());
	} 
}
