package barkingdog;
/*
Write a Java program that reads two values:
the first is the number of Reese's peanut butter cups;
the second is a boolean representing whether it is the weekend. 10 - 20 weekdays 15 - 25 weekends
The program must print the boolean value that indicates the party is successful or not.
Sample Input 1:
5 true
Sample Output 1:
false
Sample Input 2:
16 false
Sample Output 2:
true
 */

import java.util.Scanner;

public class GroundhogParty {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int num = stdIn.nextInt();
        boolean isWeekend = stdIn.nextBoolean();
        System.out.println(checkParty(isWeekend,
            num));
    }

    public static boolean checkParty(
        boolean isWeekend,
        int num) {
        if (isWeekend && 15 <= num && num <= 25) {
            return true;
        } else {
            return !isWeekend && 10 <= num && num <= 20;
        }
    }
}

/*
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final int peanuts = scanner.nextInt();
        final boolean isWeekend = scanner.nextBoolean();
        final boolean goodForNormalDays = peanuts >= 10 && peanuts <= 20 && !isWeekend;
        final boolean goodForWeekend = peanuts >= 15 && peanuts <= 25 && isWeekend;

        System.out.println(goodForNormalDays || goodForWeekend);
//        int cups = scanner.nextInt();
//        boolean weekend = scanner.nextBoolean();
//
//        System.out.println(weekend ? cups >= 15 && cups <= 25 : cups >= 10 && cups <= 20);
    }
}
 */