/**
*Name : Pranjal Soni
*Description : lab 2 Check whether an array contains an specific value or not.
*Date : 03/16/2021
*/
import java.util.*;
public class HalfUpperCaseHalfLowerCase 
{
 

static String d;


	public static void main(String[] args) throws ArrayIndexOutOfBoundsException
	{
		
		 d=HalfUpperCaseHalfLowerCase.sortString();
		 System.out.println(d);		
		
	}
          static String sortString()
          {
        	 
        	  Scanner sc=new Scanner(System.in);
        	  
        	  StringBuffer sb = new StringBuffer();
        	  StringBuffer sb2 = new StringBuffer();
        	  
        	  
        	  String [] arr=new String[5];
        	 
        	  System.out.println("Enter the string into array");
        	  
        	  for(int i=0;i<5;++i)
        	  {
        		  arr[i]=sc.next();
        	  }
        	  sc.close();
        	  
        	  Arrays.sort(arr);  
  
        	   if((arr.length)%2==0)
        	   {
        		   for(int i=0;i<arr.length/2;i++)
        		   {
        			   sb.append(arr[i]);
        		   }	   
        	
        	   
        	
        		   for(int i=arr.length/2;i<arr.length;i++)
        		   {

        			   sb2.append(arr[i]);
        		   }  
        	 
        	   }
        	   
        	    if((arr.length)%2 != 0)
        	   {
        		   for(int i=0;i<arr.length/2;i++)
        		   {
        			   sb.append(arr[i]+" ");
        		   }	   
        	
        		   for(int i=arr.length/2;i<arr.length;i++)
        		   {

        			   sb2.append(arr[i]+" ");
        		   }  
        	 
        	   }
        	   
        	   String str=sb.toString();
        	   String str1=sb2.toString();
        	     
        	   return str.toUpperCase()+str1.toLowerCase();
          
          }
          
         

}
