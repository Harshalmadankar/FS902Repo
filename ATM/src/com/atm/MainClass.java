package com.atm;
import java.util.Scanner;

public class MainClass {
	public static void main(String args[])
	{
		AtmOperation op=new AtmOperationImpl();
		
		int atmnumber=12345;
		int atmpin=1234;
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome To ATM");
		System.out.println("Enter ATM Number");
		int atmNumber=sc.nextInt();
		System.out.println("Enter ATM Pin");
		int pin=sc.nextInt();
		if((atmnumber==atmNumber)&&(atmpin==pin))
		{
			while(true)
			{
				System.out.println("---------------------------");
				System.out.println("|                         |");
				System.out.println("|                         |");
				System.out.println("|  1.Transcation Histroy  |");
				System.out.println("|  2.Withdraw             |");
				System.out.println("|  3.Deposit              |");
				System.out.println("|  4.Transfer             |");
				System.out.println("|  5.View Balance         |");
				System.out.println("|  6.Exit                 |");
				System.out.println("|                         |");
				System.out.println("|                         |");
				System.out.println("---------------------------");
				System.out.println("Enter Choice");
				int ch=sc.nextInt();
				
				if(ch==1) {
					op.viewTransactionHistory();
				}
				else if(ch==2) {
					System.out.println("Enter amount you want to Withdraw: ");
					double withdrawAmount=sc.nextDouble();
					op.withdrawAmount(withdrawAmount);
				}
				else if(ch==3)
				{
					System.out.println("Enter amount you want to Deposite: ");
					double depositeAmount=sc.nextDouble();
					op.depositAmount(depositeAmount);
				}
				else if(ch==4)
				{
					System.out.println("Enter receiver's account number: ");
					long accNo=sc.nextLong();
					System.out.println("Enter receiver's IFSC code: ");
					String ifscCode=sc.next();
					System.out.println("Enter amount you want to Transfer: ");
					double transferAmount=sc.nextDouble();
					op.transfer(transferAmount);
					
				}
				else if(ch==5)
				{
					op.viewBalance();
				}
				else if(ch==6)
				{
					System.out.println("Please Collect Your ATM card");
					System.out.println("Thank You!!!!");
					System.exit(0);
				}
				else {
					System.out.println("Please Enter Correct Choice...");
				}
			}
		}
		else
		{
			System.out.println("Incorrect ATM Number Or Pin");
			System.exit(0);
		}
	
	}

}
