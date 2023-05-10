package Assignment3;

public class EmployeeDetails {
	
	public void getEmployeeNameAndId(String empName,int empId) {
		System.out.println("Employee Name & ID : " + empName + "& " + empId);
	}
	public void getEmployeeAddress(String empAddress) {
		System.out.println("Address            : " + empAddress);
	}
	public void getEmployeeSalary(double empSalary) {
		System.out.println("Salary             : " + empSalary);
	}
	public void getEmployeeMobileNumber(long mobileNumber) {
		System.out.println("Mobile Number      : " + mobileNumber);
	}
	public static void main(String[] args) {
		EmployeeDetails call = new EmployeeDetails();
		call.getEmployeeNameAndId("Praveen Kumar ", 1111);
		call.getEmployeeAddress("Chennai");
		call.getEmployeeSalary(29000.0);
		call.getEmployeeMobileNumber(8248777090L);
		

	}

}
