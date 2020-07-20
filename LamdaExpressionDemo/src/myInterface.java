import java.io.IOException;
import java.io.OutputStream;


public interface myInterface {
	
	void println(String text);
	
	default public void printUtf8To(String text, OutputStream outputstream)
	{
		
		//outputstream.write(text.getBytes("UTF-8"));
		try	{
		outputstream.write(text.getBytes("UTF-8"));
		}catch(IOException e)
		{
			throw new RuntimeException("Error writing String as UTF-8 to outputstream");
		}
	}
	
	
	static void printittoSystemOut(String text)
	{
		System.out.println(text);
	}

}
