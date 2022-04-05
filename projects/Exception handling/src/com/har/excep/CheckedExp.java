package com.har.excep;



public class CheckedExp {

	public static void main(String[] args) {
		try {
			System.out.println("Hello world");
			Thread.sleep(2000);//execute nxt output after 2second
			System.out.println("Guys");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//checkedexp->interupted error
	}

}
