package arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MultiDArrays {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        //        expanding(stdIn);
        sumOfNeighbors(stdIn);
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
        // declare a matrix of type int and fill it with the input coming in line
        // by line ending with the string end.
        int rows = 0;
        int columns = 0;
        int[][] matrix = new int[rows][columns];
        List<String> matrixIncoming = new ArrayList<>();
        while (true) {
            if (stdIn.nextLine().equals("end")) {
                break;
            } else {
                matrixIncoming.add(stdIn.nextLine());
            }
            System.out.println(matrixIncoming);
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
//    public static int[][] fillMatrix(Scanner stdIn, int[][] matrix, int n) {
//        return null;
//    }
//}
