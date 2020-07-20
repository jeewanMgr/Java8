package lamdaMethod;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class lamdaDemo {
	
	public static void main(String[] args) {
		//Predicate accept only one argument and return True or False.
		Predicate<String> strleng = (a) -> a.length() > 10;
		System.out.println(strleng.test("jeewan"));
		
		
		
		//Consumer take one argument and 
		Consumer<String> m = (s) -> System.out.println(s.toLowerCase());
		m.accept("JEEWAN");
		
		//Function methods
		Function<Integer,String> converter = (nums) -> Integer.toString(nums);
		System.out.println("length of 26 is: "+ converter.apply(26).length());
		System.out.println(converter.apply(26).codePointAt(0));
		
		
		Supplier<String> one  = ()-> "java is fun";
		System.out.println(one.get());
		
	}
	
	

}
