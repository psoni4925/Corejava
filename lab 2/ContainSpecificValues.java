/**
*Name : Pranjal Soni
*Description : lab 2 Check whether an array contains an specific value or not.
*Date : 03/16/2021
*/
import java.util.Scanner;
public class ContainSpecificValues {

	public static void main(String[] args) 
	{
		int[] intArray = new int[]{1, 2, 3, 4, 5};
		boolean found = false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number which you want to search :");
		int enteredValue = sc.nextInt();
		sc.close();

		for(int x : intArray){
			if(x == enteredValue){
		        found = true;
		        break;
		    }
		}

		if(found)
		{System.out.println("number is in the array");}
		else
		{System.out.println("number is not in the array");}

	}

}
