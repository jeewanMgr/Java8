package jeewan.lamdaExpressionCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class javaFilterperson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<person> data = Arrays.asList(
				 new person("jeewan", 23),
				 new person("anisha",25),
				 new person("magar",26)
				);
		
		int[] arr = {13, 7, 6, 45, 21, 9, 2, 100};
		//System.out.println(arrayNumbers(arr));
		//System.out.println(Math.abs(7-8));
		System.out.println(funnyString("lmnop"));
		
	}
	
	
	
	public static String funnyString(String s)
	{
		 boolean y = false;
	        char[] a = s.toCharArray();
	        List ont = new ArrayList();
	        List one = new ArrayList();
	        List answer = new ArrayList();
	        List Answer = new ArrayList();
	        for(int i =0; i<a.length;i++)
	        {
	            ont.add((int)a[i]);
	        }
	        
	        int si = ont.size();
	        for(int j =0;j<a.length;j++)
	        {
	        	one.add(j, ont.get(si-1));
	        	si--;
	        }
	     
	        int index = 1;
	        for(int l =0;l<ont.size();l++)
	        {
	        	int value =(Integer)ont.get(l) - (Integer)ont.get(index);
	        	answer.add(Math.abs(value));
	        	index++;
	        	if(index >= ont.size())
	        	{
	        		break;
	        	}
	        }
	        int index2 = 1;
	        for(int l =0;l<one.size();l++)
	        {
	        	int value =(Integer)one.get(l) - (Integer)one.get(index2);
	        	Answer.add(Math.abs(value));
	        	index++;
	        	if(index2 >= one.size())
	        	{
	        		break;
	        	}
	        }
	        
	        if(answer.equals(Answer))
	        {
	        	return "FUNNY";
	        }
	        
	        
	       return "NOT FUNNY";
	}
	
	
	public static int arrayNumbers(int[] j)
	{
		int sum1=0,sum2 =0;
		boolean m = true;
		int index = 0;
		int[] k = j.clone();
		Arrays.sort(j);
		for(int i = 0;i<k.length;i++)
		{
			if(j[0]!=k[i])
			{
				
				index++;
				
			}else {m =false;}
			if(m == false)
			{
				break;
			}
		}
		
		for(int r =0;r<=index;r++)
		{
			sum1 = sum1+ k[r];
		}
		for(int l =index+1;l<k.length;l++)
		{
			sum2 = sum2+k[l];
		}
		
		if(sum1<sum2)
		{
			return sum2-sum1;
		} else if(sum1>sum2) {
			return sum1-sum2;
		}
		
		
		
		
		
		return 0;
	}
	
	

}
