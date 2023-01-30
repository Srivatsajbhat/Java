import cc.Currency;
import dc.Distance;
import tc.Time;
import java.util.Scanner;
class Test
{
	public static void main(String[] args)
	{
		int convert,choice;
		double n,u;
		Scanner sc= new Scanner(System.in);
		do{
			System.out.println("MENU");
			System.out.println("1.Currency Converter\n2.Distance Converter\n3.Time Converter\n4.Exit\n");
			System.out.println("Enter the converter");
			convert=sc.nextInt();
			switch(convert)
			{
				case 1: do{
						System.out.println("1.INR TO USD\n2.USD TO INR\n3.EURO TO INR\n4.INR TO EURO\n5.INR TO YEN\n6.YEN TO INR\n7.BACK\n");
						System.out.println("Enter the choice");
						choice=sc.nextInt();
						switch(choice)
						{
							case 1: System.out.println("Enter INR : "); 
								n=sc.nextInt();
								u=Currency.InrToUsd(n);
								System.out.println("INR in USD = \n"+u);
								break;
							case 2: System.out.println("Enter USD : "); 
								n=sc.nextInt();
								u=Currency.UsdToInr(n);
								System.out.println("USD in INR = "+u);
								break;
							case 3: System.out.println("Enter INR : "); 
								n=sc.nextInt();
								u=Currency.InrToEuro(n);
								System.out.println("INR in EURO = "+u);
								break;
							case 4: System.out.println("Enter EURO : "); 
								n=sc.nextInt();
								u=Currency.EuroToInr(n);
								System.out.println("EURO in INR = "+u);
								break;
							case 5: System.out.println("Enter INR : "); 
								n=sc.nextInt();
								u=Currency.InrToYen(n);
								System.out.println("INR in YEN = "+u);
								break;
							case 6: System.out.println("Enter YEN : "); 
								n=sc.nextInt();
								u=Currency.YenToInr(n);
								System.out.println("YEN in INR = "+u);
								break;
							case 7:break;
							default:System.out.println("Invalid Choice\n");
						}
					}while(choice!=7);
					break;
				case 2: do{
						System.out.println("1.METER TO KM\n2.KM TO METER\n3.MILE TO KM\n4.KM TO MILE\n5.METER TO MILE\n6.MILE TO METER\n7.BACK\n");
						System.out.println("Enter the choice");
						choice=sc.nextInt();
						switch(choice)
						{
							case 1: System.out.println("Enter Meter : "); 
								n=sc.nextInt();
								u=Distance.MeterToKm(n);
								System.out.println("Meter in Km = \n"+u);
								break;
							case 2: System.out.println("Enter Km : "); 
								n=sc.nextInt();
								u=Distance.KmToMeter(n);
								System.out.println("Km in Meter = "+u);
								break;
							case 3: System.out.println("Enter Mile : "); 
								n=sc.nextInt();
								u=Distance.MileToKm(n);
								System.out.println("Mile in Km = "+u);
								break;
							case 4: System.out.println("Enter Km : "); 
								n=sc.nextInt();
								u=Distance.KmToMile(n);
								System.out.println("Km in Mile = "+u);
								break;
							case 5: System.out.println("Enter Meter : "); 
								n=sc.nextInt();
								u=Distance.MeterToMile(n);
								System.out.println("Meter in Mile = "+u);
								break;
							case 6: System.out.println("Enter Mile : "); 
								n=sc.nextInt();
								u=Distance.MileToMeter(n);
								System.out.println("Mile in Meter = "+u);
								break;
							case 7:break;
							default:System.out.println("Invalid Choice\n");
						}
					}while(choice!=7);
					break;
				case 3: do{
						System.out.println("1.MIN TO HOUR\n2.HOUR TO MIN\n3.HOUR TO SEC\n4.SEC TO HOUR\n5.MIN TO SEC\n6.SEC TO MIN\n7.BACK\n");
						System.out.println("Enter the choice");
						choice=sc.nextInt();
						switch(choice)
						{
							case 1: System.out.println("Enter Min : "); 
								n=sc.nextInt();
								u=Time.MinToHour(n);
								System.out.println("Min in Hour = \n"+u);
								break;
							case 2: System.out.println("Enter Hour : "); 
								n=sc.nextInt();
								u=Time.HourToMin(n);
								System.out.println("USD in INR = "+u);
								break;
							case 3: System.out.println("Enter INR : "); 
								n=sc.nextInt();
								u=Time.HourToSec(n);
								System.out.println("INR in EURO = "+u);
								break;
							case 4: System.out.println("Enter EURO : "); 
								n=sc.nextInt();
								u=Time.SecToHour(n);
								System.out.println("EURO in INR = "+u);
								break;
							case 5: System.out.println("Enter INR : "); 
								n=sc.nextInt();
								u=Time.MinToSec(n);
								System.out.println("INR in YEN = "+u);
								break;
							case 6: System.out.println("Enter YEN : "); 
								n=sc.nextInt();
								u=Time.SecToMin(n);
								System.out.println("YEN in INR = "+u);
								break;
							case 7:break;
							default:System.out.println("Invalid Choice\n");
						}
					}while(choice!=7);
					break;
				case 4:System.exit(0);
			}
		}while(convert!=4);
	
	}
}
	

