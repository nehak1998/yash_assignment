import java.util.*;
import java.util.stream.Collectors;
class Student{
	String name;
	int marks;
	Student(String name,int marks)
	{
		this.name	=	name;
		this.marks	=	marks;
	}
}
public class AverageMarks{
	public static void main(String args[])
	{
		List<Student> s	= new ArrayList<Student>();
		s.add(new Student("Neha",90));
		s.add(new Student("Prajakta",85));
		s.add(new Student("Kanchan",70));
		s.add(new Student("Sneha",98));
		
		double avg	=	s.stream().collect(Collectors.averagingInt(emp -> emp.marks));
		System.out.println("Average Marks : "+avg);
	}
}
