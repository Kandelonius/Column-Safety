package primefinder;

public class Main
{
	public static void main(String[] args)
	{
		countPrimes(77);
	}
	public static void countPrimes(int n)
	{
	int primes = 0;
		for(int i = 0; i < n; i++)
		{
			if(isPrime(n))
			{
				System.out.println(n+" is prime I can hold "+(2-primes)+" more primes before I terminate");
				primes++;
				n--;
			}
			if(primes == 3)
			{
				break;
			}
			n--;
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