package algorithms;

/**
 * Insertion Sort designates a sorted area and grows that sorted area with each
 * iteration. It stores the value being sorted in a variable and if that value is
 * greater than the largest value in the sorted partition it leaves that value there
 * and grows the partition. If the value is not larger than the greatest sorted value
 * that value is shifted to the right and the next value is evaluated. Once it finds
 * where the new value belongs that value is inserted.
 *
 * Insertion Sort is in-place meaning O(1) space complexity
 * It is quadratic time complexity I(n^2)
 * It is also a stable sorting algorithm.
 */

public class InsertionSort {
    public static void sort(int[] array) {

        for (int firstUnsorted = 1; firstUnsorted < array.length; firstUnsorted++) {
            int newValue = array[firstUnsorted];
            int i;
            for (i = firstUnsorted; i > 0 && array[i - 1] > newValue; i--) {
                array[i] = array[i - 1];
            }
            array[i] = newValue;
        }
    }
}
