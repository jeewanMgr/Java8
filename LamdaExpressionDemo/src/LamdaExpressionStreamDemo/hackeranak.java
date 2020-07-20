package LamdaExpressionStreamDemo;

public class hackeranak {
	
	 public static String decryptPassword(String s) {
		    // Write your code here
		        char []number = {'0','1','2','3','4','5','6','7','8','9'};
		       // int x = s.length();
		        String ans =" ";
		        for(int i=0;i<s.length();i++)
		        {
					if ((Character.isLowerCase(s.charAt(i))) 
							&& (Character.isUpperCase(s.charAt(i+1))) )
		            {
		                ans = ans + s.charAt(i+1) + s.charAt(i)+'*';
						//ans = ans + "jeewanM";
		                i = i+2;
		            } 
					
					  if(check(number,s.charAt(i))) { ans = s.charAt(i)+ans+ '0'; }
					 
		        }
		        return ans;
		    }

		    public static boolean check(char[] m , char j)
		    {
		        int x = m.length;
		        for(int i = 0;i<x;i++)
		        {
		            if(j ==m[i])
		                return true;
		        }
		        return false;
		    }
		    
		    public static void main(String[] args) {
		    	System.out.println(decryptPassword("aJ1e"));
			}

}
