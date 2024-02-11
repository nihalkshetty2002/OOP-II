//Write a java program to find the largest and smallest element in a two-dimensional array. Display the row & column indices of the largest and the smallest element in the given twodimensional array.
import java.util.Scanner;
class largestsmallestarray
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int row,col;
		int num;
		System.out.println("ENTER THE NUMBER OF ROWS AND COLUMNS");
		row=sc.nextInt();
		col=sc.nextInt();
		float array[][]= new float[row][col];
		System.out.println("ENTER THE ELEMENTS:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				array[i][j]=sc.nextFloat();
			}
		}

		System.out.println("DISPLAY CONTENT:");
				for(int i=0;i<row;i++)
				{
					for(int j=0;j<col;j++)
					{
						System.out.print(array[i][j]+"\t");

					}
					System.out.println();
		}

		float maxElement,minElement;
		int x1,x2,y1,y2;
		maxElement =(float) 0;
		x1 = x2 = y1 = y2 = 0;
		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < col; j++)
			{
				if (array[i][j] > maxElement)
				{
					maxElement = array[i][j];
		            x1=i;
		            y1=j;
		         }
		     }
		 }

		 minElement=maxElement;
		 for (int i = 0; i < row; i++)
		 {
			 for (int j = 0; j < col; j++)
			 {
				 if (array[i][j] < minElement)
				 {
					 minElement = array[i][j];
		             x2=i;
		             y2=j;
		         }
		      }
        }
        System.out.println("The largest element = "+maxElement+", location = ("+x1+","+y1+")");
        System.out.println("The smallest element = "+minElement+", location = ("+x2+","+y2+")");

	}
}