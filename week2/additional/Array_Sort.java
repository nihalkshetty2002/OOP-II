import java.util.*;

class Array_Sort{
	public static void main(String args[]){
		int a[][],b[],temp[],i,j,count,t,high;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array size: ");
		a=new int[sc.nextInt()][sc.nextInt()];
		b=new int[a.length];

		System.out.print("\nEnter binary numbers: ");
		for(i=0;i<a.length;i++){
			count=0;
			for(j=0;j<a[i].length;j++){
				a[i][j]=sc.nextInt();
				if(a[i][j]==1)
					count++;
			}
			b[i]=count;
		}
		for(i=0;i<b.length;i++){
			high=i;
			for(j=i+1;j<b.length;j++){
				if(b[j]>b[high])
					high=j;
			}
			t=b[i];
			b[i]=b[high];
			b[high]=t;
			temp=a[i].clone();
			a[i]=a[high].clone();
			a[high]=temp.clone();
		}

		System.out.println("Array after sorting: ");
		for(i=0;i<a.length;i++){
			display(a[i]);
		}
	}

	static void display(int[] a){
		for(int x:a){
			System.out.print(x+" ");
		}
		System.out.println();
	}
}