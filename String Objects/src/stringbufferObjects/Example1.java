package stringbufferObjects;

public class Example1 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(5);
		System.out.println("Cap: "+sb.capacity());
		sb.append("Java");
		System.out.println("Cap: "+sb.capacity());
		sb.append("Hi");
		System.out.println(sb.toString());
		System.out.println("Cap: "+sb.capacity());
		System.out.println(sb.length());
		sb.deleteCharAt(2);
		System.out.println(sb.toString());
		sb.insert(3,"JAVA");
		System.out.println(sb.toString());	
	}
}
