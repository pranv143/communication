package com.nt.service;

public class BankLoanServiceImpl implements BankLoanService {

	@Override
	public float calcSimpleIntrAmount(float pAmt, float rate, float time) {
	System.out.println("BankLoanServiceImpl.calcSimpleIntrAmount(-,-,-)");
		  if(pAmt<=0 || rate<=0 || time<=0)
			    throw new IllegalArgumentException("Invalid Inputs"); 
		/*
		 * try { Thread.sleep(30000); } catch(Exception e) { e.printStackTrace(); }
		 */
		  return ( pAmt*time*rate)/100.0f;
		
		
	}

}
