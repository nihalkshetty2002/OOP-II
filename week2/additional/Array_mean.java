import java.util.Scanner;

class Array_mean{
	public static void main(String arg[]){
		int a[],sum=0;
		float mean;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size: ");
		a=new int[sc.nextInt()];
		System.out.println("Enter elements: ");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		mean=sum/a.length;
		System.out.print("Array mean: "+mean+"\nArray elements after substraction:\n");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]-mean+" ");
		System.out.println();
	}
}