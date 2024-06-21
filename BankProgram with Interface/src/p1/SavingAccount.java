package p1;

import java.util.Scanner;

public class SavingAccount implements BankAccount{
	private double balance ;
	
	public SavingAccount(double balance) {
		this.balance = balance;
	}
	public double getBalance() {
		return this.balance;
	}
	public void deposit(double amount) {
		if(amount%100.0==0)
		{
			this.balance += amount;
			System.out.println("Deposit Successfull");
		}
		else
			System.out.println("Invalid Amount Format, Deposit Failed");
	}
	public boolean withdraw(double amount) {
		if(amount%100.0==0)
		{
			if(amount<this.getBalance())
			{
				this.balance -= amount;
				return true;
			}
			else {
				System.out.println("Insufficient Fund");
				return false;
			}
		}
		else
		{
			System.out.println("Invalid Amount Format");
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SavingAccount user1 = new SavingAccount(35000);
		int pin,pinchances = 3;
		while(true)
		{
			System.out.print("Enter Pin :: ");
			pin = sc.nextInt();
			if(pinLengthChecker(pin))
			{
				if(pinChecker(pin))
				{
					options(sc,user1);
				}
				else {
					System.out.print ("Incorrect Pin!! ");
					System.out.println("Leftover chances: "+ --pinchances);
					if(pinchances == 0)
					{
						System.out.println("Reach nearest Branch to Change pin");
						sc.close();
						System.exit(pinchances);
					}
				}
				
			}
			else
			System.out.println("Length of pin should be 4");
			
		}
	}
	private static void options(Scanner sc, SavingAccount user) {
		System.out.println("1.Get Balance\t2.Deposit\t3.Withdraw\t4.Exit ::");
		switch(sc.nextInt())
		{
		case 1:
			System.out.println("Balance : "+user.getBalance());
			break;
		case 2: 
			System.out.print("Enter Amount : ");
			user.deposit(sc.nextDouble());
			break;
		case 3:
			System.out.print("Enter Amount : ");
			if(user.withdraw(sc.nextDouble()))
				System.out.println("withdraw Successfull");
			else
				System.out.println("Withdraw Failed");
			break;
		case 4:
			System.out.println("Thank for using services. Visit Again!!!");
			System.exit(0);
		}
		
		System.out.println("Do You wish to Continue Y/y : Yes  N/n :No ");
		switch(sc.next().charAt(0))
		{
		case 'Y':
		case 'y':
			options(sc, user);
			break;
		case 'N':
		case 'n':
			System.out.println("Thank for using services. Visit Again!!!");
			System.exit(0);
		}

	}
	private static boolean pinChecker(int pin) {
		switch(pin)
		{
		case 1111:
		case 2222:
		case 3333:
			return true;
		}
		return false;
	}
	private static boolean pinLengthChecker(int pin) {
		
		return String.valueOf(pin).length()==4;
	}
	
}
