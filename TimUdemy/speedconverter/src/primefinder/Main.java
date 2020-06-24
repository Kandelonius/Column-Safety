package primefinder;

public class Main
{
	public static void main(String[] args)
	{
		countPrimes(12, 77);
	}
	public static void countPrimes(int bottomNumber, int topNumber)
	{
	int primes = 0;
		for(int i = bottomNumber; i < topNumber; i++)
		{
			if(isPrime(i))
			{
				System.out.println(i+" is prime I can hold "+(2-primes)+" more primes before I terminate");
				primes++;
			}
			if(primes == 3)
			{
				system.out.println("Terminating");
				break;
			}
		}
	}
	public static boolean isPrime(int n)
	{
		if(n <= 1)
		{
			return false;
		}
		for(int i = 2; i < n/2; i++)
		{
			if(n%i == 0)
			{
				return false;
			}
		}
		return true;
	}
}