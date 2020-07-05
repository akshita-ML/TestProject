package hackerrank;
import java.util.Scanner;

	public class Substrings {

	    public static String getSmallestAndLargest(String s, int k) {
	        String smallest = "";
	        String largest = "";
	        //ArrayList arra= new ArrayList();
		       int a= s.length();
		       String[] asd= new String[a-k+1];
		       String temp;
		       
		       
		       for(int i=0; i<(a-k+1); i++) {
		        	String arr = s.substring(i,k+i);
		            asd[i]=arr;
		      
		       }
		       
		       for (int i = 0; i < asd.length; i++) {
		            for (int j = 0; j < asd.length; j++) {
		                if (asd[j].compareTo(asd[i])>0) {
		                    temp = asd[i];
		                    asd[i] = asd[j];
		                    asd[j] = temp;
		                }
		                }
		            }
		      smallest= (String) asd[0];
		      largest= (String) asd[a-k];
		      
	        return smallest + "\n" + largest;
		       
	    }


	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String s = scan.next();
	        int k = scan.nextInt();
	        scan.close();
	      
	        System.out.println(getSmallestAndLargest(s, k));
	    }
	}

	


