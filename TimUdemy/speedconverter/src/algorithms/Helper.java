package algorithms;

/**
 * A place to store my helper methods.
 */

public class Helper {
    public static void swap(
        int[] arr,
        int i,
        int j) {
        // if i == j then we don't need to do anything
        if (i == j) {
            return;
        }
        // otherwise we assign the value at arr[i] to a new variable temp
        // then assign the value at arr[j] to arr[i] and place the value in
        // temp (which was previously arr[i]) into arr[j].
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printSorted(int[] arr) {
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
