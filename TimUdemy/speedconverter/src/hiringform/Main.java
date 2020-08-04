package hiringform;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        String firstName = stdIn.nextLine();
        //        System.out.println(firstName);
        int age = stdIn.nextInt();
        //        System.out.println(age);
        stdIn.nextLine();
        String education = stdIn.nextLine();
        //        System.out.println(education);
        int years = stdIn.nextInt();
        //        System.out.println(years);
        stdIn.nextLine();
        String cuisinePreference = stdIn.nextLine();
        //        System.out.println(cuisinePreference);

        System.out.print("The form for " + firstName + " is completed. We will contact you if we need a chef that " +
            "cooks " + cuisinePreference + " dishes.");
    }
}
