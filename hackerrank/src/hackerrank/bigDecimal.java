
package hackerrank;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class bigDecimal {

	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
	        int n=sc.nextInt();
	        String []s=new String[n+2];
	        for(int i=0;i<n;i++){
	            s[i]=sc.next();
	        }
	      	sc.close();
	      	
	      	
	      	//.sort(array_name, starting_index, end_index)
	      	// instead of our previous approach where we convert string array to 
	      	//bigdecimal array then sorted then after converting back to string .12 becomes 0.12
	      	//so here we sorted it with a comparator interface by overridding its method
	      	// by converting each o1 and o2 to big decimal 
	      	// thus no need to create bigDecimal Array.
	      	
	      	Arrays.sort(s,0,n, Collections.reverseOrder(new Comparator<String>() {

				
				public int compare(String o1, String o2) {
					if (o1 == null || o2 == null) {
					    return 0;
					}
					 BigDecimal a = new BigDecimal(o1);
				        BigDecimal b = new BigDecimal(o2);
				        return a.compareTo(b);
					
				}
	      		
	      	}));  	


	        //Output
	        for(int i=0;i<n;i++)
	        {
	            System.out.println(s[i]);
	        }
	}

}
