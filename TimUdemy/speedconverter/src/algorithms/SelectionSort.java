package algorithms;

/**
 * Selection sort takes the largest known element and stores its location in a variable then
 * sends a pointer down the array comparing each number to the value of that location. If
 * the new number is larger then the variable is updated to the new largest index and the
 * sort continues in this way to the end of the array at which point the last index is swapped
 * if it is not larger than the number at the location in memory and is considered sorted.
 * <p>
 * Selection sort is an in place O(1) space complexity algorithm
 * It is also O(n^2) quadratic time complexity.
 * It is considered unstable and usually faster than bubble sort.
 */

public class SelectionSort {
    public static void sort(int[] array) {

        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int highest = 0;
            for (int pointerToIndex = 1; pointerToIndex <= lastUnsortedIndex; pointerToIndex++) {
                if (array[pointerToIndex] > array[highest]) {
                    highest = pointerToIndex;
                }
            }
            Helper.swap(array,
                highest,
                lastUnsortedIndex);
        }
    }
}
