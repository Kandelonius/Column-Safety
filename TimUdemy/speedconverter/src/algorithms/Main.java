package algorithms;

// Main class and method for the sorting algorithms

public class Main {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        int[] positiveArray = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};

//        BubbleSort.sort(intArray);
//        InsertionSort.sort(intArray);
//        MergeSort.sort(intArray);
//        QuickSort.sort(intArray);
//        SelectionSort.sort(intArray);
//        ShellSort.sort(intArray);
        CountingSort.sort(positiveArray, 1, 10);

//        Helper.printSorted(intArray); // use for sorts that allow negative
        Helper.printSorted(positiveArray); // use for sorts that don't allow negative
    }
}
