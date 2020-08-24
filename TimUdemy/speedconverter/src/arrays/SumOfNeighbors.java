package arrays;
/*
Write a program, which inputs the rectangular matrix from a sequence of lines,
ending with a line, containing the only word "end" (without the quotation marks).

The program should output the matrix of the same size, where each element in the
position (i, j) is equal to the sum of the elements from the first matrix on the
positions (i-1, j)(i+1, j)(i, j-1), (i, j+1). Boundary elements have neighbors on
the opposite side of the matrix. In the case of one row or column, the element itself
may be its neighbor.

Sample Input 1:

9 5 3
0 7 -1
-5 2 9
end

Sample Output 1:

3 21 22
10 6 19
20 16 -1
 */

import java.util.Scanner;

public class SumOfNeighbors {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        // declare a matrix of type int and fill it with the input coming in line
        // by line ending with the string end.
        int rows = -1; // -1 so we can start indexing at 0 when we increment later.
        int columns = 0; // create zero index for columns the second dimension of the array
        //        List<String> matrixIncoming = new ArrayList<>();
        String finalString = ""; // The string we will be adding to and reading from later
        String concatTemp = ""; // the string we will be writing to and adding to final.
        /*
        conditional reading the scanner input from user and canceling the loop if the input
        is the string "end".
        1) concatenate final with whatever the user has given us as input, initially that is nothing.
        2) provide the user with the opportunity to give us input
        3) increment rows so that we have accurate dimensions of our undefined matrix
         */
        while (!"end".equals(concatTemp)) {
            finalString = finalString + concatTemp + " ";
            concatTemp = stdIn.nextLine();
            rows++;
        }
        //        System.out.println(input);
        stdIn.close(); // close scanner so we can use it to read our string
        stdIn = new Scanner(finalString); // use the scanner to process our above created string.
        int count = 0; // initialize count
        /*
        ?? reading in the numbers line by line and incrementing the count.
        This section confuses me. Maybe putting every value on its own line?
         */
        while (stdIn.hasNextInt()) {
            stdIn.nextLine();
            count++;
        }
        // close the scanner again so it can be reopened to read again this time from a
        // modified version of our string??
        stdIn.close();
        // using division to determine how many columns there will be based on having each
        // value previously placed on its own line.
        columns = count / rows;
        int[][] inArray = new int[rows][columns]; // the matrix we're creating with the original input
        stdIn = new Scanner((finalString));
        // filling the matrix with the line by line values from before.
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                inArray[i][j] = stdIn.nextInt();
            }
        }

        int[][] outArray = new int[rows][columns]; // declare our final matrix.
        /*
        fill the final matrix with with all of the information we have generated and
        prepared from our input.
        Declare directions for more readable code
         */
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int left = j - 1;
                int top = i = 1;
                int right = j + 1;
                int bot = i + 1;
                if (i == 0) {
                    top = rows - 1;
                }
                if (i == rows - 1) {
                    bot = 0;
                }
                if (j == 0) {
                    left = columns - 1;
                }
                if (j == columns - 1) {
                    right = 0;
                }
                outArray[i][j] = inArray[i][left] + inArray[i][right] + inArray[top][j] + inArray[bot][j];
            }
        }
        stdIn.close();
        // print each element of the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(outArray[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        // get initial input before the loop assuming a size matrix of at least 1
        //        System.out.println("enter a line of numbers or the word 'end'");
        //        String[] line= stdIn.nextLine().strip().split(" ");
        //        rows = line.length;
        //        String input = "";
        //        while (stdIn.hasNextLine()) {
        //            System.out.println("enter a line of numbers or the word 'end'");
        //            String line = stdIn.nextLine();
        ////            String[] line = stdIn.nextLine()
        ////                .strip()
        ////                .split(" ");
        //            rows = line.length();
        //            input.append("+")
        //                .append(line);
        //            System.out.println(input);
        //        }
        //        input.split("+");
        //        while (true) {
        //            // read in user input then determine if it is int or string.
        //            // if the input is the word end terminate the while loop
        //            if (line[0].equals("end")) {
        //                break;
        //            }
        //            // if the input is a string of numbers, split it by white space,
        //            // then parse each element as an integer and add them to the matrix.
        //            else {
        //                rows++;
        //                for (int i = 0; i < rows; i++) {
        //                    for (int j = 0; j < columns; j++) {
        //                        matrix[i][j] = Integer.parseInt(line[i]);
        //                    }
        //                }
        //                line= stdIn.nextLine().strip().split(" ");
        //                System.out.println(matrix[0][0]);
        //            }
        //        }
    }
}
