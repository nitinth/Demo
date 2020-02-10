import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparable<Student>
{    
    String name;  
    int age;  
    Student(String name,int age){  
     this.name=name;  
     this.age=age;  
    }
    @Override
    public String toString() 
    { 
        return this.age + " " + this.name ;
    }
	@Override
	public int compareTo(Student s1) {
		// TODO Auto-generated method stub
		return this.age-s1.age;
	} 
    
  }  
public class StudentList 
{
	public static void main(String[] args) 
	{
		  
	    ArrayList<Student> al=new ArrayList<Student>();
	    al.add(new Student( "nitin", 21));
	    al.add(new Student( "ajay", 12));
	    al.add(new Student( "ankit",13));   

	    Collections.sort(al); 
	    
        System.out.println("\nSorted by Age"); 
        
        for (int i=0; i<al.size(); i++) 
        	
            System.out.println(al.get(i)); 
	   
	    
	}

}
class Sortbyroll implements Comparator<Student> 
{ 

    public int compare(Student a, Student b) 
    { 
    	System.out.println(a.age - b.age);
        return a.age - b.age; 
    } 
} 