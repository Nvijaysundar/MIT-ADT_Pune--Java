package queueexample;

import java.util.ArrayDeque;

public class Adeque {
	public static void main(String[] args) {
		ArrayDeque<Integer> ob = new ArrayDeque<Integer>();
		ob.push(74);
		ob.addFirst(85);
		ob.addLast(66);
		ob.add(88);
		ob.addFirst(55);
		System.out.println(ob.toString());
		System.out.println(ob.peek());
		ob.poll();
		System.out.println(ob.toString());
	}
}
