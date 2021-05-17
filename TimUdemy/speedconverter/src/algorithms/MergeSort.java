package algorithms;

/*
* Divide and conquer recursive algorithm broken into 2 phases the splitting
* and merging phase. This is done using logic and indices not additional arrays.
* O(nlogn) time complexity.
* Splitting phase:
* Take the unsorted array and divide it into 2 unsorted arrays (left and right).
* Split each array into 2 arrays and continue to do this until you have all single
* digit arrays.
* Merging phase:
* Merge every left right pair into a sorted array to have a bunch of sorted 2 element
* arrays. Then merge all of those sorted arrays and repeat until complete.
*/

public class MergeSort {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        Helper.printSorted(intArray);
    }

}
