package com.har.excep;



public class UncheckedExp{

	public static void main(String[] args) {
		int num=100;//int result;
		System.out.println("Open file");
		System.out.println("Read file");
		System.out.println("process data");
		//try {
		int result=num/0;//termination occurs due to developer given wrong data as num/0 instead of num/10
		 //result=UnexpectededExpdemo.div(4,2);//main caller
			//catch(ArithmeticException e)
		//}}
		System.out.println(result);//output will display till line 9 because in line 10 only exception occurd so nxt lines will not be displayed
		System.out.println("close file");
	}
/*public static int div(int num1,int num2)throws ArithmeticException { //this method it is callee
	return num1/num2;
}*/

}