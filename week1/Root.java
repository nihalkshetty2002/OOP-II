import java.util.Scanner;

class Root{
	public static void main(String[] args)
		{
			double a, b, c, root1, root2, discriminant;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a value: ");
			a=sc.nextInt();
			System.out.println("Enter b value: ");
			b=sc.nextInt();
			System.out.println("Enter c value: ");
			c=sc.nextInt();
			discriminant=(b*b)-(4*a*c);

			if(discriminant>0)
			{
				root1=(-b+Math.sqrt(discriminant))/2*a;
				root2=(-b-Math.sqrt(discriminant))/2*a;
				System.out.println("Two roots are: "+root1+" and "+root2);
			}
			else if(discriminant==0)
			{
				root1=-b/(2*a);
				System.out.println("Only one root: "+root1);
			}
			else
				System.out.println("Roots are imaginary");

	}
}