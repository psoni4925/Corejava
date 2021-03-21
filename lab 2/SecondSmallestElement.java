/**
*Name : Pranjal Soni
*Description : lab 2 find the second smallest number in array.
*Date : 03/16/2021
*/
import java.util.*;

public class SecondSmallestElement
{
static int d;
static int c;
	public static void main(String[] args) 
	{
		SecondSmallestElement sb=new SecondSmallestElement();
	 d=sb.getSmallest();
      System.out.println("the second smallest element is:");
      System.out.println(d);
  
	}

	
static  int getSmallest()
{
  	int [] arr=new int[10];
  	Scanner sc=new Scanner(System.in);
  	System.out.println("enter the elements in array:");
  	for(int i=0;i<10;i++)
  	{
  		arr[i]=sc.nextInt();
  	}
  	Arrays.sort(arr);
  	c=arr[1];
  	return c;
}
}
