package hackerrank;

import java.util.Scanner;
import java.util.Stack;

public class stackProgram {
	static boolean isBalanced(char c1, Character c2) {
		if(c1 == ')' && c2=='(') {
			return true;
		}
		if(c1 == '}' && c2=='{') {
			return true;
		}
		if(c1 == ']' && c2=='[') {
			return true;
		}
		return false;
		
		
	}

	public static void main(String[] args) {
		
		
Scanner sc = new Scanner(System.in);
boolean b=false;
Stack<Character> st= new Stack<Character>();
		while (sc.hasNext()) {
			String input=sc.next();
			char[] c= input.toCharArray();
			
			for(int i=0; i< c.length; i++) {
		
			if(c[i] == '(' || c[i] == '{' || c[i] == '[') {
			st.push(c[i]);
			}
			
			else if(c[i] == ')' || c[i] == '}' || c[i] == ']') {
				//for extra closing parenthesis element
				if(st.empty()) {
					 b = false;
					 break;
				 }  
				else {
					b= stackProgram.isBalanced(c[i], st.pop());
			}
			}
		
           }
			//for extra opening parenthesis element
			 if(!st.empty()) {
				 st.clear();
				 b = false;
			 }
			 
			System.out.println(b);
			}
		}
}


