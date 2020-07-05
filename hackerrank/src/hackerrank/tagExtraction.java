package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class tagExtraction {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		while(testCases>0){
			String line = in.nextLine();
			boolean MatchFound= false;
			Pattern p= Pattern.compile("<(.+)>([^<]+)</\\1>");
			 // first is for matching any  tag      
			//matching the text grouping as 2 and it should not contain '<'
	        // this is coping the text from group 1
			
             List<String> tagValues = new ArrayList<String>();
             Matcher m = p.matcher(line) ;
             
             while (m.find()) {
                 tagValues.add(m.group(2));
                 MatchFound= true;
             }
			if(!MatchFound) {
				System.out.println("None");
			}
			
			for(int i=0;i<tagValues.size();i++){
    System.out.println(tagValues.get(i));
} 
			testCases--;
		}
	}
}
