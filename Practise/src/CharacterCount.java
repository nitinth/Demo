import java.util.HashMap;

public class CharacterCount 
{
	public static void main(String[] args) {
		
		String s = "hi nitin";
		HashMap<Character,Integer> elementcount = new HashMap<Character,Integer>();
		
		char c1[] = s.toCharArray();
		for(char c : c1)
		{
			if( c!=' ')
			{
				if  (elementcount.containsKey(c))
				{
					elementcount.put(c, elementcount.get(c)+1);
				}
				else
				{
					elementcount.put(c, 1);
				}
			}
			
			
		}
		System.out.println(elementcount);
		
	}
	
}
