package listInterface;

import java.util.Stack;

public class Example1 {
	public static void main(String[] args) {	
		Stack<Integer> ob = new Stack<Integer>();
		
		ob.push(89);
		ob.push(78);
		ob.push(44);
		ob.push(88);
		System.out.println(ob.toString());
		ob.pop();
		System.out.println(ob.toString());
		
		
		
	}
}
