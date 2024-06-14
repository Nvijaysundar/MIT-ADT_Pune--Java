package p2;
import p1.Marks;
public class Student {
	String name;
	Marks m1;
	Student(Marks temp)
	{
		this.m1 = temp;
	}
	void setDetails(String name,int m1, int m2, int m3)
	{
		this.name = name;
		this.m1.s1 = m1;
		this.m1.s2 = m2;
		this.m1.s3 = m3;
	}
	public static void main(String[] args) {
		Student st1 = new Student(new Marks());
		st1.setDetails("Vijay", 56,78,85);
		System.out.println(st1.m1.s2);
	}}
