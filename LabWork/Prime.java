import java.io.*;
import java.util.*;

class Prime
{
	public static void main(String a[])
	{
		int n=1000;
		for(int i=1;i<=n;i++)
		{
			if(pri(i))
			{
				System.out.print(i+" ");
			}
		}
	}
} 

class P
{
	int pri(int n)
	{
		if(n==1||n==0)
			return false;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			return false;
		}
		return true;		
	}
}
