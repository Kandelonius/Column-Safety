package scannerchallenge;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		int count = 0;
		int total = 0;

		System.out.println("Please enter 10 different numbers to be added together");
		While (true)
		{
			total += 
			count++;
			System.out.println("Enter number  number "+(count + 1));
			boolean isAnInt = stdIn.hasNextInt();
			if(count == 10)
			{
				break;
			}
		}
		stdIn.close();
	}
}