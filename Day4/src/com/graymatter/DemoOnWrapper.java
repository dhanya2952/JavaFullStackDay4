package com.graymatter;

public class DemoOnWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//primitive to wrapper
		int i=10;
		Integer iobj = (Integer)i;
		
		//Integer iobj = i;
		
		//wrapper to primitive
		int j=iobj.intValue();
		
		//String to wrapper
		String sint="23";
		int i1= Integer.parseInt(sint);
		
		//wrapper to string
		Integer i2= Integer.parseInt(sint);
		String s= i2.toString();
		System.out.println(i2);
		
		
		String str="HEllo";
		Object obj=str;//upcasting
		
		String s1=(String)obj; //downcasting,explicit conversion
		
		
		

		

	}

}
