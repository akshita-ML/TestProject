package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class javaList {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		List<Integer> l= new ArrayList<Integer>(); 
		
		for(int i=0; i<n; i++) {
			l.add(i, sc.nextInt());
			}
		int q= sc.nextInt();
		//sc.nextLine();
		for(int i=0; i<2*q; i++) {
			String s=sc.nextLine();
		if(s.equals("Insert")) {
				l.add(sc.nextInt(), sc.nextInt());
			}
			if(s.equals("Delete")) {
				l.remove(sc.nextInt());
			}
		}
		for(int i=0; i<l.size(); i++) {
		System.out.print(l.get(i) + " ");
		}

	}

}
