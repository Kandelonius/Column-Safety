package mathProperties;
// Given natural number n. Generate a sequence of integers, described in the Collatz conjecture:
// If n is an even number, divide it in half, if it is odd, multiply it by 3 and add 1.
// Repeat this operation until we get the number 1 as a result.

import java.util.Scanner;

public class CollatzConjecture {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int num = stdIn.nextInt();
        System.out.print(num + " ");
        while (num != 1) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num * 3 + 1;
            }
            System.out.print(num + " ");
        }
    }
}
