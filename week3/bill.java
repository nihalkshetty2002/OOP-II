// A shop provides discount to customers based on their total bill amount
//Nihal
//230970065
//23-01-24
import java.util.Scanner;
class bill
{
	private int item_id,qty;
	private double price;
	private double total;
	private String item_name;

	public void buyitems()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER THE ITEM NAME");
		item_name=sc.next();
		System.out.println("ENTER THE ITEM ID");
		item_id=sc.nextInt();
		System.out.println("ENTER THE QUANTITY OF THE ITEM:");
		qty=sc.nextInt();
		System.out.println("ENTER THE UNIT PRICE:");
		price=sc.nextDouble();
		total=total+qty*price;
	}

	public void calculate()
	{
		System.out.println("TOTAL AMOUNT "+total);
		if(total < 500)
		{
			System.out.println("NO DISCOUNT!");
		}
		else if(total <1000)
		{
			System.out.println("10% DISCOUNT! BILL: "+(total-0.1*total));
		}
		else if(total < 2000)
		{
					System.out.println("12% DISCOUNT! BILL: "+(total-0.12*total));
		}
		else if(total >= 2000)
		{
					System.out.println("15% DISCOUNT! BILL: "+(total-0.15*total));
		}
		System.out.println();
	}

	public void display()
	{
		System.out.println("\nItem id:"+item_id);
		System.out.println("Item name:"+item_name);
		System.out.println("Price:"+price);
		System.out.println("Quantity:"+qty);
	}

	public static void main(String args[])
	{
		int n,ch,i=0;
		bill b[]=new bill[10];
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("1.Buy Item \n2.Display \n3.Exit \nEnter your choice:");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1: b[i]=new bill();
						b[i++].buyitems();
						break;

				case 2: if(i==0)
						{
							System.out.println("NO ITEM TO DISPLAY");
							break;
						}
						for(int j=0;j<i;j++)
						{
							b[j].display();
							b[j].calculate();
						}

						break;

				case 3: System.exit(0);
						break;

				default: System.out.println("INVALD CHOICE");
			}

		}while(ch!=3);
	}
}