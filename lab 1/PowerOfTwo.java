/**
*Name : Pranjal Soni
*Description : lab 1 to find whether entered number is power of two or not.
*Date : 03/14/2021
*/
import java.util.Scanner;

public class PowerOfTwo {
static boolean flag=false;

	public static void main(String[] args) {
		boolean a=PowerOfTwo.checkNumber();
		if(a)
		{ System.out.println("Entered number is the power of 2");}
		else
		{System.out.println("Entered number is not a power of 2");}
	}

	static boolean checkNumber()
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		n=sc.nextInt();
		sc.close();
		
		for(int i=1;i<=10;i++)
		{
			if(2*i==n)
				{
				flag=true;
				break;
				}		
		}
		
		return flag;
	}
}
