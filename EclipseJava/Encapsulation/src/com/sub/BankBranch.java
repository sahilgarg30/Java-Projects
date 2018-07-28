package com.sub;

import com.encapsulation.Bank;

public class BankBranch extends Bank{
	public float getIRforLoanBB(){
		return interestRate + 4;
	}
}
