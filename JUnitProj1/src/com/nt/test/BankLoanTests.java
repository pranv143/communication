package com.nt.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.nt.service.BankLoanService;
import com.nt.service.BankLoanServiceImpl;

public class BankLoanTests {
	private static BankLoanService service;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("BankLoanTests.setUpBeforeClass()");
		service=new BankLoanServiceImpl();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("BankLoanTests.tearDownAfterClass()");
		service=null;
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("BankLoanTests.setUp()");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("BankLoanTests.tearDown()");
	}

	@Test(timeout = 20000)
	public void testCalcSimpleIntrAmountWithSimplePositives() {
		float actualResult=0.0f;
		//expectd
		float expectedResult=2381.0f;
		
		//actual
		actualResult=service.calcSimpleIntrAmount(10000,2, 12);
		assertEquals(expectedResult,actualResult,10.0f);
	}
	
	@Test
	public void testCalcSimpleIntrAmountWithComplexPositives() {
		float actualResult=0.0f;
		//expectd
		float expectedResult=2400000.0f;
		
		//actual
		actualResult=service.calcSimpleIntrAmount(10000000,2, 12);
		assertEquals(expectedResult,actualResult,10.0f);
	}
	
	/*@Test
	public void testCalcSimpleIntrAmountWithNegetives() {
		float actualResult=0.0f;
		//actual
		actualResult=service.calcSimpleIntrAmount(-10000000,0, 12);
		fail("Exception is expected..But not raised ");
	}*/
	
	@Ignore
	@Test(expected = IllegalArgumentException.class)
	public void testCalcSimpleIntrAmountWithNegetives() {
		float actualResult=0.0f;
		//actual
		actualResult=service.calcSimpleIntrAmount(-10000000,0, 12);
		
	}

}
