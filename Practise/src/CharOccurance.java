import java.util.HashMap;

public class CharOccurance 
{
	public static void main(String[] args) 
	{
		String s = "nitin thalia";
		
		HashMap<Character,Integer> elementcount = new HashMap<Character,Integer>();
		
		char[] c1 = s.toCharArray();
		for(char c : c1 )
		{
			if(elementcount.containsKey(c))
			{
				elementcount.put(c, elementcount.get(c)+1);
			}
			else
			{
			elementcount.put(c, 1);
			}
		}
		System.out.println(s);
 		System.out.println(elementcount);
	}

}
