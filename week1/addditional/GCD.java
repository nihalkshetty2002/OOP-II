import java.util.Scanner;
class GCD{
	public static int gcd(int a,int b){
		if(a==0) return b;
		if(b==0) return a;
		return gcd(b,a%b);
	}
	public static void main(String args[]){
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers: ");
		a=sc.nextInt();
		b=sc.nextInt();
		int gcd=GCD.gcd(a,b);
		System.out.println("GCD: "+gcd+"\nLCM: "+(a*b)/gcd);
	}
}