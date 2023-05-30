package org.department;

import org.college.College;

public class Department extends College{
	
	public void departmentName() {
		System.out.println("ECE");
	}
	
	public static void main(String[] args) {
		Department call = new Department();
		call.departmentName();

	}

}
