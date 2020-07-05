package hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hashMap {

	
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
	
				Scanner in = new Scanner(System.in);
				String name;
				int phone;
				Map<Integer, String> hm= new HashMap<Integer, String>();
				int n=in.nextInt();
				in.nextLine();
				for(int i=0;i<n;i++)
				{
					 name=in.nextLine();
					 phone=in.nextInt();
					in.nextLine();
					hm.put(phone, name);
				}
				while(in.hasNext())
				{
					 String s=in.nextLine();
	                    int a=0;
	                    String b=null;
	                        for (Map.Entry<Integer, String> entry : hm.entrySet()) {
	                            if(s.equals(entry.getValue())) {
	                                a=entry.getKey();
	                                b=entry.getValue();
	                                }
	                            
	                        }
	                        if(a==0) {
	                            System.out.println("Not found");
	                        }
	                        else {
	                            System.out.println(b+"="+a);
	                        }
	                        
					}
		           
				}

	

	
}
