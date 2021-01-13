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
    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for (int gap = intArray.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < intArray.length; i++) {
                int newElement = intArray[i];

                int j = i;

                while (j >= gap && intArray[j - gap] > newElement) {
                    intArray[j] = intArray[j - gap];
                    j -= gap;
                }

                intArray[j] = newElement;

            }

        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}