package hackerrank;
		import java.io.BufferedReader;
		import java.io.IOException;
		import java.io.InputStreamReader;

		//Complete the classes below
		class Flower {
		    String whatsYourName(){
		        String s="I have many names and types";
		        return s;
		    }
		}

		class Jasmine extends Flower{
		    @Override
		    String whatsYourName(){

		        String s="Jasmine";
		        return s;
		    }
		}

		class Lily  extends Flower{
		     @Override
		    String whatsYourName(){
		        String s="Lily";
		        return s;
		    }
		}

		class Region {
		    Flower yourNationalFlower(){
		        Flower flower= new Flower();
		        return  flower;   
		    }
		}

		class WestBengal extends Region {
		    @Override
		    Flower yourNationalFlower(){
		      Flower flower= new Jasmine();
		      return flower;
		    }
		}

		class AndhraPradesh extends Region {
		    @Override
		    Flower yourNationalFlower(){
		        Flower flower= new Lily();
		      return flower;
		    }
		}


		public class overrideConcept {
		  public static void main(String[] args) throws IOException {
		      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		      String s = reader.readLine().trim();
		      Region region = null;
		      switch (s) {
		        case "WestBengal":
		          region = new WestBengal();
		          break;
		        case "AndhraPradesh":
		          region = new AndhraPradesh();
		          break;
		      }
		      Flower flower = region.yourNationalFlower();
		      System.out.println(flower.whatsYourName());
		    
			
		           
				}
			}
			




	

	

