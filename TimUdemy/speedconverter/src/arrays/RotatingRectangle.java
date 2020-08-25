package arrays;

/*
Given a rectangle array n×m in size. Rotate it by 90 degrees clockwise,
by recording the result into the new array m×n in size.

Input data format

Input the two numbers n and m, not exceeding 100, and then an array n×m in size.

Output data format

Output the resulting array. Separate numbers by a single space in the output.

Sample Input 1:

3 4
11 12 13 14
21 22 23 24
31 32 33 34
Sample Output 1:

31 21 11
32 22 12
33 23 13
34 24 14
 */

import java.util.Scanner;

public class RotatingRectangle {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        // take in the dimensions of the original matrix as well as the matrix itself
        int count = 0;
        int rows = 0;
        int columns = 0;
        // load the information into a string like in SumOfNeighbors so we can process it.
        // no need to increment row however because that will be given as the first int.
        String[] dimensions = stdIn.nextLine()
            .split(" ");
        String finalString = "";
        String concatTemp = "";
        rows = Integer.parseInt(dimensions[0]); // putting the first arguments from user into variables
        columns = Integer.parseInt(dimensions[1]);
        while (count < rows) {
            concatTemp = stdIn.nextLine();
            finalString = finalString + concatTemp + " ";
            count++;
        }
        //        finalString = finalString + concatTemp; // fencepost problem
        stdIn.close(); // close scanner so we can use it for processing.
        System.out.println(finalString);
        count = 0;
        // at this point we have the first line giving the dimensions loaded into their variables,
        // the information for the matrix is in a single concatenated string called finalString.
        // now we will separate all of the items into their own lines.
        stdIn = new Scanner(finalString);
        while (stdIn.hasNextLine()) {
            stdIn.nextLine();
            count++;
        }
        stdIn.close();
        stdIn = new Scanner(finalString);
        int[][] inArray = new int[rows][columns]; // declare in case it helps to fill the original matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                inArray[i][j] = stdIn.nextInt();
            }
        }
        int[][] outArray = new int[columns][rows];
        /*
        try (i = rows - j) and (j = i)
         */
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                int newI = rows - j - 1;
                int newJ = columns - i - 1;
                outArray[i][j] = inArray[newI][i];
            }
        }
        // print for debugging
        for (int i = 0; i < columns; i++) { // print the new matrix with the new parameters
            for (int j = 0; j < rows; j++) {
                System.out.print(outArray[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

/*
***** solution code *****
* import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[scanner.nextInt()][scanner.nextInt()];
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < matrix[0].length; ++i) {
            for (int j = 0; j < matrix.length; ++j) {
                System.out.print(matrix[matrix.length - j - 1][i] + " ");
            }
            System.out.println();
        }
    }
}
 */