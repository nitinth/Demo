package java_question;

import java.util.Scanner;

public class Reverse_Number 
{
	public static void main(String[] args)
	{
		System.out.println("Enter the number u want to revers");
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int x1=x;
		int reverse=0;
		while(x !=0 )
		{
			reverse = (reverse*10)+(x%10);
            x = x/10;
		}
		System.out.println(reverse);
		
		if(reverse == x1)
		{
			System.out.println("number is palli");
			
		}
		else
		{
			System.out.println("number is not palli");
		}
	}

}
