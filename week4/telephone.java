//230970065
//Nihal
//30-01-24
import java.util.Scanner;
class customer
{
	private int cust_id;
	private String name;
	private int phone_no;
	private int bill_no;
	private int no_of_calls;
	private double bill_amt;

	//constructor
	public customer(int id, String cname, int ph_no, int billno, int ncalls)
	{
		cust_id=id;
		name=cname;
		phone_no=ph_no;
		bill_no=billno;
		no_of_calls=ncalls;
	}

	public void accept_details()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER THE CUSTOMER ID:");
		cust_id=sc.nextInt();
		System.out.println("ENTER THE CUSTOMER NAME:");
		name=sc.next();
		System.out.println("ENTER THE CUSTOMER PHONENO:");
		phone_no=sc.nextInt();
		System.out.println("ENTER THE BILL NO:");
		bill_no=sc.nextInt();
		System.out.println("ENTER THE NUMBER OF CALLS:");
		no_of_calls=sc.nextInt();
	}

	public void calculate_bill()
	{
		if(no_of_calls<=100)
		{
			bill_amt=100;//minimum cost
		}
		else if(no_of_calls<=150)
		{
			bill_amt= 100 + (no_of_calls-100) * 0.60;
		}
		else if(no_of_calls<=200)
		{
			bill_amt= 100 + 50 * 0.60 + (no_of_calls-150) * 0.50;
		}
		else
		{
			bill_amt= 100 + 50 * 0.60 + 50 * 0.50 + (no_of_calls - 200) * 0.40;
		}
	}

	public void display_details()
	{
	        System.out.println("Customer ID: " + cust_id);
	        System.out.println("Name: " + name);
	        System.out.println("Phone Number: " + phone_no);
	        System.out.println("Bill Number: " + bill_no);
	        System.out.println("Number of Calls: " + no_of_calls);
	        System.out.println("Bill Amount: Rs. " + bill_amt);
    }
}
	class telephone
	{
		public static void main(String args[])
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("ENTER THE NO OF CUSTOMERS:");
			int n = sc.nextInt();

			//creating array of objects
			customer customers[]= new customer[n];

			for(int i=0;i<n;i++)
			{
				System.out.println("ENTER THE DETAILS OF THE CUSTOMER "+(i+1)+" : ");
				customers[i]= new customer(0,"",0,0,0);
				customers[i].accept_details();
				System.out.println();
				customers[i].calculate_bill();
			}

			System.out.println("\n---Customer Details and Bill Amounts---");
			for(int i=0;i<n;i++)
			{
				customers[i].display_details();
			}

		}
	}

