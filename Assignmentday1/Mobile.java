package Assignmentday1;

public class Mobile {
	public void Call() {
		System.out.println("To Make a call");
	}
	public void Camera() {
		System.out.println("To record video or  capturn image");
	}
	public void Whatsapp() {
		System.out.println("To send a message");
	}
	public void Youtube () {
		System.out.println("Watch videos");
	}
	public void Games() {
		System.out.println("Play games");
	}
	public static void main(String[] args) {
		Mobile action = new Mobile();
		action.Call();
		action.Camera();
		action.Whatsapp();
		action.Youtube();
		action.Games();
	}

}
