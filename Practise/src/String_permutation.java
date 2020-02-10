
public class String_permutation 
{
	public static void main(String[] args) 
	{
		String str ="ABC";
		(int i = 0; i < str.length(); i++) { 
			  
            char ch = str.charAt(i); 
  
            // Rest of the string after excluding  
            // the ith character 
            String ros = str.substring(0, i) + str.substring(i + 1); 
  
            // Recurvise call 
            printPermutn(ros, ans + ch); 
        } 
		
	}

}
