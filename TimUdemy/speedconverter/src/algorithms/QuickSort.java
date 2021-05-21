package algorithms;

/*
    Divide and conquer algorithm using a pivot element. Recursive much like Merge sort.
    Puts elements greater than the pivot to the right and elements less than the pivot
    to the left leaving the pivot sorted and the other parts not so although potentially
    closer than when we started. Next we move on to sort the left and right portions of
    the array also using a pivot.
 */

public class QuickSort {
    public static void sort(int[] array) {

        sort(array, 0, array.length);
    }

    public static void sort(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int pivotIndex = partition(input, start, end);
        sort(input, start, pivotIndex);
        sort(input, pivotIndex + 1, end);
    }
    public static int partition(int[] input, int start, int end) {
        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {

            // Note: empty loop
            while (i < j && input[--j] >= pivot);

            if (i < j) {
                input[i] = input[j];
            }

            // Note: empty loop
            while (i < j && input[++i] <= pivot);

            if (i < j) {
                input[j] = input[i];
            }
        }

        input[j] = pivot;
        return j;
    }
}
