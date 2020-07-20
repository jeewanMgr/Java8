package jeewan.techPrime.StremDemo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class flatStreamDemo {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("jeewan","Thapa","Magar");
		
		List<User> nameCollect = Arrays.asList(
				new User("jeewan",20,Arrays.asList("5","6")),
				new User("thapa",20,Arrays.asList("7","8")),
				new User("magar",20,Arrays.asList("11","9","10")),
				new User("sen",20,Arrays.asList("12","14","16"))
				);
		
		
		Optional<String> option = nameCollect.stream()
		.map(user -> user.getPhonenumber().stream())
		.flatMap(StringStream -> StringStream.filter(phonenumber ->phonenumber.equals("4")))
		.findAny();
		
		option.ifPresent(System.out::println);
	}
	
}
