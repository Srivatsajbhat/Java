package tc;
public class Time
{
	public static double MinToHour(double n)
	{
		return(n*0.0166667);
	}
	public static double HourToMin(double n)
	{
		return(n*60);
	}
	public static double HourToSec(double n)
	{
		return(n*3600);
	}
	public static double SecToHour(double n)
	{
		return(n*0.000277778);
	}
	public static double MinToSec(double n)
	{
		return(n*60);
	}
	public static double SecToMin(double n)
	{
		return(n*0.0166667);
	}
}
