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
    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};


        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int highest = 0;
            for (int pointerToIndex = 1; pointerToIndex <= lastUnsortedIndex; pointerToIndex++) {
                if (intArray[pointerToIndex] > intArray[highest]) {
                    highest = pointerToIndex;
                }
            }
            Helper.swap(intArray,
                highest,
                lastUnsortedIndex);
        }
        Helper.printSorted(intArray);
    }
}
