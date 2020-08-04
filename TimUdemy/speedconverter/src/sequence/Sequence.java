package sequence;

import java.util.Scanner;

public class Sequence
{
    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        //        int iterate = 0;
        int number = 0;
        int placeholder = 0;
        int input = stdIn.nextInt();
        while (input > 0)
        {
            if (placeholder == 0)
            {
                System.out.print(1);
                placeholder = 2;
                number = 2;
                input--;
            } else
            {
                System.out.print(" " + placeholder);
                //                System.out.println("number: " + number + " placeholder: " + placeholder);
                input--;
                number--;
                if (number == 0)
                {
                    placeholder++;
                    number += placeholder;
                }
            }
        }
        stdIn.close();
    }
}
