package scannerchallenge;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		// minAndMax(1); // uncomment this line to use minAndMax
		// addTen(1); // uncomment this line to use addTen

		// Scanner stdIn = new Scanner(System.in);
		// int count = 0;
		// int total = 0;

		// System.out.println("Please enter 10 different numbers to be added together");
		// while(true) 
		// {
  //           int order = count + 1;
  //           System.out.println("Enter number #" + order + ":");

  //           boolean isAnInt = stdIn.hasNextInt();

  //           if(isAnInt) {
  //              int number = stdIn.nextInt();
  //              count++;
  //              total += number;
  //             if(count == 10) {
  //                 break;
  //             }
  //           } else {
  //               System.out.println("Invalid number");
  //           }

  //           stdIn.nextLine(); // handle end of line (enter key) so user can enter another number
  //       }
  //       System.out.println("total = " + total);
		// stdIn.close();
	}
	public static void addTen(int one)
	{
		Scanner stdIn = new Scanner(System.in);
		int count = 0;
		int total = 0;

		System.out.println("Please enter 10 different numbers to be added together");
		while(true) 
		{
            int order = count + 1;
            System.out.println("Enter number #" + order + ":");

            boolean isAnInt = stdIn.hasNextInt();

            if(isAnInt) {
               int number = stdIn.nextInt();
               count++;
               total += number;
              if(count == 10) {
                  break;
              }
            } else {
                System.out.println("Invalid number");
            }

            stdIn.nextLine(); // handle end of line (enter key) so user can enter another number
        }
        System.out.println("total = " + total);
		stdIn.close();
	}
	public static void minAndMax(int one)
	{
		Scanner stdIn = new Scanner(System.in);

		int min = 0, max = 0;
		boolean first = true; // boolean flag

		while(true)
		{
			System.out.println("Enter number:");
			boolean isAnInt = stdIn.hasNextInt();

			if(isAnInt)
			{
				int number = stdIn.nextInt();
				if(first == true)
				{
					min = number;
					max = number;
					first = false; // change boolean flag
				}else if(number > max)
				{
					number = max;
				}else if(number < min)
				{
					number = min;
				}
			}else
			{
				break;
			}
			stdIn.nextLine();// handle end of line (enter key) so user can enter another number
		}
		System.out.println("min = "+min+", max = "+max);
		stdIn.close();
	}
}