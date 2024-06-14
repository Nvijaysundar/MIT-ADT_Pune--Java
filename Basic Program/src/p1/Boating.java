package p1;
import java.util.Scanner;
public class Boating {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter Boat Cap:: ");
		 int boat_cap = sc.nextInt();
		 System.out.print("Enter no of Adults: ");
		 int adult = sc.nextInt();
		 System.out.println("Enter No of child: ");
		 int child = sc.nextInt();
		 
		 
		 sc.close();
		 if(adult*75 +  child * 30 <boat_cap)
			 System.out.println("Stable");
		 else
			 System.out.println("Unstable");
		 
	 }
}
