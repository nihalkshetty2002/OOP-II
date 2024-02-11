import java.util.Scanner;

class Array_Unique{
	static int total;
	public static void main(String args[]){
		int a[][],b[],i,j;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array size: ");
		a=new int[sc.nextInt()][sc.nextInt()];
		b=new int[a.length*a[0].length];
		System.out.print("Enter array elments: ");
		for(i=0;i<a.length;i++)
			for(j=0;j<a[i].length;j++){
				a[i][j]=sc.nextInt();
				insert1D(b,a[i][j]);
			}

		System.out.println("Unique elements: ");
		for(i=0;i<total;i++)
			System.out.print(b[i]+" ");
	}
	static void insert1D(int[] b,int ele){
		boolean flag=true;
		for(int i=0;i<total;i++){
			if(ele==b[i]){
				flag=false;
				break;
			}
		}
		if(flag)
			b[total++]=ele;
	}
}
