package com.atm;

public interface AtmOperation 
{
	public void viewBalance();
	public void withdrawAmount(double withdrawAmount);
	public void depositAmount(double depositeAmount);
	public void viewTransactionHistory();
	public void transfer(double transferAmount);

}
