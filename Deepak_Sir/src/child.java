
public class child extends Demo
{
	public child()
		{
			System.out.println("child Default");
		}
		public child(int a)
		{
			System.out.println("child 1 para");
		}
		public child(int a, int b)
		{
			System.out.println("child 2 para");
		}
	public static void main(String...x)
	{
		@SuppressWarnings("unused")
		child c1 = new child();
	}
}
