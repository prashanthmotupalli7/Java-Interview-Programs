package test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Student{
	String name ;
	int marks;
	public Student() {
}
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}
	
	
}


public class StreamSortExample {
	public static void main(String[] args) {
		
	List<Student> students=new ArrayList<>();
	students.add(new Student("Alice", 85));
    students.add(new Student("Bob", 78));
    students.add(new Student("Charlie", 92));
    students.add(new Student("David", 60));
    
    List<Student> ascendingOrder=students.stream().sorted(Comparator.comparing(Student::getMarks)).collect(Collectors.toList());
    List<Student> desscendingOrder=students.stream().sorted(Comparator.comparing(Student::getMarks).reversed()).collect(Collectors.toList());
System.out.println(ascendingOrder);
System.out.println(desscendingOrder);



}

}