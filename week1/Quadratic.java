//nihal
//230970065
import java.util.Scanner;

class Quadratic{
	public static void main(String[] args){
		double a,b,c, descreminant, root1, root2;
		a=Double.parseDouble(args[0]);
		b=Double.parseDouble(args[1]);
		c=Double.parseDouble(args[2]);
		if(a==0||b==0||c==0)
		{
			System.out.println("it Cannot be zero");
			return;
		}
		descreminant=(b*b)-4*a*c;
		if(descreminant<0){
					System.out.println("The Roots are imaginary");
					return;
		}
		if(descreminant==0)
		{
			root1=-b/2*a;
			System.out.println("Only one root:"+root1);
			return;
		}
		root1=(-b+Math.sqrt(descreminant))/2*a;
		root2=(-b-Math.sqrt(descreminant))/2*a;
		System.out.println("Two roots:"+root1+" and "+root2);
	}
}