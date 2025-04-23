import java.io.*;
import java.util.*;
class atm
{ 
	void performTransaction (String b, double amount)
	{
	
		BankAccount obj2 = new BankAccount();
		obj2.getInput();
		
		if(b=='W')
			obj2.withdraw(amount);
		else if(b=='D')
			obj2.deposit(amount);
	}

	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		double amount=sc.nextDouble();
		
		System.out.print("W for withdraw and D for deposit");
		b=sc.nextLine();
				
		atm obj = new atm();
		atm.performTransaction(b, amount);
		

	}
}
class BankAccount
{
	int balance, acc_no;
	
	void getInput()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Please enter account number, account balace and amount:");
		acc_no=sc.nextInt();
		balance=sc.nextInt();	
	}
	
	void withdraw (double amount)
	{
		if(balance>=amount)
			balance-=amount;
		else
			System.out.print("Insufficient balance");
	}
		
	void deposit (double amount)
	{
			balance+=amount;
			System.out.print("Diposit done. Current Balance = " + balance);
	}

}
