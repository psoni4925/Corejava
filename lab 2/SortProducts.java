/**
*Name : Pranjal Soni
*Description : lab 2 get the shortest list of product game.
*Date : 03/16/2021
*/
import java. util.*;

public class SortProducts 
{
public static void main (String [] args) 
{
int n;

Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of array:");
n=sc.nextInt();

String array[] =new String[n];
System.out.println("Enter the product name in array:");
for(int j=0;j<n;j++)
{
  	array[j]=sc.next();
}
sc.close();
Arrays.sort(array);

for (int i = 0; i < n; i++) 
{
System.out.println(array[i]);
}
}
}