import java.io.*;
import java.util.*;

class Fibonacci
{
	public static void main(String a[])
	{
		Fib obj= new Fib();
		obj.fibo(10);
	}
} 

class Fib
{
	void fibo(int count)
	{
		int n1=0,n2=1,n3=0,sum=0;
		System.out.print(n1+" "+n2);
		for(int i=2;i<count;++i)
		{
			n3=n1+n2;
			sum+=n3;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			
		}
		System.out.println("\nSum: " + sum);
	}
}
