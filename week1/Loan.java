//program that lets the user enter the loan amount and loan period in number of years
//and displays the monthly and total payments for each interest rate starting from 5% to 8%,
//with an increment of 1/8
//Nihal Kiran Shetty
//230970065
//09-01-2024

import java.util.Scanner;

class Loan{
	public static void main(String args[]){
		int amt,period;
		double monpay=0,monint=0,annualint=5;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the loan amount :");
		amt=sc.nextInt();
		System.out.println("Enter the loan period in number of years :");
		period=sc.nextInt();

		System.out.println("\nInterest Rate \tMonthly Payment \tTotal Payment:");
		for(float i=5f;i<=8f;i=i+(1/8f))
		{
			monint=i/(12*100);
			monpay=(amt*monint)/(1-(1/(Math.pow((1+monint),period*12))));
			System.out.println(i+"\t\t"+monpay+"\t\t"+(monpay*12*period));
		}
	}
}