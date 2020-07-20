import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class GreetingTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> names = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13);
		List name = new ArrayList();
		name.add("jeewan");
		name.add("thapa");
		name.add("magar");
		
		
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

		//get list of unique squares
		List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
		
		System.out.println("This is map Stream collectin");
		printing(squaresList);
		System.out.println();
		System.out.println();
		
		GreetingDemo ans = (hello) -> System.out.println("Hello " +hello);
		ans.greete("Jeewan");
		
		name.forEach(System.out::println);
		
		System.out.println();
		System.out.println("Printing even numbers");
		
		eval(names, n->n%2 == 0);
		
		System.out.println();
		System.out.println("Printing only odd numbers");
		{
		  eval(names,n->n%2 ==1);
		}
		
		
	}
	
	
	public static void eval(List<Integer> list, Predicate<Integer> pred)
	{
		for(Integer n : list) {
			if(pred.test(n))
			{
				System.out.print(n+" ");
			}
		}
	}
	
	public static <T> void printing(List<T> data )
	{
		for(T t : data)
		{
			System.out.print(t+" ");
		}
	}

}

