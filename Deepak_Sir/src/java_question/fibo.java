package java_question;

import java.util.Scanner;

public class fibo 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("Enter the lenght of fiboo ");
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int a=0;
		int b =1;
		int c;
		System.out.println(a);
		System.out.println(a+b);
		for(int i=2;i<x;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
	}

}
