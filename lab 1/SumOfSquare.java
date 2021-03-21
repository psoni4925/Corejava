/**
*Name : Pranjal Soni
*Description : lab 1 Calculate the difference between the sum of square of number and square of the sum of number. 
*Date : 03/14/2021
*/
import java.util.Scanner;

public class SumOfSquare {
static int diff;
	public static void main(String[] args) 
	{
		int sum=SumOfSquare.calculateDiffrence();
                 System.out.println("sum is:"+sum);
	}
	
	public static int calculateDiffrence()
	{ 
		int sum1=0,sum2=0;
        System.out.println("Enter the number upto which you want to calculate sum: ");
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		sc.close();
		for(int i=1;i<=n;i++)
		{
           
		
		sum1=sum1+i;
		sum2=sum2+i*i;
	}
           diff=(sum1*sum1)-sum2;
            		return diff;
}
}