package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class sorting {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>(); 
        al.add("Geeks For Geeks"); 
        al.add("Friends"); 
        al.add("Dear"); 
        al.add("Is"); 
        al.add("Superb");
        Collections.sort(al,Collections.reverseOrder());
        System.out.println("List after the use of"
                + " Collection.sort() :\n" + al);
        
        
        Stack<Integer> s= new Stack<Integer>();
        s.push(30); 
        s.push(-5); 
        s.push(18); 
        s.push(14); 
        s.push(-3);
        System.out.println("before sorting"+s);
        
        System.out.println("After sorting"+after(s));

	}

	private static Stack after(Stack s) {
		int a=(int) s.pop();
		int b=(int) s.pop();
		return s;
	}

	

}
