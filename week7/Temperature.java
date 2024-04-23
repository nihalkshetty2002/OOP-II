//nihal 
//230970065
import FToC.FahrToCels;
import CToF.CelsToFahr;
import java.util.Scanner;

class Temperature
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int ch;
		double temp;

		do
		{
			System.out.println("1.Celcius to Farenheit\n2.Farenheit to Celcius\n3.Exit\nEnter your choice:");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1: System.out.println("Enter the temperature in celcius:");
						temp=sc.nextDouble();
						temp=new CelsToFahr().ConvertCToF(temp);
						System.out.println("Farenheit ="+temp);
						break;
				case 2: System.out.println("Enter the temperature in Farenheit:");
						temp=sc.nextDouble();
						temp=new FahrToCels().ConvertFToC(temp);
						System.out.println("Celcius ="+ temp);
						break;
				case 3:
						break;
				default:System.out.println("Invalid Choice");

			}
		}while(ch!=3);
	}
}