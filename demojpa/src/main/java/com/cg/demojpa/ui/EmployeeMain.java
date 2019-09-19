package com.cg.demojpa.ui;

import java.util.Scanner;

import com.cg.demojpa.dto.Employee;
import com.cg.demojpa.service.*;

public class EmployeeMain {

	public static void main(String args[]) {
		
		EmployeeService service=new EmployeeServiceImpl();
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter id");
		int id=scr.nextInt();
		System.out.println("Enter name");
		String name=scr.next();
		System.out.println("Enter salary");
		double sal=scr.nextDouble();
		Employee emp=new Employee();
		emp.setEmpId(id);
		emp.setEmpName(name);
		emp.setEmpSalary(sal);
		service.addEmployee(emp);
	
	}
	
}
