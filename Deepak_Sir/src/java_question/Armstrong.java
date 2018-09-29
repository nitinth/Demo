package java_question;

import java.util.Scanner;

public class Armstrong
{
	public static void main(String[] args)
	{
		System.out.println("Enter the number: ");
		int a;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
	   String s1 = Integer.toString(a);
	int y[] = new int[a];
		int sum =0;
		for(int i = 0 ;i<s1.length();i++)
		{
	y[i]=Character.getNumericValue(s1.charAt(i));
		    
			sum += y[i]*y[i]*y[i];
		}
		if(sum==a)
		{
			System.out.println("Number is armstrong");
		}
		else
		{
			System.out.println("Number is not armstrong");
		}
	}

}
