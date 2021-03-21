/**
*Name : Pranjal Soni
*Description : lab 3:print the duration in date month and year.
*Date : 03/18/2021
*/
import java.util.Scanner;

public class CurrentSystemDate 
{
	int date;
	int year;
	String month;
	
    public static void main(String [] args)
    {
    	
    	CurrentSystemDate sb= new CurrentSystemDate();
    	sb.displayDate(4,4,"jan");
    }
    
    void displayDate(int date,int year,String month)
   {
    	this.date=date;
    	this.year=year;
    	this.month=month;
    	
    	Scanner sc=new Scanner(System.in);
    	   date=sc.nextInt();
    	   year=sc.nextInt();
    	   month=sc.nextLine();
    	   System.out.println("the today's date is:"+ date + "-"+month+"-"+year);
    	}
    	
    	
    
}
