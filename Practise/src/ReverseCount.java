import java.util.Scanner;

public class ReverseCount
{
	static String s3="";
	static String s4 = "";
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first string");
		String s1 = input.nextLine();
		System.out.println("Enter the 2nd string");
		String s2 = input.nextLine();
		ReverseCount rs = new ReverseCount();
	  rs.test_word(s1, s2);
	  System.out.println(s3);
	  System.out.println(s4);
	if(s3.equals(s4))
	{
	System.out.println("working");	
	}
	else
	{
		System.out.println("not working");
	}
	
	}
	
	public String test_word(String s1,String s2)
	{
		
		int c =0;
		
			for(int i=s1.length()-1;i<s1.length();i--)
			{
			c=c+1;
		
				if(c==11)
				{
					break;
				}
				else
					
				{
					 s3 = s3+s1.charAt(i);
					
				}
			
			}

			int k =0;
			
			for(int i=s2.length()-1;i<s2.length();i--)
			{
			k=k+1;
		
				if(k==11)
				{
					break;
				}
				else
				{
					 s4 = s4+s2.charAt(i);
					
				}
				
			}
		return s4;
	}

}
