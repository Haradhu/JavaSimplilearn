package com.har.diamond;


public class Temp implements First , Second{
	
	
	
	public void show() {
		
		First.super.show();
		Second.super.show();
		
	}


	public static void main(String[] args) {
		
			Temp test = new Temp();
			
			test.show();
		
	}


}

