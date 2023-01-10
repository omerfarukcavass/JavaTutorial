package p8_mygenerics;

import java.util.ArrayList;

public class GenericsMore {

	public static void main(String[] args) {


		Object myObject=new Object();
		String myString="hello";
		myObject=myString;
		
		
		Employee emp=new Employee();
		Accountant acc=new Accountant();
		emp=acc; // Accountant is an Employee 
		
		
		ArrayList<Employee> emps=new ArrayList<>();
		emps.add(new Employee());
		emps.add(new Employee());
		
		ArrayList<Accountant> accs=new ArrayList<>();
		//emps=accs;    ArrayList<Accountant> is NOT an ArrayList<Employee>
		accs.add(new Accountant());
		accs.add(new Accountant());
		
		
		
		ArrayList<?> anyClasses=new ArrayList<>();  // list of "object"s
		anyClasses=emps;
		anyClasses=accs;
		
		
		ArrayList<? extends Employee> myEmployees=new ArrayList<>(); // list of any classes that extends(or implements) Employee.
		myEmployees=accs;
		myEmployees=emps; // Employee class is also included.	
		
		ArrayList<? super Employee> myEmployees2=new ArrayList<>(); // list of any classes that is superior to Employees
		// myEmployees2=accs; // Accountant is not superior to Employee
		myEmployees2=emps;
		
		ArrayList<Object> myObjs=new ArrayList<>();
		myEmployees2=myObjs;	// Object is superior to Employee
		
		
		
		makeEmployeeWork(accs);
		makeEmployeeWork(emps);
		
		
	}
	
	public static void makeEmployeeWork(ArrayList<? extends Employee> list) {
		for(Employee emp: list) {
			emp.work();
//			emp.workAsAccountant();			Cannot reach Accountant properties even though we put accountants
		}
		
		
//		for(Accountant acc: list) {			Does not work since method takes parameters as Employee. Even if we pass accountant arraylist
//			acc.work();						
//		}
		
		
	}
	

	
	
	
	

}
