package p1;

public class YearDays {
	public static void main(String[] args) {
		int total_days  = 214687;
		int years = total_days/365;
		int month = (total_days%365)/30;
		int days = (total_days%365)%30;
		
		System.out.println(years+"Years "+ month +
				" Months "+ days +" Days");
	}
}
