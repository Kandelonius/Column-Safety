package arrays;

import java.util.Scanner;

public class MinimumElementChallenge {
    private static Scanner stdIn = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter the amount of ints you want in the array.");
        int count = stdIn.nextInt();
        int[] ints = readIntegers(count);
        int min = findMin(ints);
        System.out.println("The smallest int was " + min);
    }

    private static int[] readIntegers(int count) {

        int[] arr = new int[count];
        System.out.println("enter " + count + " integers to be stored.");
        for (int i = 0; i < count; i++) {
            arr[i] = stdIn.nextInt();
        }
        return arr;
    }

    private static int findMin(int[] arr) {

//        int min = arr[0]; this was my approach to this
        int min = Integer.MAX_VALUE; // this is Tim's approach

        for(int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
}
