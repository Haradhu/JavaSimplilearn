package com.har.keyc;

public class ThrowsDemo {
	void Division() throws ArithmeticException {
		double a = 45.5, b = 9, c;
		c = a / b;
		System.out.print("\n\tThe result is : " + c);
	}

	public static void main(String[] args) {
		ThrowsDemo T = new ThrowsDemo();
		try {
			T.Division();
		} catch (ArithmeticException Ex) {
			System.out.print("\n\tError : " + Ex.getMessage());
		}
		System.out.print("\n\tEnd of program.");
	}
}
