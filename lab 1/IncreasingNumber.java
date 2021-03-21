/**
*Name : Pranjal Soni
*Description : lab 1 to find whether the entered digit is incresing or not
*Date : 03/14/2021
*/
import java.util.Scanner;

public class IncreasingNumber {
	  static boolean flag = false;
	  
	public static void main(String[] args) {
		
		boolean a= IncreasingNumber.checkNumber();
		
		if(a){
	         System.out.println("Digits are not in increasing order.");
	     }else{
	         System.out.println("Digits are in increasing order.");}
	}
	
 static boolean checkNumber()
 {
	 int num;
  
     Scanner scanner = new Scanner(System.in);
      
    
     System.out.println("Enter a number : ");
     num = scanner.nextInt();
     scanner.close();
      
     
     int currentDigit = num % 10;
     num = num/10;
      
    
     while(num>0){
         
         if(currentDigit <= num % 10){
             flag = true;
             break;
         }

         currentDigit = num % 10;
         num = num/10;
     }
      
    
     return flag;
     }

 }
