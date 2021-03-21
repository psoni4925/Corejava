/**
*Name : Pranjal Soni
*Description : lab 3:Diplay number of lines character and words.
*Date : 03/18/2021
*/
import java.io.*;

import java.util.*;

public class NumberOfCharLineWord {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String line;
		
		int noofchr=0;
		int noofwords=0;
		int nooflines=0;
		
		while((line = bf.readLine()) != null && line.length()!=0) {
			noofchr += line.length();
			String words[]= line.split(" ");
			noofwords += words.length;
			nooflines++;
		}
		
		System.out.println("no of characters = " +noofchr);
		System.out.println("no of words = " +noofwords);
		System.out.println("no of lines = " +nooflines);
		
	}

}
