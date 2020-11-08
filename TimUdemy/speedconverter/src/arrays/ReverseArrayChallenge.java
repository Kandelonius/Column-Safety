package arrays;

import java.util.Arrays;

public class ReverseArrayChallenge {
    public static void main(String[] args) {

        int[] intArr = {1, 2, 3, 4, 5};
        System.out.println("before " + Arrays.toString(intArr));
        reverse(intArr);
        System.out.println("after " + Arrays.toString(intArr));

    }

    private static void reverse(int[] arr) {

        int tempHigh;
        int tempLow;
        int pointer = 0;
        for (int i = arr.length - 1; i > 0; i--) {
            if (i > pointer) {
                tempHigh = arr[i];
                tempLow = arr[pointer];
                arr[i] = tempLow;
                arr[pointer] = tempHigh;
                pointer++;
            } else {
                break;
            }
        }
    }
}
