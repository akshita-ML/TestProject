package hackerrank;

import java.util.Scanner;

public class anagrams {

    static boolean isAnagram(String A, String B) {
         int i,j,k,l;
        char temp;
        Boolean t= true;
        
       String a=A.toUpperCase();
       String b= B.toUpperCase();
       
        char[] ch = a.toCharArray();
        char[] ch1 = b.toCharArray();
        
        int n1= a.length();
        int n2= b.length();
        if (n1!=n2) {
            return false;
        }
        
        else {   //sorting
        for ( i = 0; i < ch.length; i++) {
            for (j = i+1; j < ch.length; j++) {
                if (ch[j]>(ch[i])) {
                    temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
                }
            }
        System.out.println(ch);
             
        for ( k = 0; k < ch.length; k++) {
           for (l = k+1; l < ch.length; l++) {
                if (ch1[l]>(ch1[k])) {
                    temp = ch1[k];
                    ch1[k] = ch1[l];
                    ch1[l] = temp;
                }
                }
             }
             System.out.println(ch1);
      /*     
            //convert char array to string
             String s1= new String(ch);
            String s2= new String(ch1);
            //this equalsIgnoreCase is used to compare to strings without considering uppercase and lowercase
            if(s1.equalsIgnoreCase(s2)) {
            	return true;
            }
            else {
            	return false;
            }
            */
           //iteration
             for(i=0; i<n1; i++) {
            	if (ch[i]!=ch1[i]) {
            		t= false;
            	}
            	 }
             if(t) {
            	 return true;
             }
        }
		return false;
    }
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}