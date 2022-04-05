package com.har.corejava;

public class Typecasting {
public static void main(String[] args) {
		
		System.out.println("Implicit Type Casting");//converting to implicit
		char a='H';
		System.out.println("Value of a is "+a);
		
		int b=a;
		System.out.println("Value of b is "+b);
		
		float c=a;
		System.out.println("Value of c is "+c);
		
		long d=a;
		System.out.println("Value of d is "+d);
		
		double e=a;
		System.out.println("Value of e is "+e);
		
				
		System.out.println("\n");
		
		System.out.println("Explicit Type Casting");
		
		double m=98.5;//converting to explicit
		int n=(int)m;
		float p=(float)m;
		System.out.println("Value of x is "+m);
		System.out.println("Value of y is "+n);
		System.out.println("Value of p is "+p);
		
	}
}


