
public class StringReverseWord 
{
	public static void main(String[] args) 
	{
		String s1 = "Automation testing and API testing";
		String reverseword = "";
		String word[] = s1.split(" ");
		for(int i=0;i<word.length;i++)
		{
			String s2 = word[i];
			String reverse = "";
			for(int j=s2.length()-1;j>=0;j--)
			{
				reverse = reverse + s2.charAt(j);
			}

			reverseword = reverseword + reverse + " ";
		}
		System.out.println("Original String : " +  s1);
		System.out.println("Reverse String  : " + reverseword);
	}

}
