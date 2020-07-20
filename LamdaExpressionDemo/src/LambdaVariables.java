
public class LambdaVariables {
 static String name ="jeewan";
 
 public static void doIt()
 {
	 String lastName ="Thapa Magar";
	 
	 myInterface  one = (text) ->{
		 System.out.println(text+lastName + name);
	 };
	 
	 one.println("Hello: ");
	 
	// lastName ="magar"; Local variable should be final or unchangeable.
	name ="Hello Jeewan Thapa magar";
	one.println("MR. " );
	 
 }
 
 
	public static void main(String[] args) {
		
		LambdaVariables.doIt();
		
	}
	
}
