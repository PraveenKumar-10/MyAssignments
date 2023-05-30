package assignment7;

public class AxisBank extends BankInfo{
	
	public  void deposit() {
		System.out.println("Account No: XXXXXX8212 Credited for Rs 2000 in Current Deposit Account");
	}
	
	public static void main(String[] args) {
		AxisBank call = new AxisBank();
		call.deposit();

	}

}
