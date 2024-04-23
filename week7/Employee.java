//nihal 
//230970065
import java.util.*;
import java.lang.*;
public class Employee implements Cloneable {
    String name;
    int id;
    String designation;
    double salary;

    public Employee(String name, int id, String designation, double salary) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Name :" + name);
        System.out.println("Id " + id);
        System.out.println("Designation:" + designation);
        System.out.println("Salary : " + salary);
    }

    @Override
    public Object clone() throws CloneNotSupportedException 
    {
        return super.clone();
    }

        public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter Name :");
	        String name = sc.nextLine();
	        System.out.println("Enter Id ");
	        int id = sc.nextInt();
	        System.out.println("Enter Designation:");
	        String des = sc.next();
	        System.out.println("Enter Salary : ");
	        double sal = sc.nextDouble();
	        Employee emp1 = new Employee(name, id, des, sal);

	        try
	        {
	        	Employee emp2 = (Employee) emp1.clone();
	        	System.out.println("\n\n***Cloned Employee's Details: *****");
	        	emp2.display();
			}
			catch(CloneNotSupportedException e)
			{
				System.out.println("Clone not supported.");
			}


    }
}






























































































































 

    // public static void main(String[] args) throws CloneNotSupportedException
    // {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter Name :");
    //     String name = sc.nextLine();
    //     System.out.println("Enter Id ");
    //     int id = sc.nextInt();
    //     System.out.println("Enter Designation:");
    //     String des = sc.next();
    //     System.out.println("Enter Salary : ");
    //     double sal = sc.nextDouble();
    //     Employee emp1 = new Employee(name, id, des, sal);
    //     Employee emp2 = (Employee) emp1.clone();
    //     System.out.println("\n\n***Cloned Employee's Details: *****");
    //     emp2.display();
    // }