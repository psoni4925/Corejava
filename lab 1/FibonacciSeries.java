/**
*Name : Pranjal Soni
*Description : lab 1 Fibbonacci Seies upto entered term.
*Date : 03/14/2021
*/
import java.util.*;
public class FibonacciSeries
{

	public static void main(String[] args) 
	{
		int num,num1=0,num2=1,num3=0;
		System.out.println("Enter the nth term:");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		System.out.println("the fibonacci series is:\r");
	for(int i=0;i<=num;i++)
	{
		if(num<=1)
		{
			System.out.println(i);
		}
		else 
		{
			num3=num1+num2;
			num1=num2;
			num2=num3;
		}
		System.out.println(num3);
	}

 }
}

