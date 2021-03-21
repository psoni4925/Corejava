/**
*Name : Pranjal Soni
*Description : lab 3 : print the mirror image of the string..
*Date : 03/18/2021
*/
import java.util.Scanner;
public class MirrorImage {
 static String sb;
 static String c;
	public static void main(String[] args) 
	{
		
		 String c=MirrorImage.getImage();
		 System.out.println("the mirror image of the string is : " + sb +" | "+c);
	}		 
		static String getImage()
		{
			System.out.println("Enter the string:");
			Scanner sc=new Scanner(System.in);
			 sb=sc.nextLine();
			 sc.close();
			 
			 StringBuffer sb1=new StringBuffer();
			 
		for(int i=sb.length()-1;i>=0;i--)
			{
			sb1.append(sb.charAt(i));		
			}
		c=sb1.toString();
		return c;
		}
	}

