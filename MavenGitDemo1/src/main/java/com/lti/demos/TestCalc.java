package com.lti.demos;

public class TestCalc {
	public static void main(String[] args) {
		
		Calculator c= new Calculator();
		
		String msg=c.sayHello();
		System.out.println(msg);		
		
		int sum=c.addNos(1323, 3232);
		System.out.println(sum);
		
		System.out.println(" new line added ");
		
	}

}
