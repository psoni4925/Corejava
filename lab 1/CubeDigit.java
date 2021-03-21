/**
*Name : Pranjal Soni
*Description : lab 1 sum of the Cube of the digits of a given number
*Date : 03/14/2021
*/
import java.util.Scanner;
public class CubeDigit {
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int number=sc.nextInt();
		sc.close();
	int sum=0,counter=0;
	while(number>0){
	    int t= number%10;
	    System.out.println("Cube of "+t +" is "+(t*t*t));
	    sum=sum+(t*t*t);
	    counter = counter+1;
	    number = number/10;

	}
	System.out.println("sum is"+ sum);
}
}