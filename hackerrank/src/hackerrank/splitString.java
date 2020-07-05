package hackerrank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class splitString {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        String s = scan.nextLine();
	      
	           String regex = "\\s+";
	        //Compiling the regular expression
	     /*   Pattern pattern = Pattern.compile(regex);
	        //Retrieving the matcher object
	        Matcher matcher = pattern.matcher(s);
	        //Replacing all space characters with single space
	        String result = matcher.replaceAll(" ");*/
	        String result = s.replaceAll(regex, " ");
	        
	        result= result.trim();
	        if(result.isEmpty()) {
	        	System.out.println("0");
	        }
	      //  System.out.println(result);
	        else {
	         String[] arrOfStr = result.split("[! ,@?._']+");
	         
	         //+ after treats consecutive delimiter chars as one
	   System.out.println(arrOfStr.length);
	        for (String a : arrOfStr) 
	            System.out.println(a); 
	        }
	        scan.close();
}

}
