import java.util.ArrayList;
import java.util.List;

public class DomainName 
{
	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<>();
		list.add("nitin@gmail.com");
		list.add("nitin@yahoo.com");
		list.add("nitin@agreeya.com");
		for(String temp : list)
		{
		String[] dm = temp.split("@");
			if(dm[1].equals("gmail.com"))
			{
			System.out.println(temp  + " - " +"Domain is Google");
			}
			else if (dm[1].equals("yahoo.com"))
			{
				System.out.println(temp + " -  " + "Domain is Yahoo");
			}
		else
		{
			System.out.println(temp + " - " +"Private Domain");
		}
			
		}
		
	}

}
