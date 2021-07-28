package sollersjava.exceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a number to be used as your age!");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int[] a = {44, 30, 60, 26};
        int c = 'C';
        System.out.println("C as an int is " + c); // outputs 67 which is the Ascii value for 'C'
        try {
            System.out.println(a[0]);
            System.out.println(a[2]);
            System.out.println(a[6]); // will stop at this point due to index 6 being out of bounds
            System.out.println(a[1]);
        }catch (ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(a[3]);

        if(age >= 18) {
            throw new ArithmeticException("not valid");
        } else {
            System.out.println("valid");
        }
    }
}
