package com.graymatter;

public class MainCounter extends Thread {
	
	CounterClass cc;
	
	MainCounter() {
		super();
	}

	MainCounter(CounterClass cc) {
		super();
		this.cc = cc;
	}

	@Override
	public void run() {
		
		for(int i=0;i<10;i++)
		{
			cc.updateCount();
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
		
		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CounterClass cc =new CounterClass();
		MainCounter cm1= new MainCounter(cc);
		MainCounter cm2= new MainCounter(cc);
		
		cm1.start();
		cm2.start();

		
	}

}
