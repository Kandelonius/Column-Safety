package speeds;

public class SpeedConverter
{
	public static void main(String[] args)
	{
		System.out.println("hello SpeedConverter");
		printConversion(1.5);
		printConversion(10.25);
		printConversion(-5.6);
		printConversion(5.0);
	}
	public static long toMilesPerHour(double kilometersPerHour)
	{
		long result;
		if(kilometersPerHour < 0)
		{
			return -1;
		}
		else
		{
			result = Math.round(kilometersPerHour / 1.609);
			return result;
		}
	}
	public static void printConversion(double kilometersPerHour)
	{
		if(kilometersPerHour < 0)
		{
			System.out.println("Invalid Value");
		}
		else
		{
			long milesPerHour = toMilesPerHour(kilometersPerHour);
			System.out.println(kilometersPerHour+" km/h = "+milesPerHour+" mi/h");
		}
	}
}