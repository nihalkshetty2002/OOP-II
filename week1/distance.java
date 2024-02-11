//Write a java program to accept distance travelled (in kilometre) and the quantity of fuel used (in litre) for a journey and determine the average fuel economy for that journey
//Nihal kiran shetty
//230970065
//09-01-23

import java.util.Scanner;
class distance
{
	public static void main(String args[])
	{
		float distance,fuel,avgfuel;
		int ch;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the distance(in Km):");
		distance=sc.nextFloat();
		System.out.println("Enter the fuel consumed(in Liter ) : ");
		fuel=sc.nextFloat();

		avgfuel=distance/fuel;
		System.out.println("Average fuel economy= "+avgfuel+" kmpl");

		do
		{
			System.out.println("\n1.Distance estimation ");
			System.out.println("2.Fuel estimation ");
			System.out.println("Enter your choice(0 to stop):");
			ch=sc.nextInt();

			if(ch==1)
			{
				System.out.println("Enter the fuel consumed(in Liter ) : ");
				fuel=sc.nextFloat();
				System.out.println("Estimated distnace= "+(fuel*avgfuel));
			}
			else if(ch==2)
			{
				System.out.println("Enter the distance(in Km):");
				distance=sc.nextFloat();
				System.out.println("Estimated fuel= "+(distance/avgfuel));
			}else{
				System.out.println("Invalid choice");
			}

		}while(ch != 0);

	}
}

