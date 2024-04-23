//Create an abstract class Figure with abstract method area and two integer dimensions. Create
//three more classes Rectangle, Triangle and Square which extend Figure and implement the
//area method. Show how the area can be computed dynamically during run time for
//Rectangle, Square and Triangle to achieve dynamic polymorphism. (Use the reference of
//Figure class to call the three different area methods)

//nihal 
//230970065
import java.util.*;
abstract class Figure
{
	 double a,b;
	 abstract public void area();
}

class rectangle extends Figure
{
	private double area_rect;
	public void area()
	{
		  Scanner s=new Scanner(System.in);
		  System.out.print("Enter the length and breadth of rectangle: ");
		  a=s.nextDouble();
		  b=s.nextDouble();
		  area_rect=a*b;
		  System.out.println("The area of rectangle is: "+area_rect);
	 }
}

class triangle extends Figure
{
	 private double area_tri;
	 public void area()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("\nEnter the base and height of triangle: ");
		a=s.nextDouble();
		b=s.nextDouble();
		area_tri=(0.5*a*b);
		System.out.println("The area of triangle is: "+area_tri);
	}
}

class square extends Figure
{
	private double area_square;
	public void area()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("\nEnter the side of square: ");
		a=s.nextDouble();
		area_square=(a*a);
		System.out.println("The area of square is: "+area_square);
	 }
}

public class FigureClass
{
	public static void main(String[] args)
	{
		Figure f;
		f=new rectangle();
		f.area();
		f=new triangle();
		f.area();
		f=new square();
		f.area();
	}
}