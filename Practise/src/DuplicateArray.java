import java.util.HashSet;
import java.util.Set;

public class DuplicateArray 
{
	public static void main(String[] args) {
		int arr[] = {1,2,3,1,2,4,4,1};
		Set<Integer> s1 = new HashSet<Integer>();
		Set<Integer> s2 = new HashSet<Integer>();
		for(int i : arr)
		{
			if(!s1.add(i))
			{
				s2.add(i);
			}
		}
		System.out.println(s1);
		System.out.println("Duplicate array " + s2);
		s1.removeAll(s2);
		System.out.println(s1);

	}

}
