package hackerrank;

import java.util.Scanner;

public class SubArray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int count=0;
        sc.nextLine();
        int arr[]= new int[n];
        for(int i=0; i<n; i++) {
        arr[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++) {
        	int sum=0;
        	for(int j=i; j<n; j++) {
        		sum= sum+arr[j];
        		if(sum<0) {
        			count++;
        		}
        	}
        }
        // 0, (0,1), (0,1,2), (0,1,,...n)
        // 1, (1,2), (1,2,3), (1,2,3,...n)
        // 2, (2,3), (2,3,4), (2,3,4,...n)
        System.out.println(count);
        
	}}


