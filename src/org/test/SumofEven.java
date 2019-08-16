package org.test;

public class SumofEven 
{
 public static void main(String[] args) 
  {
	int a=0,b=0;
	for(int i=0;i<=10;i++)
	{
		if(i%2==0)
		{
			a=a+i;
		}
		else
		{
			b=b+i;		
		}
	}
	System.out.println("sum of even: "+a);
	System.out.println("Sum of odd: "+b);
  }
}
