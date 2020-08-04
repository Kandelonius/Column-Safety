package oddoreven;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //        Scanner stdIn = new Scanner(System.in);
        //        if(stdIn.hasNext())
        //        {
        //        }
        Scanner scanner = new Scanner(System.in);
        int num;

        while (scanner.hasNext())
        {
            num = scanner.nextInt();
            if (num == 0)
            {
                break;
            }

            if (num % 2 == 0)
            {
                System.out.println("even");
            } else
            {
                System.out.println("odd");
            }
        }
        int max = 10;
        int min = 0;
        int range = max - min;

        //        for (int i = 0; i < 10; i++) {
        int rand = 1;
        //        do
        while (rand != 0)
        {
            rand = (int) (Math.random() * range) + min;
            // Output is different everytime this code is executed
            //            System.out.println(rand);
            oddOrEven(rand);
        }
    }

    public static void oddOrEven(int num)
    {
        if (num % 2 == 1)
        {
            System.out.println("odd");
        } else if (num % 2 == 0)
        {
            System.out.println("even");
        }
    }
}
