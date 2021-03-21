/**
*Name : Pranjal Soni
*Description : lab 1 Find the sum of natural number
*Date : 03/14/2021
*/
import java.util.Scanner;

public class NaturalNumberSum {
static int n;
	public static void main(String[] args) {
	int b=NaturalNumberSum.calculateSum();
	System.out.println("Sum of first" + n + "natural number is:"+b);
	}
public static  int calculateSum()
{
	int sum=0;
	System.out.println("Enter the term upto which you want to calculate sum ");
	Scanner sc=new Scanner(System.in);
	 n=sc.nextInt();
	
  for(int i=1;i<=n;i++)	
  {
	  if(i%3==0 || i%5==0)
	  {sum=sum+i;}
  }
  return sum;
}
}
