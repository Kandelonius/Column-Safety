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
	}
}