package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiArray2d {

	public static void main(String[] args) {
		 @SuppressWarnings("unlikely-arg-type")
			        ArrayList<ArrayList<Integer>> ar= new ArrayList<ArrayList<Integer>>();
			        Scanner sc= new Scanner(System.in);
			        ArrayList<Integer> list= new ArrayList<>();
			       int n= sc.nextInt();
			        for(int j=0; j<n; j++) {
			        	
			        	int a= sc.nextInt();
			        	ar.add(new ArrayList<Integer>());
		for(int i=0; i<a; i++) {
			
			int b= sc.nextInt();
			
		     ar.get(j).add(i,b);
		} }
			  //   System.out.println(ar);
			        int q= sc.nextInt();
			        for(int i=0;i<q; i++) {
			        	int z= sc.nextInt();
			        	int y= sc.nextInt();
			        	
			        	try{
			        		System.out.println(ar.get(z-1).get(y-1));
			        	}
			        	catch(Exception e) {
			        		System.out.println("ERROR!");
			        	}
			        	}
	
	}

}
// Above we created 2D array by arraylist of arraylist of integer



// below we created 2D array by arraylist of a var which later defined as a arrayList
//for each row.
/*
Scanner in = new Scanner(System.in);
int n = in.nextInt();
int d,q,x,y;
ArrayList[] set = new ArrayList[n];
for(int i=0;i<n;i++){
    d = in.nextInt();
    set[i] = new ArrayList();
    for(int j=0;j<d;j++){  
        set[i].add(in.nextInt());                
    }
}
q=in.nextInt();
for(int i=0;i<q;i++){
    x=in.nextInt();
    y=in.nextInt();
    try{
        System.out.println(set[x-1].get(y-1));
    } catch(Exception e){
        System.out.println("ERROR!");
    }
}

*/