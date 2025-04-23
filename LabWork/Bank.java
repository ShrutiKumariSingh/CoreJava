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
		
		Customer obj= new Customer(cibilscore,name,customerId);
		obj.applyForLoan(cibilscore,name,customerId,amount);
	}
} 

class Customer
{
	Customer(int cibilscore,String name,String customerId)
	{
		cibilscore=cibilscore;
		name=name;
		customerId=customerId;
	
	}
	void applyForLoan(int cibilscore,String name,String customerId,double amount)
	{
		if(cibilscore>=800)
		{
			double roi=8.75;
			System.out.print("Eligible.");
			System.out.println("CustomerId: " + customerId);
			System.out.println("Name: " + name);
			System.out.println("Rate of Interest: " + roi +"%");
		}
		else if(cibilscore>=750 && cibilscore<800)
		{
			double roi=9.15;
			System.out.print("Eligible.");
			System.out.println("CustomerId: " + customerId);
			System.out.println("Name: " + name);
			System.out.println("Rate of Interest: " + roi +"%");
		}
		else if(cibilscore>=700 && cibilscore<750)
		{
			double roi=9.35;
			System.out.print("Eligible.");
			System.out.println("CustomerId: " + customerId);
			System.out.println("Name: " + name);
			System.out.println("Rate of Interest: " + roi +"%");
		}
		else if(cibilscore>=650 && cibilscore<700)
		{
			double roi=9.45;
			System.out.print("Eligible.");
			System.out.println("CustomerId: " + customerId);
			System.out.println("Name: " + name);
			System.out.println("Rate of Interest: " + roi +"%");
		}
		else if(cibilscore>=550 && cibilscore<650)
		{
			double roi=9.75;
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
