import java.util.Arrays;

public class StringAnagrams 
{
	public static void main(String[] args) 
	{
		String s1 = "Mary";
		String s2 = "Army";
		anagram(s1,s2);
	}
	bool anagram(String s1,String s2)
	{
		if(s1.length() != s2.length())
		{
			return false;
		}
		else
		{
			char[] as1 = s1.toCharArray();
			char[] as2 = s1.toCharArray();
			Arrays.sort(as1);
			Arrays.sort(as2);
			if()
			
		}
	}
	
}
