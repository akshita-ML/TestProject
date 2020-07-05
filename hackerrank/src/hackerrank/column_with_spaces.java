package hackerrank;

import java.util.Scanner;

public class column_with_spaces {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
         System.out.println("================================");
         for(int i=0;i<3;i++){
             String s1=sc.next(); 
             int x=sc.nextInt();
            //String y= Integer.toString(x);
             String str= String.format("%03d",x);
             //String s2 = String.format("%-15s", str);
             System.out.printf("%-14s %s %n",s1,str);
             //System.out.print("               ");
             //System.out.print(s2);
         }
         System.out.println("================================");

	}   
		
	}


