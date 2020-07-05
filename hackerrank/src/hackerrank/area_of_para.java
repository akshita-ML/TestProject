package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class area_of_para {
	static boolean flag= true;
	static int B;
	static int H;
	static{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 try {
			B= Integer.parseInt(br.readLine());
              try {
				H= Integer.parseInt(br.readLine());
				if(H<=0 || B<=0) {
				     throw new IllegalArgumentException("java.lang.Exception: Breadth and height must be positive"); 
				}      
			} 
		 catch (IllegalArgumentException | IOException e) {
				flag= false;
				    System.out.println(e.getMessage());
			} 
		  } catch (NumberFormatException e1) {
			
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		 }
	public static void main(String[] args){
			if(flag){
				int area=B*H;
				System.out.print(area);
			}
		}
	}



	