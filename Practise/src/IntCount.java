import java.util.Arrays;
import java.util.HashMap;

class IntCount
{
public static void main(String...s)
{
  int inputArray[] ={1,0,0,1,1,0,0,1,1};

HashMap <Integer,Integer> elementCountMap = new HashMap<Integer,Integer>();

for (int i : inputArray)
            if(elementCountMap.containsKey(i))
            {     
                elementCountMap.put(i, elementCountMap.get(i)+1);
            }
            else
            {
                elementCountMap.put(i, 1);
            }
System.out.println("Input Array : "+ Arrays.toString(inputArray));
System.out.println("Element Count : "+elementCountMap); 
}
}