abstract class AClass
{
	 public AClass() 
	{
		System.out.println("Cons");
	}
	public void test() 
	{
		System.out.println("HI");
	}
	abstract public void test1();
	abstract public void test2();
	
	
}


public class Demo implements Inter
{
	public Demo()
	{
		System.out.println("Baby Cons");
	}
	public static void main(String[] args) 
	{
		Demo aClass = new Demo();
		System.out.println(a);
		aClass.test();
		aClass.test1();
		aClass.test2();
		aClass.test3();
		
		
	}
	@Override
	public void test1() {
		System.out.println("test 1");
		
	}

	@Override
	public void test2() {
		System.out.println("test 2");
		
	}
	@Override
	public void test() {
		System.out.println("test 2");
		
	}
}