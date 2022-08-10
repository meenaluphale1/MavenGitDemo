package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class TestBeforeAfter {

	Calculator c= new Calculator();
	int sum=0;
	
	@BeforeAll  // only once beefore all the test cases 
	public static void testStartDbConn()
	{
		System.out.println(" DB connection is up  - only once ");
	}
	
	@BeforeEach  // before each test case 
	public void testStartup()
	{
		sum=0;
		System.out.println(" sum is zero" +sum);
	}

	@Test
	public void testAddTwoNos()
	{
		System.out.println(" test case 1");
		int result=c.addNos(100,200);		
		Assertions.assertEquals(300, result);		
	}
	
	@Test  
    public void testSubTwoNos() {
		System.out.println("test case 2");
        int result = c.subNos(300, 100);
        Assertions.assertEquals(200, result,"plz check subtraction method code");
    }
		
	@AfterEach
	public void testShutDown()
	{
		System.out.println(" some object  null");
	}
	
	@AfterAll  // only once s
	public static void testShutdownConn()
	{
		System.out.println(" shutting down db connection");
		
		
	}
}
