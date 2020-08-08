package unordered;

import java.util.Scanner;

public class GiveUpAmerica
{
    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        int input, reference;
        boolean proceed = true;
        boolean ordered = true;
        reference = stdIn.nextInt();
        input = stdIn.nextInt();
        if (input == 0)
        {
            proceed = false;
        }
        boolean ascending = false;
        boolean descending = false;
        while (proceed)
        {
            if (input == reference)
            {
                reference = input;
                input = stdIn.nextInt();
                if (input == 0)
                {
                    break;
                }
            }
            if (input > reference)
            {
                if (descending)
                {
                    ordered = false;
                    break;
                }
                ascending = true;
                reference = input;
                input = stdIn.nextInt();
            } else if (input < reference && !ascending)
            {
                descending = true;
                reference = input;
                input = stdIn.nextInt();
            } else if (input < reference && ascending)
            {
                ordered = false;
                break;
            }
            if (input == 0)
            {
                break;
            }
        }
        stdIn.close();
        System.out.println(ordered);
    }
}
