package hackerrank;

import java.util.HashSet;
import java.util.Scanner;

public class HashsetDemo {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	        int t = s.nextInt();
	        String [] pair_left = new String[t];
	        String [] pair_right = new String[t];
	        
	        for (int i = 0; i < t; i++) {
	            pair_left[i] = s.next();
	            pair_right[i] = s.next();
	        }
	          
	      /*    HashSet <String []> set= new HashSet<String []>();
	          String[] str= new String[2];
	          int count=0;
	         for(int i=0; i<t; i++){
	             
	              str[0]= pair_left[i];
	              str[1]= pair_right[i];
	              //System.out.println(str);
	              
	              set.add(str);
	             //this will add the array but it is indicating to different location so even
	              * hashset will add all the list because it is not comparing
	              * elements of array instead its location which is different for all.
	             
	              System.out.println(set.size());
	              
	          } */
	        
	       HashSet<String> set= new HashSet<String>();
	        for(int i=0; i<t; i++){
	        set.add("("+pair_left[i]+","+ pair_right[i]+")");
	        System.out.println(set.size());
	        } 


	}

}
