//230970065
//30-01-24
import java.util.*;

public class points{
	double x;
	double y;

	points(double x, double y){
		this.x = x;
		this.y = y;
	}

	void topoint2(double x2, double y2){
		System.out.println("Distance between p1 and p2: ");
		double temp = Math.sqrt(Math.pow((x2 - x), 2) + Math.pow((y2 - y), 2));
		System.out.println(temp);
	}

	void topoint3(points p3){
			System.out.println("Distance between p1 and p3: ");
			double temp = Math.sqrt(Math.pow((p3.x - x), 2) + Math.pow((p3.y - y), 2));
			System.out.println(temp);
	}

	public static void main(String args[]){
			Scanner sc = new Scanner (System.in);
			System.out.print("Input the coordinates of p1: ");
			double x1 = sc.nextDouble();
			double y1 = sc.nextDouble();
			points p1 = new points(x1,y1);

			System.out.print("Input the coordinates of p2: ");
			double x2 = sc.nextDouble();
			double y2 = sc.nextDouble();
			points p2 = new points(x2,y2);

			System.out.print("Input the coordinates of p3: ");
			double x3 = sc.nextDouble();
			double y3 = sc.nextDouble();
			points p3 = new points(x3,y3);

			//displaying the input data
			System.out.println("p1 = " + x1 + "," + y1);
			System.out.println("p2 = " + x2 + "," + y2);
			System.out.println("p3 = " + x3 + "," + y3);

			p1.topoint2(x2,y2);
			p1.topoint3(p3);
		}
}