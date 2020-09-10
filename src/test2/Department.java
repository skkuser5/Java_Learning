package test2;

import test.Employee;

public class Department extends Employee{
		
	
	public static void main(String[] args) {
		//Employee emp = new Employee();
		Department dept = new Department();
		System.out.println(dept.orgCountry);
		
		System.out.println(dept.getOrgCountry());
	}
	
	public void printDeptName() {
		
		System.out.println("this is to print Dept Name");
		
	}

}
