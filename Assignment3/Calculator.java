package Assignment3;

public class Calculator {
		
	public void additionTwoNumber(int a,int b) {
		int c = a+b;
		System.out.println(c);
	}
	public void subractionTwoNumber(int e,int f) {
		int d = e-f;
		System.out.println(d);
	}
	public void multipleTwoNumber(double i,double j) {
		double g = i*j;
		System.out.println(g);
	}
	public void divideTwoNumber(float x,float y) {
		float z = x/y;
		System.out.println(z);
	}
	

	public static void main(String[] args) {
		Calculator calu = new Calculator();
		calu.additionTwoNumber(10, 2);
		calu.subractionTwoNumber(999,475);
		calu.multipleTwoNumber(11,9);
		calu.divideTwoNumber(22,7);

	}

}
