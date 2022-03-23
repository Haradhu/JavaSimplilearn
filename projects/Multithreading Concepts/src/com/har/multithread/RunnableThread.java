package com.har.multithread;

class RunnableThread implements Runnable{  
public void run(){  
System.out.println(" The thread is running...");  
}  
  
public static void main(String args[]){  
	RunnableThread s=new RunnableThread();  
Thread t =new Thread(s); 
t.start();  
 }  
}  

