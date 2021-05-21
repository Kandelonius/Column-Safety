package algorithms;

/**
 * degrades as sets get larger
 * as we sort we separate the array into sorted and unsorted parts
 * bubble sort moves along it's set and compares each element with the one
 * that is next and if it satisfies a certain condition the elements are swapped
 * and the algorithm moves on. If the two elements don't meet the condition the
 * algorithm simply moves on. At this point the last element is considered sorted
 * then we start over until n - 1.
 * in place algorithm meaning space complexity is O(1)
 * time complexity is O(n^2)
 * <p>
 * **side-note for sort stability if there are duplicate values and they swap positions
 * after the sort has concluded then the sort is considered unstable, if they preserve
 * their order then the sort is considered stable.
 * <p>
 * bubble sort is stable because for our implementation we only swaps the elements if
 * the right value is greater than the left.
 */

public class BubbleSort {
    public static void sort(int[] array) {

        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (array[i] > array[i + 1]) { // this is why this implementation is stable
                    Helper.swap(array, i, i + 1);
                }
            }
        }
    }
}
