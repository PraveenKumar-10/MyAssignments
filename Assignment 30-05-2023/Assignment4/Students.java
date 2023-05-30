package assignment7;

public class Students {
	
	public void getStudentInfo(int ID) {
		System.out.println("ID: " + ID);
	}
	public void getStudentInfo(int ID, String Name) {
		System.out.println("ID: " + ID + " & " + "Name: " + Name);
	}
	public void getStudentInfo(String email, long phoneNumber) {
		System.out.println("Email: " + email + " & " + "Phone Number: " + phoneNumber);
	}
	
	
	public static void main(String[] args) {
		Students call = new Students();
		call.getStudentInfo(1111);
		call.getStudentInfo(1111, "PraveenKumar");
		call.getStudentInfo("testleaf10@gmail.com", 9566824877L);
	}

}
