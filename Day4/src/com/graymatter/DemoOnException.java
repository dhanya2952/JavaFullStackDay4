package com.graymatter;

public class DemoOnException {
	
	public static void doDiv(int a,int b)
	{
		if(b==0)
			throw new ArithmeticException(); //if we want to throw Exception then it must thrown at the method level
		else
			System.out.println(a/b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int num=7,deno[]= {1,4,6,2};
//		try {
//			for( int i=0;i<=deno.length;i++)
//			{
//				if(deno[i]==0)
//					throw new ArithmeticException();
//				else
//					System.out.println(num/deno[i]);
//			}
//			
//		}
//		catch (ArithmeticException |ArrayIndexOutOfBoundsException ae) {
//			// TODO: handle exception
//			ae.printStackTrace();
//		}
//		finally { //used to close resources/configurations
//			System.out.println("end of finally method");
//		}
//		System.out.println("end of main method");
		
		try {
			doDiv(9,0);	
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
		}		
		

	}

}
