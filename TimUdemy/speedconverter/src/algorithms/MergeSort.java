package algorithms;

/*
* Divide and conquer recursive algorithm broken into 2 phases the splitting
* and merging phase. This is done using logic and indices not additional arrays.
* O(nlogn) time complexity.
* Splitting phase:
* Take the unsorted array and divide it into 2 unsorted arrays (left and right).
* Split each array into 2 arrays and continue to do this until you have all single
* digit parts of the array.
* Merging phase:
* Merge every left right pair into a sorted array to have a bunch of sorted 2 element
* arrays. Then merge all of those sorted arrays and repeat until complete.
*/

public class MergeSort {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        split(intArray, 0, intArray.length);

        Helper.printSorted(intArray);
    }

    public static void split(int[] input, int start, int end) {

        if (end - start < 2) {
            return;
        }
        int mid = (start + end) / 2;
        split(input, start, mid);
        split(input, mid, end);
        merge(input, start, mid, end);
    }
    public static void merge(int[] input, int start, int mid, int end) {

        if (input[mid - 1] <= input[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);

    }

}
