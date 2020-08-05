package unordered;

import java.util.Scanner;

public class TheUnordered
{
    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        int input;
        int reference = 0;
        String direction = "flat";
        boolean ordered = true;
        boolean proceed = true;
        while (proceed && ordered)
        {
            input = stdIn.nextInt();
            if (reference == 0)
            {
                reference = input;
            }
            if (input == 0)
            {
                proceed = false;
                break;
            }
            if ((input != reference))
            {
                if (input < reference && direction.equals("up"))
                {
                    ordered = false;
                    break;
                } else if (input > reference && direction.equals("down"))
                {
                    ordered = false;
                    break;
                } else if (input < reference)
                {
                    direction = "down";
                } else if (input > reference)
                {
                    direction = "up";
                }
                stdIn.nextLine();
            }
            reference = input;
            stdIn.nextLine();
        }
        stdIn.close();
        System.out.println(ordered);
    }
}
