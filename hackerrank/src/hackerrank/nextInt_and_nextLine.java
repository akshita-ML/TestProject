package hackerrank;

import java.util.Scanner;

public class nextInt_and_nextLine {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int i = sc.nextInt();
        double d = sc.nextDouble();
        sc.nextLine();
        String str= sc.nextLine();
		//System.out.print("Enter a string: ");  
		               
		System.out.print("You have entered: "+str);
		System.out.println("Double: " + d);
        System.out.println("Int: " + i);
		    sc.close();
		}

	}


