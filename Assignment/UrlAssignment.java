/**
*Name : Pranjal Soni
*Description : Demo Of String method
*Date : 03/15/2021
*/
public class UrlAssignment {
       public static void main(String[] args)
       {
		String url1="https://cognizant.com/admin/policy/index.html";
		String url2="https://cognizant.com/service.jsp";
		String url3="https://cognizant.com/products/local/showProducts.asp";
			
			
			String command1=getCommand(url1);
			String command2=getCommand(url2);
			String command3=getCommand(url3);
			
			System.out.println("command1:"+command1);
			System.out.println("command2:"+command2);
			System.out.println("command3:"+command3);
	}

        private static String getCommand(String url)
        {
        	int commandStartIndex,commandEndIndex;
        	
        	commandStartIndex=url.lastIndexOf('/');
        	commandEndIndex=url.lastIndexOf('.');
        	
        	return url.substring(commandStartIndex+1,commandEndIndex);
        }
}
