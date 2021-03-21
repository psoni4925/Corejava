/**
*Name : Pranjal Soni
*Description : lab 2 Find the number of postive negative odd and even number.
*Date : 03/16/2021
*/
import java.util.Scanner;

public class PositiveNegativeOddEven
{
	static int count1=0,count2=0,count3=0,count4=0;
    public static void main(String [] args)
    { 
    	Scanner sc=new Scanner(System.in);
    	int  [] intArr=new int[20];
    	System.out.println("enter the elements in array:");
    	
    	for(int i=0;i<20;i++)
    	{
    		intArr[i]=sc.nextInt();
    
    	}
    	
    	for(int i=0;i<20;i++)
    	{		
    	if(intArr[i]>0)
    	{
    		count1++;	
    	}
    	
    	if(intArr[i]<0)
    	{
    		count2++;
    	}
    	 if(intArr[i]%2==0)
    	{
    		count3++;
    	}
    	 
    	 if(intArr[i]%2 !=0)
     	{
     		count4++;
     	}
     	    
    }
    	System.out.println("Number of positive numbers are:"+count1);
    	System.out.println("Number of negative numbers are:"+count2);
    	System.out.println("Number of even numbers are:"+count3);
    	System.out.println("Number of odd numbers are:"+count4);
    } 
    
}
