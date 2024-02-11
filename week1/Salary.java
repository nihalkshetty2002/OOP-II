//Java application to accept number of hours worked, hourly rate and determines the gross pay for an employee according to the criteria
//Nihal Kiran shetty
//Regno: 230970065
//09-01-2024

import java.util.Scanner;

class Salary{
	public static void main(String args[]){
		int hrsw,hrrate;
		float grosspay=0;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the No. of hrs worked :");
		hrsw=sc.nextInt();
		System.out.println("Enter the hourly rate :");
		hrrate=sc.nextInt();

		if(hrsw<=40)
		{
			grosspay=hrsw*hrrate;
		}
		else{
			grosspay=40*hrrate;
			grosspay+=(hrsw-40)*(hrrate*1.5);
		}
		System.out.println("The total pay ="+grosspay);
	}
}