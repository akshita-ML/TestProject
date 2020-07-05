package hackerrank;

public class pyramid {

	public static void main(String[] args) {
		int k=0;
		for(int i=1; i<=5; i++, k=0) {
			for(int j=5; j>i; j--) {
				System.out.print(" ");
			}
			while(k!=(i*2 -1)) {
				System.out.print("*");
				k++;
			}
			
			System.out.println();
		}

	}

}
