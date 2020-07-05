package hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VirtusaSubstring {
static String twoStrings(String s1, String s2) {
	List<String> list1= new ArrayList<String>();
	List<String> list2= new ArrayList<String>();
	for(int i=0; i< s1.length(); i++) {
		for(int j=s1.length()-1; j>i; j--) {
			list1.add(s1.substring(i, j));
	}
		list1.add(s1.substring(i,i+1));
	}
	for(int i=0; i< s2.length(); i++) {
		for(int j=s2.length()-1; j>i; j--) {
			list2.add(s2.substring(i, j));
	}
		list2.add(s2.substring(i,i+1));
	}
	String f= "fag";
	String g= "gaf";
	if (f.equals(g)) {
		return "yes";
	}
	
	for(int i=0; i<list1.size(); i++) {
		for(int j=0; j<list2.size(); j++) {
			//if((list1[i]) = (list2[j])) {
				//return "yes";
			//}
		}
	}
	
	return "no";
	}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }

}
