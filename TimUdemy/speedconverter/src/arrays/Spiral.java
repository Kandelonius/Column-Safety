package arrays;

/*
output a matrix size N*N that will output a count of its digits starting from the top left
corner and ending in the center.

Sample Input 1:

5
Sample Output 1:

1 2 3 4 5
16 17 18 19 6
15 24 25 20 7
14 23 22 21 8
13 12 11 10 9
 */

import java.util.Scanner;

public class Spiral {
    public static void main(String[] args) {
        // declare my variables and bring in scanner
        Scanner stdIn = new Scanner(System.in);
        int dimensions = stdIn.nextInt();
        int[][] matrix = new int[dimensions][dimensions];
        int count = 1;
        int iMin = 0;
        int jMin = 0;
        int iMax = dimensions - 1;
        int jMax = dimensions - 1;
        /*
        if we are on the first line the numbers will always be ascending from 1
        and on the last line they will always be descending to the end of row 1 + (n - 1)
        maybe try something like if count < n put all of the numbers in the top line,
        if
         */
        while (count < dimensions * dimensions) {
            // move through the top of our current loop and increment to the right
            for (int j = jMin; j < jMax + 1; j++) {
                matrix[iMin][j] = count;
                System.out.println(count);
                count++;
            }
            iMin++;
            // move down the right column and increment downward
            for (int i = iMin; i < iMax + 1; i++) {
                matrix[i][jMax] = count;
//                System.out.println(count);
                count++;
            }
            jMax--;
            // move through the current bottom backwards
            for (int j = jMax; j > jMin + 1; j--) {
                matrix[iMax][j] = count;
//                System.out.println(count);
                count++;
            }
            iMax--;
            for (int i = iMax; i > iMin + 1; i--) {
                matrix[i][jMin] = count;
//                System.out.println(count);
                count++;
            }
            jMin++;
        }
        for (int i = 0; i < dimensions - 1; i++) {
            for (int j = 0; j < dimensions - 1; j++) {
                System.out.println(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
