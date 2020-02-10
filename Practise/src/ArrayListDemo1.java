import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<>();
		int x[]= {1,2,-1,-3,-9,0,1,4};
		for(int i=0;i<x.length;i++)
		{
			al.add(x[i]);
		}
	Iterator<Integer> i = al.iterator();
	while(i.hasNext())
	{
		Integer z = (Integer)i.next();
		if(z.intValue()<0)
		  i.remove();	
	}
	
	System.out.println(al);
	}
  
	
	
}
