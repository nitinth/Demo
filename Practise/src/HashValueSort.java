import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashValueSort 
{
	public static void main(String[] args) {
		
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		map.put("nitin",21);
		map.put("ankit",41);
		map.put("pankaj",1);
		map.put("sachin",121);
		map.put("ritu",211);
		//sorting keys
		List<String> ls=new ArrayList<String>();
		for (String s:map.keySet())
		{
			ls.add(s);
		}
		
		// Sorting on Value 
		HashMap<String,Integer> map1 = new HashMap<String,Integer>();
		Collections.sort(ls);
		 for (String s:ls)
		 {
			 map1.put(s, map.get(s));
			 System.out.println(s+ " : " +map.get(s));
		 }
		 
		 // Sorting on Key
		List<Map.Entry<String,Integer>> lm  = new ArrayList<Map.Entry<String,Integer>>(map.entrySet());
		Collections.sort(lm,new Comparator<Map.Entry<String,Integer>>() 
		{

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) 
			{
				return o1.getValue().compareTo(o2.getValue());
			}
			
		});
		
		LinkedHashMap<String,Integer> map2 = new LinkedHashMap<String,Integer>();
		 for (Map.Entry<String,Integer> m:lm)
		 {
			 
			 map2.put(m.getKey(), m.getValue());
			 
		 }
			
		 System.out.println(map2);
		 
		 //sorting values
	}

}
