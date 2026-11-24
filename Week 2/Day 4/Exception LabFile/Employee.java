package com.LabFile;

import java.io.Serializable;

public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;
	
	int empId;
	String empName;
	String department;
	double salary;

	Employee(int empId, String empName, String department, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.department = department;
		this.salary = salary; 
	}
	
	public int getEmpId() {
		return empId;
	}
	
	public String getEmpName() {
        return empName;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Employee [ID=%d, Name='%s', Department='%s', Salary=%.2f]",
				empId, empName, department, salary);
	}
    
}
