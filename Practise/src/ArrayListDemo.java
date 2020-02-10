
import java.util.HashMap;

public class ArrayListDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<>();
		map.put(1,"one");
		map.put(1,"one 1");
		map.put(1,"one 2");
		
		System.out.println(map.get(1));
		
	}
	
}
