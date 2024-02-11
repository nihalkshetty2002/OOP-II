//Write a java program to convert the input speed from kilometre per hour to meters per
//second and vice versa. Hint: 1 Kmph = 1000/3600 mps
//Nihal Kiran Shetty
//230970065
//09-01-2024

import java.util.Scanner;

class Speed{
	public static void main(String args[]){
		float kmph,mps;
		int ch;
		Scanner sc=new Scanner(System.in);

		do
		{
			System.out.println("\n1.KM per hr to Meter per second ");
			System.out.println("2.Meter per second to KM per hr ");
			System.out.println("Enter your choice(0 to stop):");
			ch=sc.nextInt();

			if(ch==1)
			{
				System.out.println("Enter the speed in KM per hr: ");
				kmph=sc.nextFloat();
				float mpss = kmph * (1000 / 3600);
				System.out.println("Speed in mps= "+mpss);
			}
			else if(ch==2)
			{
				System.out.println("Enter the speed in meter per second: ");
				mps=sc.nextFloat();
				kmph = mps / (1000 / 3600);
				System.out.println("Speed in Kmph= "+kmph);
			}else{
				System.out.println("Invalid choice");
			}

		}while(ch != 0);

	}
}