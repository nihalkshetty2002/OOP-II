//Create a class called Box with width, height and depth as data members. Include a member
//function to find the volume of the box. Use parameterized constructors to initialize the
//objects
//Nihal Kiran Shetty
//230970065
//23-01-24
import java.util.Scanner;
class box
{
	private float width,height,depth,volume;

	box()
	{
		width=height=depth=0;
	}

	box(float w,float h,float d)
	{
		width=w;
		height=h;
		depth=d;
	}

	public double volume()
		{
			return width*height*depth;
		}

		public void display()
		{
			System.out.println("Volume of the BOX ="+volume());
		}

		public static void main(String args[])
		{
			float w,h,d;
			Scanner sc=new Scanner(System.in);

			System.out.println("Enter the width:");
			w=sc.nextFloat();
			System.out.println("Enter the height:");
			h=sc.nextFloat();
			System.out.println("Enter the depth:");
			d=sc.nextFloat();

			box b=new box(w,h,d);
			b.display();
	}

}