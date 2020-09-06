package arrays;

/*
given a square of size n*n where n < 10 check to see if it is symmetric across the
diagonal axis.

Sample Input 1:

3
0 1 2
1 2 3
2 3 4
Sample Output 1:

YES
 */

import java.util.Scanner;

public class SymmetricMatrix {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        stdIn.nextLine();
        // for loop to take in the lines of the matrix.
        int[][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                matrix[i][j] = stdIn.nextInt();
//                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        boolean matching = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    matching = false;
                }
            }
        }
        if (matching) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
