/**
*Name : Pranjal Soni
*Description : lab 2: Show elements using the Arraylist.
*Date : 03/16/2021
*/

import java.util.*;
public class ArrayListToArray {

	public static void main(String[] args)
	{
        ArrayList<String>  list=new ArrayList<String>();	
        list.add("hello");
        list.add("friends");
        list.add("it's");
        list.add("me");
        
    
        String [] arr = new String[list.size()]; 
  
         
        for (int i = 0; i < list.size(); i++) 
            arr[i] = list.get(i); 

        for (String x : arr) 
            System.out.print(x + " "); 
        

	}

}
