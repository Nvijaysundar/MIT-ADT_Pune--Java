package p2;
import p1.*;
public class Student {
	String name,roll;
	
	public Student(String name, String roll) {
		this.name = name;
		this.roll = roll;
	}

	public static void main(String[] args) {
		Student s1 = new Student("Vijay","A11223");
		Marks m1 = new Marks(56,48,78);
	}
}
