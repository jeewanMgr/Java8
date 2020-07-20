package lamdaMethod;

import java.util.function.IntFunction;
import java.math.BigInteger;
import java.util.function.*;

public class LamdaMethodDemo {
	
	public static void main(String[] args) {
		
		IntFunction<String> one  = num -> Integer.toString(num);
		System.out.println("The string number is "+ one.apply(1245).length());
		
		// static method refersing using ::
		IntFunction<String> intoString = Integer::toString;
		System.out.println("The suppose length is: "+intoString.apply(4568).length());
		
		//using constructor
		Function<String,BigInteger> newBigInt = BigInteger::new;
		System.out.println("Expected value is 123456:  "+newBigInt.apply("123456") );
		
		//consumer
		Consumer<String> conOne = System.out::println;
		conOne.accept("Jeewan Thapa Magar");
		
		UnaryOperator<String> UnOne = "hello, "::concat;
		System.out.println(UnOne.apply("Jeewan"));	
		
	}

}
