package arrays;

import java.util.Scanner;

public class MultiDArrays {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        expanding(stdIn);
    }
    public static void expanding(Scanner stdIn) {
        int n = stdIn.nextInt();
        // if n < 100
        int[][] expandingNumbers = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                expandingNumbers[i][j] = Math.abs(i * j);
                System.out.print(expandingNumbers[i][j] + " ");
            }
            System.out.println();
        }
        stdIn.close();
    }
    public static void sumOfNeighbors(Scanner stdIn) {
         /*
         declare a matrix of type int and fill it with the input coming in line
         by line ending with the string end.

         */
    }
}
