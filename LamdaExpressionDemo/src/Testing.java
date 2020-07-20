
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Testing {

	
   public static void doIt()
   {
	   
   }
	
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		List<String> data = Arrays.asList("jeewan","thapa","magar");
				//Array.asList("jeewan","thapa","magar");
		myInterface inter = (String sayit) ->{
			System.out.println(sayit);
		};
		
		
		inter.println("Jeewan Magar");
		inter.printUtf8To("hello jeewan magar", new FileOutputStream("dataJeewan.txt"));

	}

}
