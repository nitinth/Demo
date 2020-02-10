
public class WhiteSpaces
{
	public static void main(String[] args) {
		
		int count=0;
		String s = "My name is nitin";
		int l = s.length();
		for(int i=0;i<l;i++)
		{
			if(s.charAt(i) == ' ')
			{
				count++;
			}
		}
		System.out.println("Number of WhiteSpaces: " + count);
	}

}
