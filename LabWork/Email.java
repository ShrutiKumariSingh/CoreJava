import java.io.*;
import java.util.*;
class Email
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			String mail;
			System.out.println("Please enter your email id:");
			mail=sc.nextLine();
			Validator obj=new Validator();
			obj.check(mail);
		}
	}	
}
class Validator
{
	void check(String n)
	{
		int a= n.indexOf("@");
		int b= n.indexOf(".");
		int aa= n.lastIndexOf("@");
		int l=n.length();
		int ab= n.lastIndexOf(".");
		
		if (a==aa&&a>0&&b==ab&&b>a&&b<l-2)
		{
			System.out.println("It is a valid email id.");
		}
		else
		{
			System.out.println("It is a invalid email id.");
		}
	
	}
}
