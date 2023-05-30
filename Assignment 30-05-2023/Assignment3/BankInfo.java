package assignment7;

public class BankInfo {
	
	public void saving() {
		System.out.println("Account No: XXXXXX1010 Balance: Rs.800.00 in Saving Account");
	}
	public void fixed() {
		System.out.println("Account No: XXXXXX7203 Balance: Rs.5000.00 in Fixed Deposit Account");
	}
	public void deposit() {
		System.out.println("Account No: XXXXXX8212 Credited for Rs 5000 in Current Deposit Account");
	}
	
	public static void main(String[] args) {
		BankInfo call = new BankInfo();
		call.saving();
		call.fixed();
		call.deposit();

	}

}
