/**
*Name : Pranjal Soni
*Description : Demo Of String method
*Date : 03/15/2021
*/

import java.lang.String;
public class StringAssignment {

	public static void main(String[] args) {
		String str = "Hello My Dear Friends";
		char[] ch = str.toCharArray(); 
		int p=str.lastIndexOf();
		/*for(int i=p;i>=0;--i)
		{
			System.out.println("the reverse of string is:"+ch[i]);
		}
		*/
		System.out.println(p.toString());
	}

}
