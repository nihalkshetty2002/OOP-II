//Write a program that prompts the user to enter a weight in kilograms and height in centimetres. Compute the BMI and display the message accordingly.
//Nihal kiran Shetty
//230970065
//09-01-23
import java.util.Scanner;
class bmi
{
	public static void main(String args[])
	{
		double kg,cm,bmi;

		Scanner in=new Scanner(System.in);
		System.out.println("ENTER WEIGHT IN KG:");
		kg=in.nextDouble();
		System.out.println("ENTER HEIGHT IN CM:");
		cm=in.nextDouble();
		double meter=cm/100;
		bmi=kg/(meter*meter);
		System.out.println("BMI="+bmi);
		if(bmi<18.5)
		{
			System.out.println("UNDERWEIGHT!");
		}
		else if(bmi<18.5&&bmi<24.9)
		{
			System.out.println("NORMAL");
		}
		else if(bmi<25&&bmi<29.9)
		{
			System.out.println("OVERWEIGHT!");
		}
		else
		{
			System.out.println("OBESE!!!");
		}
	}
}