/*Create a basic calculator that can perform basic arithmetic operations such as addition,
subtraction, multiplication, and division.*/

package com.task;
import java.util.Scanner;

public class Calculator 
{
	Scanner sc=new Scanner(System.in);
	void meth1()
	{
		System.out.println("ENTER YOUR CHOICE");
		int n=sc.nextInt();
		switch(n) {
		
		case 1:
			//Addition.
			System.out.println("Enter the 1st Number");
			int a1=sc.nextInt();
			System.out.println("Enter the 2nd Number");
			int a2=sc.nextInt();
			System.out.println("Addition of Two Number is : "+(a1+a2));
		    break;
			
		case 2:
			//Subtraction.
			System.out.println("Enter the 1st Number");
			int s1=sc.nextInt();
			System.out.println("Enter the 2nd Number");
			int s2=sc.nextInt();
			System.out.println("Substraction of Two Number is : "+(s2-s1));
			break;
			
		case 3:
			//Multiplication.
			System.out.println("Enter the 1st number");
			int m1=sc.nextInt();
			System.out.println("Enter the 2nd Number");
			int m2=sc.nextInt();
			System.out.println("Multipication of Two Number is : "+(m1*m2));
			break;
		
		case 4:
			//Division.
			System.out.println("Enter the 1st number");
			int d1=sc.nextInt();
			System.out.println("Enter the 2nd number");
			int d2=sc.nextInt();
			System.out.println("Division of Two umber is : " +(d1/d2));
			break;
		
		default:
			System.out.println("===Choice is Invalid:===");
		
		}
	}
	public static void main(String[] args)
	{
		System.out.println("------ CALCULATOR MENU -------");
		System.out.println("------------------------------");
		System.out.println("|                            |");
		System.out.println("|                            |");
		System.out.println("|       1.Addition.          |");
		System.out.println("|       2.Subtraction.       |");
		System.out.println("|       3.Multiplication.    |");
		System.out.println("|       4.Division.          |");
		System.out.println("|                            |");
		System.out.println("|                            |");
		System.out.println("------------------------------");
		
		Calculator obj1=new Calculator();
		obj1.meth1();
		
	}

}
