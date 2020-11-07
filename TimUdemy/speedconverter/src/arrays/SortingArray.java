package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortingArray {
    public static void main(String[] args) {

        int length = 5;
        int[] ints = getIntegers(length);
        int[] sortedInts = sortDescending(ints, length);
        printArray(sortedInts);
    }

    public static int[] sortDescending(int[] arr, int len) {

        int[] sortedArr = Arrays.copyOf(arr, len);
        // using insertion sort

        for(int firstUnsorted = 1; firstUnsorted < len; firstUnsorted++) {
            int storedValue = sortedArr[firstUnsorted];
            int check;
            for (check = firstUnsorted; check > 0 && sortedArr[check - 1] < storedValue; check--) {
                sortedArr[check] = sortedArr[check - 1];
            }
            sortedArr[check] = storedValue;
        }
        return sortedArr;
    }

    public static int[] getIntegers(int len) {
        Scanner stdIn = new Scanner(System.in);
        int[] arr = new int[len];
        System.out.println("enter " + len + " integers to be sorted.");
        for (int i = 0; i < len; i++) {
            arr[i] = stdIn.nextInt();
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        System.out.print("The array numbers are: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
