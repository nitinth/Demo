
public class ReplaceMethod
{
	public static void main(String[] args) 
	{
		String temp="";
		String a = "a,b,c,d";
		String b = a.replaceAll(",",".");
		System.out.println(a);
		for(int i=b.length()-1;i>=0;i--)
		{
			temp = temp + b.charAt(i);
			
		}
		System.out.println(temp);
	}

}
