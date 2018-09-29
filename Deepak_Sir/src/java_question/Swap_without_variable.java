package java_question;

public class Swap_without_variable 
{
	public static void main(String[] args)
	{
		int a = 9;
		int b =11;
		a = a+b;  
		b = a-b; 
		a = a-b;
		System.out.println("After swapping a = " + a);
		System.out.println("After swapping b = " + b);
		
	}

}
