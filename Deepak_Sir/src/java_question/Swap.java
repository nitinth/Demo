package java_question;

import java.util.Scanner;

public class Swap 
{
  public static void main(String[] args)
  {
	  System.out.println("Enter value of A ");
	   @SuppressWarnings("resource")
	Scanner s = new Scanner(System.in);
	   int a = s.nextInt();
	   System.out.println("Enter value of B ");
	int b = s.nextInt();	   
	int c;
	c=a;
	a=b;
	b=c;
	System.out.println("Value of A and B after swapping");
	System.out.println("Value of a"  +  a);
	System.out.println("Value of b"  +  b );
}
}
