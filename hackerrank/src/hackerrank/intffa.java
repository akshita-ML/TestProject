package hackerrank;

import java.util.Scanner;

class  intffa {
	 public static boolean canWin(int leap, int[] game, int a) {
		 if (game[a] == 1) return false;
		    if ((a == game.length - 1) || a + leap > game.length - 1) return true;

		    game[a] = 1;
		    //
		    return canWin(leap, game, a + 1) || canWin(leap, game, a + leap);
		}
	        
	    



	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 int a = 0;
	        int q = scan.nextInt();
	        while (q-- > 0) {
	            int n = scan.nextInt();
	            int leap = scan.nextInt();
	            
	            int[] game = new int[n];
	            for (int i = 0; i < n; i++) {
	                game[i] = scan.nextInt();
	            }

	            System.out.println( (canWin(leap, game, a)) ? "YES" : "NO" );
	        }
	        scan.close();
	    
	}
    }
	 


	