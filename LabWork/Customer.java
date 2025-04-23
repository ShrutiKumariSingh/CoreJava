import java.util.Scanner;
class Customer extends Thread
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int balance;
		int amount;
		String account;
		System.out.println("Enter your account, transaction type and amount:");
		account=sc.next();
		String transactionType=sc.next();
		amount=sc.nextInt();
		BankAccount b= new BankAccount(account,transactionType,amount);
		final BankAccount a=new BankAccount();
		if(transactionType=="withdraw")
		{
			new Thread(){
			public void run(){a.withdraw(1000);}
			}.start();
		}
		else if(transactionType=="deposit")
		{	
			new Thread(){
			public void run(){a.deposit(5000);}
			}.start();
		}
	}
		
}
public class BankAccount
{
	int balance;
	int amount;
	String account;
	String transactionType;
	public BankAccount(){
	}
	public BankAccount(String account,String transactionType,int amount)
	{
		this.account=account;
		this.transactionType=transactionType;
		this.amount=amount;	
	}
	public BankAccount c(BankAccount b)
	{
		this.account=b.account;
		this.transactionType=b.transactionType;
		this.amount=b.amount;
		return b;
	}
	synchronized void withdraw(int amount)
	{
		System.out.println("Withdrawal: ");
		if(this.amount<amount)
		{
			System.out.println("Insufficient balance. ");
			try{wait();}catch(Exception e){}
		}
		this.amount-=amount;
		System.out.println("Withdrawal Initiated.");
	}
	synchronized void deposit(int amount)
	{
		System.out.println("Deposit: ");
		this.amount+=amount;
		System.out.println("Deposit Initiated.");
		notify();
	}
}
