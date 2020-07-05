package hackerrank;

import java.util.Scanner;


public class IPAddress {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String st= in.nextLine();
		String s= "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
		 String regex  = s + "\\."+ s + "\\."+ s + "\\."+ s;
		// Pattern pattern = Pattern.compile(regex);
		// Matcher m = pattern.matcher(st);
          System.out.println(st.matches(regex));

    
	}

}
