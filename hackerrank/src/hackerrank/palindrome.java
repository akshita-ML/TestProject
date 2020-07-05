package hackerrank;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		 String s= sc.nextLine();
		
		 //this is by comparing first and last element again and again
		 /* 
		 char[] ch = s.toCharArray();
		 int z=0;
	int a=  ch.length;
	if(a==1) {
	 System.out.println("Yes");
	}
	else {
	for(int i=0; i<(ch.length)/2; i++) {
		char b=ch[i];
		char c= ch[a-i-1];
		if(b==c) {
			z++;
			
		}
		else {
			break;
		}
	}
		if(z==0) {
			System.out.println("no");
		}
		else {
			System.out.println("yes");
		}
	
	
	} 
		  */
		 
		 /*by reverse the string and then comparing it with original*/
		 String reverse="";
		 for(int i=0; i<s.length(); i++) {
			 reverse= reverse+ s.charAt((s.length())-i-1);
		 }
	if(s.equals(reverse)) {
		System.out.println("yes");
	}
	else {
		System.out.println("no");
	}
	
	
	}
	
	

}
