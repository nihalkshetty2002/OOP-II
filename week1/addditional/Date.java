import java.util.Scanner;

class Date{
	public static void  main(String ar[]){
		String date[];
		int addate,yr,mm,dd;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter date in dd/mm/yyyy format: ");
		date=sc.nextLine().split("/");

		dd=Integer.parseInt(date[0]);
		mm=Integer.parseInt(date[1]);
		yr=Integer.parseInt(date[2]);
		System.out.println("Enter additional date (dd): ");
		addate=sc.nextInt();

		dd+=addate;

		switch(mm){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: if(dd>31){
					 	dd%=31;
					 	mm++;
					 	if(mm>12)
					 		yr++;
					 		mm=1;
				 	}
				 	break;
			case 2: if(dd>29&&(yr%4==0&&(yr%100!=0||yr%400==0)))
						dd%=29;
					else{
						mm++;
						dd%=28;
					}
					break;
			default: if(dd>30){
						dd%=30;
						mm++;
					}
		}

		System.out.println("Date after addition: "+dd+"/"+mm+"/"+yr);
	}
}