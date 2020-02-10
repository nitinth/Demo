import java.util.HashMap;

public class StudentDemo 
{
	int age;
	String name;
	
	public StudentDemo(int age) 
	{
		this.age = age;
	}
	public String setName(String name)
	{
		this.name = name;
		return name;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentDemo other = (StudentDemo) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	public static void main(String[] args) 
	{
		HashMap<StudentDemo,String> map = new HashMap<StudentDemo,String>();
		StudentDemo s1 = new StudentDemo(10);
		StudentDemo s2 = new StudentDemo(10);
		map.put(s1, "India");
		s1.setName("hello");
		map.put(s2, "Delhi");
		System.out.println(map.size());
		System.out.println(map.get(s1));
		System.out.println(map.get(s2));
		
		
		
	}

	
}
