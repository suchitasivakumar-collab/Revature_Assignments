package com.LabFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeSerializationDemo {
	
	private static final String FILE_NAME = "employees.dat";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] employees = {
				new Employee(101, "Me", "Programming", 95000.00),
	            new Employee(102, "Kitty", "Sleeping", 88000.00),
	            new Employee(103, "Doggo", "Barking", 82000.00),
	            new Employee(104, "Jake", "Dancing", 76000.00),
	            new Employee(105, "Evan", "Singing", 91000.00)};
		
		writeEmployeesToFile(employees, FILE_NAME);
		Employee[] loadedEmployees = readEmployeesFromFile(FILE_NAME);
		
		System.out.println("Retrieved Employee Details:");
        for (Employee emp : loadedEmployees) {
            System.out.println(emp);
		}
	}
	private static Employee[] readEmployeesFromFile(String fileName) {
		// TODO Auto-generated method stub
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            Object obj = ois.readObject();
            if (obj instanceof Employee[]) {
                return (Employee[]) obj;
            }
            throw new ClassCastException("Expected Employee[] but got " + obj.getClass().getName());
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error reading employees from file: " + e.getMessage());
            e.printStackTrace();
        }
        return new Employee[0];
	}
	private static void writeEmployeesToFile(Employee[] employees, String fileName) {
		// TODO Auto-generated method stub
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(employees);
            System.out.println("Successfully wrote " + employees.length + " employees to " + fileName + ".\n");
        } catch (IOException e) {
            System.err.println("Error writing employees to file: " + e.getMessage());
            e.printStackTrace();
        }	
	}
}
