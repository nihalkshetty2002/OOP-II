// Create a class named Employee to store employee information with data: employee code, employee name, Basic, HRA, IT, PF, net salary and gross salary. The net salary and gross salary are calculated
//Nihal
//230970065
//23-01-24
import java.util.Scanner;
class employee
{
	private int empcode;
	private String empname;
	private double basicsal,hra,it,pf,netsal,gross;

	public void getdata()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER THE EMP CODE:");
		empcode=sc.nextInt();
		System.out.println("ENTER THE EMP NAME:");
		empname=sc.next();
		System.out.println("ENTER THE BASIC SALARY:");
		basicsal=sc.nextDouble();
		System.out.println();
	}

	public void calculate()
	{
		hra=0.75*basicsal;
		it=200;
		pf=0.12*basicsal;
		gross=basicsal+hra;
		netsal=gross-(it+pf);
	}

	public void display()
	{
		calculate();
		System.out.println("Employee code:"+empcode);
		System.out.println("Employee Name:"+empname);
		System.out.println("BASIC SALARY:"+basicsal);
		System.out.println("Gross:"+gross);
		System.out.println("Net Salary:"+netsal);
	}

	public static void main(String args[])
	{
		employee e= new employee();
		e.getdata();
		e.display();
	}
}