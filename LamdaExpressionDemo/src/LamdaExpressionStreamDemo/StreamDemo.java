package LamdaExpressionStreamDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		List<String> mylist = Arrays.asList("jeewan","magar","ThapaMagar","HereIam");
		mylist.stream()
		.filter(s->s.startsWith("j"))
		.map(String::toUpperCase)
		.sorted()
		.forEach(System.out::println);
		
		System.out.println("-===============-");
		
		Stream.of("a1", "a2", "a3")
	    .findFirst()
	    .ifPresent(System.out::println);  // a1
	}
	
}
