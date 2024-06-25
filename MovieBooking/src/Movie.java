/*
Movie Booking : 

   1 2 3 4 5
1  0 0 0 0 0
2  0 0 0 0 0
3  0 0 0 0 0
4  0 0 0 0 0
5  0 0 0 0 0


Row, col  - Block the seat */

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Movie {
	LinkedHashMap<Integer, LinkedHashMap<Integer, Integer>> am = 
			new LinkedHashMap<Integer, LinkedHashMap<Integer,Integer>>();
	
	public Movie() {
		for(int i=1;i<=5;i++)
		{
			this.am.put(i,new LinkedHashMap<Integer,Integer>());
			for(int j=1;j<=5;j++)
			{
				am.get(i).put(j, 0);
			}
		}
	}

	public static void main(String[] args) {
		Movie m = new Movie();
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("1.new Booking\t2.Show Seat Availability\t3.Exit");
			switch(sc.nextInt())
			{
			case 1:
				m.bookticket(sc);
				break;
			case 2:
				m.showseats();
				break;
			case 3:
				sc.close();
				System.exit(0);
			}
		}
		
	}

	private void showseats() {
		System.out.println("  1 2 3 4 5");
		for(Integer row : am.keySet())
		{
			System.out.print(row+" ");
			for(Integer col : am.get(row).keySet())
			{
				System.out.print(am.get(row).get(col)+" ");
			}
			System.out.println();
		}
	}

	private void bookticket(Scanner sc) {
		System.out.println("Enter Row: ");
		int row = sc.nextInt();
		System.out.println("Enter Col : ");
		int col = sc.nextInt();
		if(am.get(row).get(col)==0)
		{
			System.out.println("Price: 350/-");
			am.get(row).put(col, 1);
		}
		else
			System.out.println("Selected Seat not available");
		
	}
}
