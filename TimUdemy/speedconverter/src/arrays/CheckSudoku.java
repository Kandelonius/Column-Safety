package arrays;

/*
N-size Sudoku is a game with a square table of N2 width and height divided into N2 smaller
squares of N width and height. In a solved state, each of these smaller squares, as well
as each row and column of a full square, contains all numbers from 1 to N2 without repetition.

Given a number N on the first line and a full sudoku table on the next N2 lines. Every line
contains N integers.

Your task is to determine whether this sudoku is solved or not. Output "YES" if this sudoku
table is solved, otherwise "NO".

N can be from 1 to 10.

Sample Input 1:

3
5 8 9 6 7 4 2 1 3
7 4 3 1 8 2 9 5 6
1 2 6 9 5 3 8 7 4
9 3 5 4 2 1 7 6 8
4 1 2 8 6 7 3 9 5
6 7 8 3 9 5 1 4 2
8 6 4 2 1 9 5 3 7
3 9 7 5 4 8 6 2 1
2 5 1 7 3 6 4 8 9
Sample Output 1:

YES

2
1 2 3 4
4 3 2 1
2 1 4 3
3 4 1 2
YES
 */

import java.util.Arrays;
import java.util.Scanner;

public class CheckSudoku {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        // get the dimensions of the sudoku board.
        int n = stdIn.nextInt();
        int N = n * n;
        stdIn.nextLine();
        // create the matrix using n^2 as the parameter
        int[][] matrix = new int[N][N];
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                matrix[i][j] = stdIn.nextInt();
            }
        }
        /*
        perhaps do something along the lines of check each line using a nested for loop
        swapping i and j in the matrix to check each column and taking sqrt of n to find
        the individual squares within the overall square. check 1 - n with no duplicates.
         */
        for (int i = 0; i < N; i++) {
            if (N == 1 && matrix[0][0] == 1) { // check for size 1 matrix with int 1
                System.out.println("YES");
                break;
            } else if (N == 1) {
                System.out.printf("NO");
                break;
            }
            int[] row = new int[N];
            int[] column = matrix[i].clone();
            int[] square = new int[N];
            for (int j = 0; j < N; j++) {
                row[j] = matrix[j][i];
                square[j] = matrix[(i / n) * n + j / n][i * n % N + j % n];
            }
            if (check(column) && check(row) && check(square)) {
                System.out.println("YES");
                break;
            } else {
                System.out.println("NO");
                break;
            }
        }
    }

    private static boolean check(int[] vector) {
        int i = 0;
        Arrays.sort(vector); // sort vector 0 - N
        //for each element of the vector compare it with an in order count from 1.
        for (int num : vector) {
            if (num != ++i) {
                return false;
            }
        }
        return true;
    }
}
