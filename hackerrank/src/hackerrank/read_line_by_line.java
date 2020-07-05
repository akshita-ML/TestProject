package hackerrank;

import java.awt.List;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class read_line_by_line {

	public static void main(String[] args) {
		int i=0;
	Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			Scanner lineScanner = new Scanner(scanner.nextLine());
			
			//for(i=1; i<lineScanner.nextLine(); i++) {
			while (lineScanner.hasNext()) {
				i+=1;
				System.out.printf("%d %s" , i,lineScanner.nextLine());
				
				
			}
			
			//}
			
			lineScanner.close();
		
		}

		scanner.close();
		}  
	}

