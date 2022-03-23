package com.har.corejava;


//Parameterized constructor
class Constructors{

	  String sports;
	  Constructors(String a) {
	    sports = a;
	    System.out.println(sports +  "Is a Outdoor Sport");
	  }

	  public static void main(String[] args) {

		  Constructors num1 = new Constructors("Cricket");
		  Constructors num2 = new Constructors("Football");
	    Constructors num3 = new Constructors("Hockey");
	  }
	}
