/**
*Name : Pranjal Soni
*Description : lab 2 Find the longest consecutive sequence of unsorted array.
*Date : 03/16/2021
*/
import java.util.*;

public class LongestConsecutiveElement
{
	public static int [] array=new int[5];
   
   
    public static void main(String [] args)           
    { 
    	int count=0;
    	System.out.println("Enter the elements in the array:");
    	Scanner sc=new Scanner(System.in);
    	
    	for(int i=0;i<array.length ;i++)
    	{
    		array[i]=sc.nextInt();
    	}
    	sc.close();
    	
    	Arrays.sort(array);
    	
    	for(int i=0;i< array.length-1;i++)
    	{
    		for(int j=i+1;j<array.length;j++)
    		{ 
    		 int a=array[i+1]-array[i];
    		if(a==1)
    		{  
    			count++;
    			
    		}
         }
    	}
    	System.out.println("longest consecutive sequence is:"+count);
    }
    
}