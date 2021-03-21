/**
*Name : Pranjal Soni
*Description : lab 3:Create a method that accepts a String and checks if it is a positive string.
*Date : 03/18/2021
*/
import java.util.Scanner;
import java.lang.String;

public class PositiveString {

public static void main(String[] args) {
	
	boolean st=PositiveString.positiveStringCheck();
	
	if(st) 
	{System.out.println("positive string");}
	else 
	{System.out.println("not a positive string");}
	
}
  static boolean positiveStringCheck() 
		{
	    int count=0;
	    
	        Scanner sc=new Scanner(System.in);
			System.out.println("enter the string:");	
			String str =sc.next();
			int ab=str.length();
		    sc.close();
		    
		    str=str.toUpperCase();
		    
		    int arr[]=new int[(ab)];
			System.out.println("ASCII of the chracters are:");
			for(int i=0;i<=ab-1;i++)
			{
			   arr[i]=(int)(str.charAt(i));	
			   System.out.println(arr[i]);
			}
			
			
			 for(int k=0;k<ab-1;k++)
				 if(arr[k]<arr[k+1])
				 { 
					 count++;
				}
			 
			 if(count==(ab-1))
			         return true;
			 return false;
		}
		

}
