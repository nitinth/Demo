
public class AllSmallPrograme 
{
	public static void factor(int num)
	{
		int fact = 1;
		for(int i=1;i<=num;i++)
		{
			fact *= i;			
		}
		System.out.println(fact);
	}
	public static void fibo(int num)
	{
		int a=1,b=1;
		int c=0;
		System.out.print(a+" "+b);
		
		for(int i =2;i<num;i++)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}
	public static void StringReverse(String name)
	{
	String reverse = "";
		for(int i=name.length()-1;i>=0;i--)
		{
			reverse = reverse + name.charAt(i);		
		}
		System.out.println(reverse);
	}
	public static void checkprime(int num)
	{
		boolean flag = false;
		for(int i =2;i<=num/2;i++)
		{
			if(num%2 == 0)
			{
				flag = true;
				break;
			}
		}
		if(!flag)
			System.out.println("Prime numerber");
		else
			System.out.println("Not a prime number");
		
	}
	
	
	
	
	public static void main(String[] args)
	{
		factor(5);
		fibo(10);
		StringReverse("ankit");
		checkprime(29);
		
	}
	
	
}
