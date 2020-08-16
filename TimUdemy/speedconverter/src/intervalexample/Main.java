package intervalexample;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        long num = stdIn.nextLong();

        if (num > -15 && num <= 12 || num > 14 && num < 17 || num >= 19) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        int i = new Scanner(System.in).nextInt();
//        System.out.println(i >= 19 || i <= 12 && i > -15 || i > 14 && i < 17 ? "True" : "False");
//    }
//}
