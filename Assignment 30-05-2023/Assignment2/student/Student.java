package org.student;

import org.department.Department;

public class Student extends Department{
	
	public void studentName() {
		System.out.println("Praveen Kumar");
	}
	public void studentDepartment() {
		System.out.println("ECE");
	}
	public void studentID() {
		System.out.println("1010");
	}
	
	public static void main(String[] args) {
		Student call = new Student();
		call.collegeName();
		call.collegeCode();
		call.collegeRank();
		call.departmentName();
		call.studentName();
		call.studentDepartment();
		call.studentID();
		

	}

}
