package com.nt.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class MyTestRunner {

	public static void main(String[] args) {
		Result result=JUnitCore.runClasses(AllTests.class);
		System.out.println("Failures:::");
		for(Failure failure:result.getFailures()) {
			System.out.println(failure.toString());
		}
		
		System.out.println("failures count:"+result.getFailureCount());
		System.out.println("Ignores count:"+result.getIgnoreCount());
		System.out.println("Runs Count::"+result.getRunCount());
		System.out.println("Was Success ::"+result.wasSuccessful());
		

	}

}
