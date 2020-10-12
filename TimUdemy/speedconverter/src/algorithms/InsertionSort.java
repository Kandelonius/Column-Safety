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
    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for (int firstUnsorted = 1; firstUnsorted < intArray.length; firstUnsorted++) {
            int newValue = intArray[firstUnsorted];
            int i;
            for (i = firstUnsorted; i > 0 && intArray[i - 1] > newValue; i--) {
                intArray[i] = intArray[i - 1];
            }
            intArray[i] = newValue;
        }
        Helper.printSorted(intArray);
    }
}
