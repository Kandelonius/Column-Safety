package scannerchallenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        stringMatch();
        //        timeBetween();
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

    public static void addTen(int one) {
        Scanner stdIn = new Scanner(System.in);
        int count = 0;
        int total = 0;

        System.out.println("Please enter 10 different numbers to be added together");
        while (true) {
            int order = count + 1;
            System.out.println("Enter number #" + order + ":");

            boolean isAnInt = stdIn.hasNextInt();

            if (isAnInt) {
                int number = stdIn.nextInt();
                count++;
                total += number;
                if (count == 10) {
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

    public static void minAndMax(int one) {
        Scanner stdIn = new Scanner(System.in);

        int min = 0, max = 0;
        boolean first = true; // boolean flag

        while (true) {
            System.out.println("Enter number:");
            boolean isAnInt = stdIn.hasNextInt();

            if (isAnInt) {
                int number = stdIn.nextInt();
                if (first == true) {
                    min = number;
                    max = number;
                    first = false; // change boolean flag
                } else if (number > max) {
                    number = max;
                } else if (number < min) {
                    number = min;
                }
            } else {
                break;
            }
            stdIn.nextLine();// handle end of line (enter key) so user can enter another number
        }
        System.out.println("min = " + min + ", max = " + max);
        stdIn.close();
    }

    public static void timeBetween() {
        Scanner sc = new Scanner(System.in);

        int hours1 = sc.nextInt();
        int minutes1 = sc.nextInt();
        int seconds1 = sc.nextInt();
        int firstMomentInSeconds = hours1 * 3600 + minutes1 * 60 + seconds1;

        int hours2 = sc.nextInt();
        int minutes2 = sc.nextInt();
        int seconds2 = sc.nextInt();
        int secondMomentInSeconds = hours2 * 3600 + minutes2 * 60 + seconds2;

        int difference = secondMomentInSeconds - firstMomentInSeconds;

        System.out.println(difference);
    }
    // evaluates if two given strings are the same if unnecessary whitespace is removed from them.
    public static void stringMatch() {
        Scanner stdIn = new Scanner(System.in);
        String str1 = stdIn.nextLine()
            .replaceAll(" ",
                "");
        String str2 = stdIn.nextLine()
            .replaceAll(" ",
                "");
        System.out.println(str1.equals(str2));
    }
    //    public static String removeWhitespace(String string) {
    //        String temp = "";
    //        for (int i = 0; i < string.length(); i++) {
    //            if ((char)string.charAt(i).equals(" ")) {
    //                temp += string[i];
    //            }
    //        }
    //        return temp;
    //    }
}