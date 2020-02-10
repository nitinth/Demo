
public class DuplicateArrayRemove 
{
	public static void main(String[] args) 
	{
		int arr[] = {10,20,20,30,30,40,50,50};  
        int length = arr.length;  
        length = removeDuplicateElements(arr, length); 
        for (int i=0; i<length; i++)  
            System.out.print(arr[i]+" ");  
	}
     public static int removeDuplicateElements(int arr[],int n)
            {  
            	int[] temp = new int[n];  
           
            int j = 0;  
            for (int i=0; i<n-1; i++)
            {  
                if (arr[i] != arr[i+1])
                {  
                    temp[j++] = arr[i]; 
    		
                }
                
            	
            }

            }
}
