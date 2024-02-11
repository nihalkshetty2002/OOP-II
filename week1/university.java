//program to compute and display the tuition fee for 10 consecutive years.
//nihal kiran ashetty
//230970065
//09-01-2024

import java.util.Scanner;

class university{
	public static void main(String args[]){
		float fee,inc,peryr;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the tuition fee:");
		fee=sc.nextFloat();
		System.out.println("Enter increment per year in %:");
		inc=sc.nextFloat();

		peryr=fee;
		for(int i=0;i<10;i++){
			peryr+=fee*(inc/100);
			System.out.println("The fee after "+i+" year = "+peryr);
		}
	}
}