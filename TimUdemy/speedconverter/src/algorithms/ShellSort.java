package algorithms;

/**
 * Evolved from insertion sort. Shell sort chooses which element to insert using
 * a gap that is typically based on the size of the set being sorted whereas
 * insertion sort only uses a gap value of 1. The shell sort shrinks its gap value
 * with each iteration until it is finally 1.
 * One very common way to calculate the gap value is called Knuth Sequence where
 * the gap value is calculated using (3^k - 1) / 2
 * Shell sort wikipedia page for reference - https://en.wikipedia.org/wiki/Shellsort
 * shell sort is an in place algorithm and unstable
 * shell sort can also improve the efficiency of bubble sort
 */

public class ShellSort {
    public static void sort(int[] array) {

        for (int gap = array.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < array.length; i++) {
                int newElement = array[i];

                int j = i;

                while (j >= gap && array[j - gap] > newElement) {
                    array[j] = array[j - gap];
                    j -= gap;
                }

                array[j] = newElement;
            }
        }
    }
}