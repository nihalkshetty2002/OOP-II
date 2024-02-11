// Write a program to read an array of n distinct numbers, and display all the pairs (x,y) such that x>y.
//Nihal Kiran Shetty
//230970065
//16-01-24

import java.util.Scanner;
class arraypairs
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int num;
		System.out.println("ENTER THE NUMBER OF ARRAY:");
		num=sc.nextInt();
		int array[]=new int[num];
		System.out.println("ENTER THE NUMBER OF elements:");
		for(int i=0;i<num;i++)
			array[i]=sc.nextInt();
			System.out.println("---OUTPUT---");
			for(int i=0;i<num;i++)
			{

				for(int j=0;j<num;j++)
				{
					if(array[i]>array[j])
					{
						System.out.println("("+array[i]+","+array[j]+")");
					}
				}

			}

	}
}