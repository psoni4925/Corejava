/**
*Name : Pranjal Soni
*Description : lab 1 Show the traffic command according to traffic light.
*Date : 03/14/2021
*/
import java.util.*;
public class TrafficSignal {

	public static void main(String[] args)
	 {
		System.out.println("select a light from red green and yellow:");
		System.out.println("for red enter 1 ");
		System.out.println("for green enter 2");
		System.out.println("for yellow enter 3");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		
		switch (number)
		{
		case 1:
			System.out.println("Stop");
			break;
		case 2:
			System.out.println("go");
			break;
		case 3:
			System.out.println("ready");
			break;
		default:
			System.out.println("wrong input");
			break;

	}

  }
}