package com.har.corejava;



class Innerclass{  
	 private float temp=28;  
	 class Inner{  
	  void msg(){
		  System.out.println("The temperature  is "+temp + " degree ");
		  }  
	 }  
	 public static void main(String args[]){  
		 Innerclass n=new Innerclass();  
		 Innerclass.Inner in=n.new Inner();  
	  in.msg();  
	 }  
	}  

