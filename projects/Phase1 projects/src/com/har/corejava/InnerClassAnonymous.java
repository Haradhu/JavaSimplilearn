package com.har.corejava;



abstract class InnerClassAnonymous{  
	  abstract void come();  
	}  
	class Test{  
	 public static void main(String args[])
	 {  
		 InnerClassAnonymous n=new InnerClassAnonymous()
		 {  
	  void come()
	  {
		  System.out.println("Welcome Home");
		  }  
	  };
	  n.come();  
	 }  
	}  

