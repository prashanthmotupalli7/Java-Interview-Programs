package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTest {
	public static void main(String[] args) {
		

List<Employee> employees=new ArrayList<>();
employees.add(new Employee(1, "Alice", "Female", 55000, 2015));
employees.add(new Employee(2, "Bob", "Male", 50000, 2018));
employees.add(new Employee(3, "Charlie", "Male", 65000, 2016));
employees.add(new Employee(4, "Daisy", "Female", 58000, 2020));
employees.add(new Employee(5, "Edward", "Male", 62000, 2017));
employees.add(new Employee(6, "Fiona", "Female", 60000, 2019));
employees.add(new Employee(7, "George", "Male", 54000, 2014));
employees.add(new Employee(8, "Hannah", "Female", 57000, 2021));
employees.add(new Employee(9, "Ian", "Male", 53000, 2015));
employees.add(new Employee(10, "Jane", "Female", 52000, 2016));

//sort an employee based on their salary
List<Employee> empBySorted=employees.stream().sorted(Comparator.comparingDouble(Employee::getEmpSalary)).collect(Collectors.toList());
System.out.println("Employee Details by sorted order "+empBySorted);

List<Employee> empBySortedRev=employees.stream().sorted(Comparator.comparingDouble(Employee::getEmpSalary).reversed()).collect(Collectors.toList());
System.out.println("Employee Details in reverse sorted order "+empBySortedRev);

System.out.println("PRINTING MALE EMPLOYEES WHO JOINED AFTER 2016");

employees.stream().filter(e->"Male".equals(e.getEmpGender()) && e.getDateOfJoin()>2016)
		.map(Employee::getEmpName)
		.forEach(System.out::println);

System.out.println("PRINTING FEMALE EMPLOYEES WHOS  SALARY GREATER THAN  50000");

employees.stream().filter(e->"Female".equals(e.getEmpGender()) && e.getEmpSalary()>50000)
.map(Employee::getEmpName)
.forEach(System.out::println);


System.out.println("PRINTING  EMPLOYEES WHOS  NAME CONTAINS A ");
employees.stream().filter(e->e.getEmpName().contains("a"))
.map(Employee::getEmpName)
.forEach(System.out::println);

System.out.println("Incrementing   Employees  Salary   with 30 percent who joined after 2018 ");
for(Employee e : employees) {
	if(e.getDateOfJoin()>2018) {
		double newSalary =  e.getEmpSalary()*1.30;
		e.setEmpSalary(newSalary);
	}
	employees.stream().forEach(System.out::println);	

}


//Sorting employees based on their joining date 
List<Employee> sortedEmployees = employees.stream()
.sorted((e1, e2) -> Integer.compare(e1.getDateOfJoin(), e2.getDateOfJoin()))
.collect(Collectors.toList());
sortedEmployees.forEach(emp->System.out.println(emp.getEmpName()+" : "+emp.getEmpSalary()));
}
}