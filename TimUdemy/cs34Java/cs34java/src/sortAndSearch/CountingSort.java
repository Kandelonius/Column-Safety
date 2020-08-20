package sortAndSearch;

public class CountingSort {
    public static void main(String[] args) {
        int num = 9; // number of elements in the array
        int max = 0;
        int[] countedArray = new int[num];
        // find out the max element
        for (int i = 0; i < num; i++) {
            if (i == 0) {
                max = countedArray[i];
            } else if (max < countedArray[i]) {
                max = countedArray[i];
            }
        }
        int[] theCounts = new int[max + 1];
    }
}
