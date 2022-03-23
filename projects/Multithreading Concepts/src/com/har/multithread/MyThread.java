package com.har.multithread;


public class MyThread extends Thread
{
 	public void run()
 	{
  		System.out.println("The thread is started..");
}
 	public static void main( String args[] )
 	{
  		MyThread t = new  MyThread();
  		t.start();
 	}
}

