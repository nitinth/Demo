
public class Finder
{
	public static void main(String[] args)
	{
		String name = "My name is nitin";
		String lowername = name.toLowerCase();
		String fname = "nitin";
		String n1[] = lowername.split("");
		for(int i=0;i<n1.length;i++)
		{
			if(n1[i].contains(fname))
			{
				System.out.println("Name found");
			}
			else
			{
			
				System.out.println("Name not found");
			}
		}
		}

}
