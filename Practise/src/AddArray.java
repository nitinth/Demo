import java.util.Arrays;

public class AddArray 
{
	public static void main(String[] args) {
		int[] a= {1,3,5,7};
		int[] b= {1,2,};
	
		int[] e = new int[a.length + b.length];
		 int pos = 0;
	        for (int element : a) {
	            e[pos] = element;
	            pos++;
	        }
	        for (int element : b) {
	            e[pos] = element;
	            pos++;
	        }
	        System.out.println(Arrays.toString(e));
	        
	        
		
	}

}
