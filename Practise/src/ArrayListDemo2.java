import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2
{
public static void main(String[] args) {
	ArrayList<String> al = new ArrayList<>();
	al.add("nitin");
	al.add("thalia");
	Iterator<String> i = al.iterator();
	while(i.hasNext())
	String s = 	i.next();
	System.out.println(s);
	}
	
}

}
