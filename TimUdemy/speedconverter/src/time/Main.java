package time;

public class Main
{
	public static void main(String[] args)
	{
		printYearsAndDays(525600);
		printYearsAndDays(1051200);
		printYearsAndDays(561600);
		printDayOfTheWeek(-1);
		printDayOfTheWeek(3);
	}
	public static void printYearsAndDays(long minutes)
	{
		if(minutes < 0)
		{
			System.out.println("Invalid Value");
		}else
		{
			int years = (int) minutes/525600;
			int days = ((int) minutes%525600)/1440;
			System.out.println(minutes+" min = "+years+" y and "+days+" d");
		}
	}
	private static void printDayOfTheWeek(int day)
	{
		switch(day)
		{
			case 0:
			System.out.println("Sunday");
			break;
			case 1:
			System.out.println("Monday");
			break;
			case 2:
			System.out.println("Tueday");
			break;
			case 3:
			System.out.println("Wednesday");
			break;
			case 4:
			System.out.println("Thursday");
			break;
			case 5:
			System.out.println("Friday");
			break;
			case 6:
			System.out.println("Saturday");
			break;
			default:
			System.out.println("Invalid day");
		}
	}
}