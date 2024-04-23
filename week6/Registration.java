 //nihal 
//230970065
 import java.util.*;

class Student
{
	int regno,semester;
	String name,course;
	Scanner sc=new Scanner(System.in);

	void getdata()
	{
		System.out.println("Enter Register no");
		regno=sc.nextInt();
		System.out.println("Enter Student name");
		name=sc.next();
		System.out.println("Enter Course name");
		course=sc.next();
		System.out.println("Enter Semester");
		semester=sc.nextInt();
	}


	void display()
	{
		System.out.println("Register no= "+regno);
		System.out.println("Student name= "+name);
		System.out.println("Course name= "+course);
		System.out.println("Semester= "+semester);
	}
}

class Exam extends Student
{
	float m1,m2,m3;
	Scanner sc=new Scanner(System.in);

			void getdata()
			{
				do
				{
				super.getdata();
				System.out.println("Enter Subject1 Mark");
				m1=sc.nextFloat();
				
				System.out.println("Enter Subject2 Mark");
				m2=sc.nextFloat();
			
				System.out.println("Enter Subject3 Mark");
				m3=sc.nextFloat();

				if(m1<0||m2<0||m3<0)
				{
					System.out.println("INVLAID marks");
				}
			}while(m1<0||m2<0||m3<0);
			}


			void display()
			{
				super.display();
				System.out.println("Subject1 Mark= "+m1);
				System.out.println("Subject2 Mark= "+m2);
				System.out.println("Subject2 Mark= "+m3);
			}

}

class Result extends Exam
{
	float total,avg;
	char grade;
	Scanner sc=new Scanner(System.in);

		void getdata()
		{
			super.getdata();
			total=m1+m2+m3;
			avg=total/3;
			if(avg>=90)
				grade='A';
			else if(avg>=80)
				grade='B';
			else if(avg>=70)
				grade='C';
			else if(avg>=60)
				grade='D';
			else if(avg>=50)
				grade='E';
			else
				grade='F';

		}
		void display()
		{
			super.display();
			System.out.println("Total Marks= "+total);
			System.out.println("Grade= "+grade);
		}
}


class Registration
{
	public static void main(String[] args)
	{
		Result r=new Result();
		r.getdata();
		r.display();

	}
}