package factors;

public class Main
{
	public static void main(String[] args)
	{
		System.out.println(getGreatestCommonDivisor(25, 15));
		System.out.println(getGreatestCommonDivisor(12, 30));
		System.out.println(getGreatestCommonDivisor(9, 18));
		System.out.println(getGreatestCommonDivisor(81, 153));
	}
	public static int getGreatestCommonDivisor(int first, int second)
	{
		if(first < 10 || second < 10)
		{
			return -1;
		}

		for(int i = (first - 1); i > 1; i--)
		{
			if((first % i == 0) && (second % i == 0))
			{
				return i;
			}
		}
		return 1;
	}
	public static void printFactors(int number)
	{
		if(number<1)
		{
			System.out.println("Invalid Value");
		}
		for(int i = 1; i <= number; i++)
		{
			if(number%i == 0)
			{
				System.out.println(i);
			}
		}
	}
	public static boolean isPerfectNumber(int number)
	{
		int tempNum = 0;
		if(number < 0)
		{
			return false;
		}else if(number == 0)
		{
			return false;
		}
		for(int i = 1; i < number; i++)
		{
			if(number % i == 0)
			{
				tempNum += i;
			}
		}
		return number == tempNum;
	}
}