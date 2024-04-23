//Nihal
//230970065
//20-02-24
import java.util.*;
abstract class Figure
{
	double dim1;
	double dim2;
	Figure(double a, double b)
	{
		dim1 = a;
		dim2 = b;
	}
// area is now an abstract method
abstract double area();
}

class Rectangle extends Figure
{
	Rectangle(double a, double b)
	{
		super(a, b);
	}
	double area()
	{
		System.out.println("Inside Area for Rectangle.");
		return dim1 * dim2;
	}
}

class Triangle extends Figure
{
	Triangle(double a, double b)
	{
		super(a, b);
	}
	double area()
	{
		System.out.println("Inside Area for Triangle.");
		return dim1 * dim2 / 2;
	}
}

class Square extends Figure
{
	Square(double a)
	{
		super(a, a);
	}
	double area()
	{
		System.out.println("Inside Area for Triangle.");
		return dim1 * dim2;
	}
}

class AbstractAreas
{
	public static void main(String[] args)
	{
		// Figure f = new Figure(10, 10); // illegal now
		Scanner sc= new Scanner(System.in);
		double l, b;
		do
		{
			System.out.println("ENTER DIMENSION1:");
			l=sc.nextDouble();
			System.out.println("ENTER DIMENSION2:");
			b=sc.nextDouble();
			if(l<0|b<0)
			{
				System.out.println("ENTER VALID DIAMENSION");
			}
	}while(l<0|b<0);
		Rectangle r = new Rectangle(l,b);
		Triangle t = new Triangle(l, b);
		Square s = new Square(l);
	
		Figure figref; // this is OK, no object is created
		figref = r;
		System.out.println("Area is " + figref.area());
		figref = t;
		System.out.println("Area is " + figref.area());
		figref = s;
		System.out.println("Area is " + figref.area());
	}
}
