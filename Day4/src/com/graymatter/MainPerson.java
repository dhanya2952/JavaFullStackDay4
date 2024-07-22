package com.graymatter;

public class MainPerson {

	public static void main(String[] args) throws AgeNotSufficientException {
		// TODO Auto-generated method stub
		
		Person p = new Person("dhanya","1234567890",22);
		
		if (p.getAge()<18)
		{
			throw new AgeNotSufficientException("Age shld be more than 18");
		}
		else
		{
			System.out.println("person is eligible");
			System.out.println(p);
		}

	}

}
