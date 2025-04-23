import java.io.*;
import java.util.*;

class Bank
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int cibilscore;
		String name,customerId;
		double amount;
		System.out.println("Please enter your name and customerid:");
		name=sc.nextLine();
		customerId=sc.nextLine();
		System.out.println("Please enter your cibilscore:");
		cibilscore=sc.nextInt();
		System.out.println("Please enter your loan amount:");
		amount=sc.nextDouble();
		
		Customer obj= new Customer();
		obj.applyForLoan();
	}
} 

class Customer
{
	Customer(int cibilscore,String name,String customerId)
	{
		cibilscore=c_score;
		name=name;
		customerId=c_Id;
	
	}
	void applyForLoan(double amount)
	{
		if(cibilscore>=800)
		{
			float roi=8.75;
			System.out.print("Eligible.");
			System.out.println("CustomerId: " + customerId);
			System.out.println("Name: " + name);
			System.out.println("Rate of Interest: " + roi +"%");
		}
		else if(cibilscore>=750 && cibilscore<800)
		{
			float roi=9.15;
			System.out.print("Eligible.");
			System.out.println("CustomerId: " + customerId);
			System.out.println("Name: " + name);
			System.out.println("Rate of Interest: " + roi +"%");
		}
		else if(cibilscore>=700 && cibilscore<750)
		{
			float roi=9.35;
			System.out.print("Eligible.");
			System.out.println("CustomerId: " + customerId);
			System.out.println("Name: " + name);
			System.out.println("Rate of Interest: " + roi +"%");
		}
		else if(cibilscore>=650 && cibilscore<700)
		{
			float roi=9.45;
			System.out.print("Eligible.");
			System.out.println("CustomerId: " + customerId);
			System.out.println("Name: " + name);
			System.out.println("Rate of Interest: " + roi +"%");
		}
		else if(cibilscore>=550 && cibilscore<650)
		{
			float roi=9.75;
			System.out.print("Eligible.");
			System.out.println("CustomerId: " + customerId);
			System.out.println("Name: " + name);
			System.out.println("Rate of Interest: " + roi +"%");
		}
		else if(cibilscore<550)
		{
			System.out.print("No Loan");
		}
	}
}
