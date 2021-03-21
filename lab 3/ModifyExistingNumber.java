/**
*Name : Pranjal Soni
*Description : lab 3 : modify the existing digit with the difference between the  consecutive number.
*Date : 03/18/2021
*/
public class ModifyExistingNumber {
	public static void main(String[] args)  
	{  
	    int arr[] = { 4, 5, 8, 6, 2 };  
	    int n = arr.length;  
	  
	    pairwiseDifference(arr, n);  
	}  
	static void pairwiseDifference(int arr[], int n)  
	{
	    int [] diff=new int[5];  
	    for (int i = 0; i < n -1; i++)
	    {  
	 
	        diff[i] = Math.abs(arr[i] - arr[i + 1]);    
	    }  
	    diff[4]=2;
	   StringBuffer sb=new StringBuffer();
	   
	   for (int j = 0; j < n ; j++) 
	   {
		   sb.append(diff[j]);
	   }   
	  
	
	    String str=sb.toString();
	    System.out.println("the modified string is:");
		 System.out.println(str);
	}
}