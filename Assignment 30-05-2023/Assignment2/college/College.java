package org.college;

public class College {
	
	public void collegeName() {
		System.out.println("St.Joseph's Institute of Technology");
	}
	public void collegeCode() {
		System.out.println("3124");
	}
	public void collegeRank() {
		System.out.println("74");
	}
	
	public static void main(String[] args) {
		College call = new College();
		call.collegeName();
		call.collegeCode();
		call.collegeRank();

	}

}
