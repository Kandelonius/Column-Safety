package algorithms;

/*
    Makes assumptions about the data, doesn't use comparisons. Counts the number
    of occurrences, only works with non-negative discrete values. Uses a specific
    range.
 */

public class CountingSort {
    public static void sort(int[] array, int min, int max) {

        int[] countArray = new int[(max - min) + 1];

        for (int i = 0; i < array.length; i++) {
            countArray[array[i] - min]++;
        }

        int j = 0;
        for (int i = min; i <= max; i++) {
            while (countArray[i - min] > 0) {
                array[j++] = i;
                countArray[i - min]--;
            }
        }
    }
}
