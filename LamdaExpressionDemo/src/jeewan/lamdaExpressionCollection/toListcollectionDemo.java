package jeewan.lamdaExpressionCollection;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class toListcollectionDemo {
	
	public static void main(String[] args) {
		List<String> givenList = Arrays.asList("a", "bb", "ccc", "dd","dd","a");
		List<String> result = givenList.stream()
				  .collect(Collectors.toList());
	//	print(result);
		System.out.println();
		Set<String> answer = givenList.stream()
				.collect(Collectors.toSet());
		
		
	}
	
	
	
	public static <T> void print(List<T> answer)
	{
		for(T a : answer)
		{
			System.out.println(a);
		}
	}

}
