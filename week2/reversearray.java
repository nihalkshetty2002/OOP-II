//Input an array of n integers. Reverse all elements of the array and store them in another array.
//Nihal Kiran Shetty
//230970065
//16-0-24
import java.util.Scanner;
class reversearray
{
	public static void main(String args[])
	{
		int size;
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER NUMBER OF ELEMENTS:");
		size=sc.nextInt();
		int array1[]= new int[size];
		int array2[]= new int[size];
		System.out.println("INPUT "+size+" OF INTEGER:");
		for(int i=0;i<size;i++)
		{
			array1[i]=sc.nextInt();
			int reverse=0;
			int temp=array1[i];
						while(temp!=0)
						{
							int rem=temp%10;
							reverse = reverse*10 + rem;
							temp/=10;
						}
			array2[i]=reverse;

		}
		System.out.println("CONTENT OF THE TWO ARRAYS");
		System.out.println("ARRAY ELEMNTS\t\tREVERSE ELEMENTS");
		for(int i=0;i<size;i++)
				{

					System.out.println(array1[i]+"\t\t\t"+array2[i]);

				}
	}
}