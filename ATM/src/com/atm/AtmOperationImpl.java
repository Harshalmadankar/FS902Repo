package com.atm;

import java.util.HashMap;
import java.util.Map;

public class AtmOperationImpl implements AtmOperation 
{
	ATM atm=new ATM();
	Map<Double, String> transaction=new HashMap<>();
	@Override
	public void viewBalance() {
		System.out.println("Available balance is "+atm.getBalance()+" Rs");
		
	}
	@Override
	public void withdrawAmount(double withdrawAmount)
	{
		if(withdrawAmount%100==0)
		{
			if(withdrawAmount<=atm.getBalance()) {
				transaction.put(withdrawAmount, " withdraw");
				System.out.println(withdrawAmount +" Rs withdraw successfully. Please collect your money.");
				atm.setBalance(atm.getBalance()-withdrawAmount);
				viewBalance();
			}
			else {
				System.out.println("Insufficient Balance");
				
			}
		}
		else {
			System.out.println("Please enter the amount in the multiple of 100");
		}
	}
	@Override
	public void depositAmount(double depositeAmount)
	{
	    transaction.put(depositeAmount, " deposited");
	    System.out.println(depositeAmount +" Rs deposited successfully");
	    atm.setBalance(atm.getBalance()+depositeAmount);
	    viewBalance();
	}
	@Override
	public void viewTransactionHistory()
	{
		for(Map.Entry<Double, String> t:transaction.entrySet())
		{
			System.out.println(t.getKey()+ "" +t.getValue());
		}
	}
	@Override
	public void transfer(double transferAmount) {
		if(transferAmount<=atm.getBalance()) {
			transaction.put(transferAmount, " transfered ");
			System.out.println(transferAmount + " Rs transfered successfully");
			atm.setBalance(atm.getBalance()-transferAmount);
			viewBalance();
		}
		else {
			System.out.println("Insufficien Balance");
		}
	}
	
}
