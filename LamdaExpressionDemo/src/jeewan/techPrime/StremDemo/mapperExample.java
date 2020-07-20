package jeewan.techPrime.StremDemo;

import java.util.Arrays;
import java.util.List;

public class mapperExample {
	
	public static void main(String[] args) {
		List<String> names = Arrays.asList("jeewan","Thapa","Magar");
		
		for(String name :names)
		{
			if(name != "jeewan" || !name.equalsIgnoreCase("jeewan"))
			{
				System.out.println(name);
			}
		}
		
		
		System.out.println("Using functional Programming");
		//using stream  Functional 
			names.stream()
			.filter(name -> !name.equalsIgnoreCase("jeewan"))
			.map(User::new)
			.forEach(name -> System.out.println(name));
	}

}
