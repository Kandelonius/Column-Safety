package arrays;

import java.util.Arrays;

public class codechallenge {
    public static void main(String[] args) {
        int[] array = {85, 46, 27, 81, 94, 9, 27, 38, 43, 99, 37, 63, 31, 42, 14};

        for (int i : array) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
        //        threeDimArrays();
        anotherThreeDimArray();
    }

    public static void twoDimArrays() {
        int[][] twoDimArray = { // aka int[3][4]
            {1, 2, 3, 1}, // first array of int
            {3, 4, 1, 2}, // second array of int
            {4, 4, 1, 0}  // third array of int
        };
        int number = twoDimArray[0][2]; // 3 in the top row

        // let's output the array
        for (int[] ints : twoDimArray) { // for each prints the full array
            System.out.println(Arrays.toString(ints));
        }
    }

    public static void threeDimArrays() {
        int[][][] cubic = new int[3][4][5];

        int current = 1; // stores a value to fill elements

        for (int i = 0; i < 3; i++) { // iterating through each 2D array ("table" or "matrix")
            for (int j = 0; j < 4; j++) { // iterating through each 1D array ("vector") array of a "matrix"
                for (int k = 0; k < 5; k++) { // iterating through each element of a vector
                    cubic[i][j][k] = current;
                }
            }
            current++; // get the next value to the next "matrix"
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    System.out.print(cubic[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void anotherThreeDimArray() {
        // this code fills the 3-dimensional array
        int[][][] cubic = new int[3][4][5];
        int current = 1;
        for (int[][] dim2Array : cubic) {     // for each 2-dim array
            for (int[] vector : dim2Array) {  // for each 1-dim array (vector) of 2-dim array
                Arrays.fill(vector,
                    current); // fill the vector
            }
            current++; // the next current
        }

        // this code prints all 2-dimensional arrays
        for (int[][] dim2Array : cubic) {
            for (int[] vector : dim2Array) {
                System.out.println(Arrays.toString(vector));
            }
            System.out.println();
        }
    }
}
