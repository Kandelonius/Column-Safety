package unordered;

import java.util.Scanner;

public class TheUnordered
{
    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        int input;
        int reference;
        String direction = "flat";
        reference = stdIn.nextInt();
        input = stdIn.nextInt();
        boolean ordered = true;
        boolean proceed = true;
        if (input == 0)
        {
            proceed = false;
        }
        while (proceed)
        {
            if (reference == input)
            {
                input = reference;
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
//                    direction = "up";
                    direction = "down";
                } else if (input > reference)
                {
                    direction = "up";
//                    direction = "down";
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
