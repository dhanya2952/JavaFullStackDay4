package com.graymatter;

public class DemoOnThreads extends Thread{
	
	@Override
	public void run() {
		System.out.println("in run method");
//		System.out.println(currentThread().getName());
//		System.out.println(currentThread().getId());
		for(int i=0;i<5;i++)
		{
			System.out.println(currentThread().getId());

		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(currentThread().getName());
		System.out.println(currentThread().getId());
		System.out.println(currentThread().getPriority());
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);
		System.out.println(currentThread().isAlive());
		System.out.println(currentThread().isDaemon());
		
		DemoOnThreads dot = new DemoOnThreads();
		dot.start();
		
		DemoOnThreads dot1 = new DemoOnThreads();
		dot1.start();




		

	}

}
