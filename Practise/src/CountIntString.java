import java.util.ArrayList;

public class CountIntString
{
	public static void main(String[] args) {
		String s = "12AN345dpja";
		ArrayList<Integer> num=new ArrayList<Integer>();
		ArrayList<Character> chars=new ArrayList<Character>();
		for(int i = 0;i<s.length();i++)
		{
			if(Character.isDigit(s.charAt(i)))
			{
				num.add(Character.getNumericValue(s.charAt(i)));
			}
			else
			{
				chars.add(s.charAt(i));
			}
		
		}
		int sum=0;
		for (int j=0;j<num.size();j++) {
			sum=sum+num.get(j);
		}
		System.out.println(sum);
		System.out.println(num);
		System.out.println(chars);

	}

}
