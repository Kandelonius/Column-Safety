package sumthreeandfive;

public class Main
{
	public static void main(String[] args)
	{
		int fullSum = 0;
		int terminate = 0;
		for(int i = 1; i < 1000; i++)
		{
			if((i%3 == 0) && (i%5 == 0))
			{
				fullSum += i;
				System.out.println(i+" meets the criteria.");
				terminate++;
				if(terminate == 5)
				{
					System.out.println("breaking out now");
					break;
				}
			}
		}
		System.out.println("the total of valid numbers is "+fullSum);
		System.out.println(sumOdd(4, 277));
		System.out.println(sumDigits(4598));
	}
	public static boolean isOdd(int number)
	{
		if(number <= 0)
		{
			return false;
		}else if(number % 2 != 0)
		{
			return true;
		}
		return false;
	}
	public static int sumOdd(int start, int end)
	{
		int sum = 0;
		if(start < 0 || end < 0 || end < start)
		{
			return -1;
		}
		for(int i = start; i <= end; i++)
		{
			if(isOdd(i))
			{
				sum += i;
			}
		}
		return sum;
	}
	public static int sumDigits(int number)
	{
		int sum = 0;
		if(number < 10)
		{
			return -1;
		}
		while(number>0)
		{
			sum += number%10;
			number/=10;
		}
		return sum;
	}
}