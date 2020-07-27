package areacalculator;

public class Main
{
	public static void main(String[] args)
	{
		area(4);
		int a = 30;
		double b = 15.75;
		System.out.println("double/int addition " + (a + b));
	}
	public static double area(double radius)
	{
		if(radius < 0)
		{
			System.out.println("not a valid number");
			return -1;
		}else 
		{
			return Math.PI*Math.pow(radius,2);
		}
	}
	public static double area(double x, double y)
	{
		if(x < 0 || y < 0)
		{
			System.out.println("not a valid number");
			return -1;
		}else 
		{
			return x*y;
		}
	}
}