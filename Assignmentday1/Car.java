package Assignmentday1;

public class Car {
	public void Window() {
		System.out.println("Close all windows ");
	}
	public void AC() {
		System.out.println("Switch on the AC");
	}
	public void Clutch() {
		System.out.println("Press the Clutch and start the car");
	}
	public void Handbrake() {
		System.out.println("Release the handbrake");
	}
	public void Gear() {
		System.out.println("Push the gear from neutral to first gear");
	}

	public static void main(String[] args) {
		Car action = new Car();
		action.Window();
		action.AC();
		action.Clutch();
		action.Handbrake();
		action.Gear();
	}

}
