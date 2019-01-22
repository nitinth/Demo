import java.util.Arrays;
import java.util.HashMap;

class Count
{
public static void main(String...s)
{
  int inputArray[] ={2,4,1,6,1,1,6,7,8};

HashMap <Integer,Integer> elementCountMap = new HashMap<Integer,Integer>();

for (int i : inputArray)
            if(elementCountMap.containsKey(i))
            {
                //If element is present in elementCountMap, incrementing it's count by 1
                 
                elementCountMap.put(i, elementCountMap.get(i)+1);
            }
            else
            {
                //If element is not present in elementCountMap, 
                //adding this element to elementCountMap with 1 as it's value
                 
                elementCountMap.put(i, 1);
           }
System.out.println("Input Array : "+ Arrays.toString(inputArray));

System.out.println("Element Count : "+elementCountMap); 

}
}
         
      
