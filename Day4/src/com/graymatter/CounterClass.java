package com.graymatter;

public class CounterClass {
	
	private int count=0;
	
	public synchronized void updateCount()
	{
		//synchronized (STR) {
			count++;
			printCount();
		//}
		
		
	}
	
	public void printCount()
	{
		System.out.println(count);
	}

}
