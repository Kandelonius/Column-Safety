package primefinder;

public class Main {
    public static void main(String[] args) {
        countPrimes(12,
            77);
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(31));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
        System.out.println(isComposite(2));
        System.out.println(isComposite(4));
        System.out.println(isComposite(29));
        System.out.println(isComposite(217));
        System.out.println("5381 is prime? " + isPrime(5381));
    }

    public static void countPrimes(
        int bottomNumber,
        int topNumber) {
        int primes = 0;
        for (int i = bottomNumber; i < topNumber; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is prime I can hold " + (2 - primes) + " more primes before I terminate");
                primes++;
            }
            if (primes == 3) {
                System.out.println("Terminating");
                break;
            }
        }
    }

    public static boolean isComposite(long number) {
        if (number <= 2) {
            return false;
        }
        int compare = 2;
        while (compare <= Math.sqrt(number)) {
            if (number % compare == 0) {
                return true;
            } else {
                compare++;
            }
        }
        return false;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int getLargestPrime(int number) {
        int copy = number;
        int i;
        if (number < 2) {
            return -1;
        }
        // System.out.println("21 mod 7 is "+(21 % 7));
        // for(int i = (number - 1); i > 1; i--)
        // {
        // 	if(number % i == 0)
        // 	{
        // 		System.out.println("i is "+i);
        // 		for(int j = 1; j <= i; j++)
        // 		{
        // 			System.out.println("j is "+j);
        // 			if(i % j == 0)
        // 			{
        // 				j = i + 1;
        // 			}else if(i == j)
        // 			{
        // 				return i;
        // 			}else
        // 			{
        // 				System.out.println(j+" j i "+i);
        // 			}
        // 		}
        // 	}
        // }
        // return number;
        for (i = 2; i <= copy; i++) {
            if (copy % i == 0) {
                copy /= i;
                i--;
            }
        }
        return i;
    }

}