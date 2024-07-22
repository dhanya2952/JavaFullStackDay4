package com.graymatter;

public class DemoOnRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1= new Thread(new MyRunnable());  //creating an obj of ud class
		t1.start();

	}

}
