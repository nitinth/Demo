
public class CheckIfArrayIsSorted
{
	public static void main(String[] args)
	{
		
		CheckIfArrayIsSorted arraysort = new CheckIfArrayIsSorted();
		int[] arr = new int[] {1,2,3};
		System.out.println(arraysort.isSortedIterative(arr));
	}
	 public boolean isSortedIterative(int arr[])
	 {
	        if (arr == null) {
	            return true;
	        }
	        boolean status = true;
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i-1] > arr[i]) {
	                status = false;
	                break;
	            }
	        }
	        return status;
	    }
	
}


