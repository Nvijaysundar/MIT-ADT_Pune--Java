package p1;
import java.util.Scanner;
public class Employee {
	String name,emailid;
	long mobile;
	int age;
	
	
	public Employee(String name, String emailid, 
			long mobile, int age) {
		this.name = name;
		this.emailid = emailid;
		this.mobile = mobile;
		this.age = age;
	}

	void getDetails()
	{
		System.out.println("Name : "+this.name);
		System.out.println("Mobile: "+this.mobile);
		System.out.println("Emailid : "+this.emailid);
		System.out.println("Age: "+this.age);
	}
	  static Employee newData(Scanner sc)
	  {
		System.out.println("Enter Name: ");
		String name = sc.nextLine();
		System.out.println("Enter Mobile: ");
		long mobile = Long.parseLong(sc.nextLine());
		System.out.println("Enter Emailid : ");
		String emaild = sc.nextLine();
		System.out.println("Enter Age: ");
		int age = Integer.parseInt(sc.nextLine());
		 return new Employee(name,emaild,mobile,age);
	  }
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Employee e1 =Employee.newData(sc);
		
		Employee e2 = Employee.newData(sc);
		sc.close();
		e1.getDetails();
		e2.getDetails();
	}
}
