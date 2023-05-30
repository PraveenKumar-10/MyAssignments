package org.system;

public class Desktop extends Computer{

	public void desktopSize() {
		System.out.println("24 inch");
	}
	
	public static void main(String[] args) {
	Desktop call = new Desktop();
	call.desktopSize();
	call.computerModel();
	

	}

}
