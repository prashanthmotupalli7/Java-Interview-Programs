package test;

import java.util.Comparator;

public class Employee {

	private int empId;
	private String empName;
	private String empGender;
	private double empSalary;
	private int dateOfJoin;
	public Employee() {
		
	}
	public Employee(int empId, String empName, String empGender, double empSalary, int dateOfJoin) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empGender = empGender;
		this.empSalary = empSalary;
		this.dateOfJoin = dateOfJoin;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empGender=" + empGender + ", empSalary="
				+ empSalary + ", dateOfJoin=" + dateOfJoin + "]";
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpGender() {
		return empGender;
	}
	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public int getDateOfJoin() {
		return dateOfJoin;
	}
	public void setDateOfJoin(int dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}

class DateOfJoin implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Integer.compare(e1.getDateOfJoin(), e2.getDateOfJoin());
    }
}
	
}
