package areacalculator;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        area(4);
        int a = 30;
        double b = 15.75;
        System.out.println("double/int addition " + (a + b));
        fPrinter();
        char ch = 'a';
        int num = 0;
        switch(ch) {
            case 'a':
                num = 10;
//                break;
            case 'b':
                num = 20;
//                break;
//            default:
//                num = 30;
        }
        System.out.println(num);
    }

    public static double area(double radius)
    {
        if (radius < 0)
        {
            System.out.println("not a valid number");
            return -1;
        } else
        {
            return Math.PI * Math.pow(radius,
                2);
        }
    }

    public static double area(
        double x,
        double y)
    {
        if (x < 0 || y < 0)
        {
            System.out.println("not a valid number");
            return -1;
        } else
        {
            return x * y;
        }
    }

    public static void fPrinter()
    {
        for (int i = 0; i < 5; i++)
        {
            for (char letter = 'a'; letter <= 'f'; letter++)
            {
                if (letter < 'f')
                {
                    continue;
                }
                System.out.println(letter);
            }
        }
    }
}