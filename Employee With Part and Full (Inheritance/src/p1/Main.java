package p1;
class Employee{
	private String name;
	private float salary;
	public Employee(String name, float salary) {
		this.name = name;
		this.salary = salary;
	}
	
	void displayDetails()
	{
		System.out.println("Name : "+this.name +" Salary :"+this.salary);
	}
}

class FullTime extends Employee{
	
	FullTime(String name,float salary)
	{
		super(name,salary);
	}

	public void getDetails() {
		System.out.println("Full Time Employee");
		super.displayDetails();
	}	
}
class PartTime extends Employee{
	PartTime(String name,float salary)
	{
		super(name,salary);
	}

	public void getDetails() {
		System.out.println("Part Time Employee");
		super.displayDetails();
	}
}
public class Main {
	public static void main(String[] args) {
		FullTime ft = new FullTime("Aplha",25643.56f);
		ft.getDetails();
		
		PartTime pt = new PartTime("Beta",12654.78f);
		pt.getDetails();
	}
}
