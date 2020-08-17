package arrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char ch = '\u0031' + '\u0035'; // prints 'f'
        System.out.println(ch);
        int[] myIntArray1 = new int[5];
        int[] myIntArray2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] myIntArray3 = new int[5];
        //        int[] myIntArray4 = getIntegers(5);
        myIntArray1[3] = 50;
        double[] myDoubleArray = new double[10];
        System.out.println(myIntArray1[3]);
        for (int i = 0; i < myIntArray3.length; i++) {
            myIntArray3[i] = i * 10;
        }
        //        printArray(myIntArray3);
        //        printArray(myIntArray4);
        //        System.out.println(getAverage(myIntArray4));
        //        sumgreaterthanN();
        //        firstMaxInt();
        boxes();
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }

    public static int[] getIntegers(int number) {
        Scanner stdIn = new Scanner(System.in);
        //        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];
        for (int i = 0; i < values.length; i++) {
            values[i] = stdIn.nextInt();
        }
        //        stdIn.close();
        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }

    public static void sumgreaterthanN() {
        Scanner stdIn = new Scanner(System.in);
        int total = 0;
        // take the size of the array
        int size = stdIn.nextInt();
        stdIn.nextLine();
        // take array values
        int[] nums = new int[size];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = stdIn.nextInt();
        }
        stdIn.nextLine();
        // add up the numbers greater than a given number
        int base = stdIn.nextInt();
        for (int n : nums) {
            if (n > base) {
                total += n;
            }
        }
        stdIn.close();
        System.out.println(total);
    }

    public static void firstMaxInt() {
        Scanner stdIn = new Scanner(System.in);
        int currentMax = 0;
        int maxIndex = 0;
        // the size of the array
        int size = stdIn.nextInt();
        stdIn.nextLine();
        // take in the array
        int[] ints = new int[size];
        for (int i = 0; i < size; i++) {
            ints[i] = stdIn.nextInt();
            if (i == 0) {
                currentMax = ints[i];
            } else if (ints[i] > currentMax) {
                currentMax = ints[i];
                maxIndex = i;
            }
        }
        stdIn.close();
        System.out.println(maxIndex);
    }

    public static void boxes() {
        // test 9 is 977 301 378, 635 394 435
        // boxes will be of dimensions X, Y, Z all > 0
        // if the boxes are of equal size output "Box 1 = Box 2"
        // if the first box > second box output "Box 1 < Box 2"
        // if the second box is bigger output "Box 1 > Box 2"
        // otherwise output "Incomparable"
        Scanner stdIn = new Scanner(System.in);
        int h1 = stdIn.nextInt();
        int l1 = stdIn.nextInt();
        int d1 = stdIn.nextInt();
        stdIn.nextLine();
        int h2 = stdIn.nextInt();
        int l2 = stdIn.nextInt();
        int d2 = stdIn.nextInt();
        int[] box1 = {h1, l1, d1};
        int[] box2 = {h2, l2, d2};
        int boxOneVolume = (h1 * l1 * d1);
        int boxTwoVolume = (h2 * l2 * d2);
        String x = "box one is " + boxOneVolume +
            " and box two is " + boxTwoVolume;
        if (boxOneVolume == boxTwoVolume) {
            System.out.println(x);
            System.out.println(checkSides(box1,
                box2,
                'e'));
        } else if (boxOneVolume > boxTwoVolume) {
            System.out.println(x);
            System.out.println(checkSides(box1,
                box2,
                'o'));
        } else {
            System.out.println(x);
            System.out.println(checkSides(box1,
                box2,
                't'));
        }
    }

    public static String checkSides(
        int[] box1,
        int[] box2,
        char compare) {
        if (getMax(box1) == getMax(box2) && compare == 'e') {
            System.out.println(compare);
            return "Box 1 = Box 2";
        } else if (getMax(box1) >= getMax(box2) && compare == 'o') {
            System.out.println(compare);
            return "Box 1 > Box 2";
        } else if (getMax(box1) <= getMax(box2) && compare == 't') {
            System.out.println(compare);
            return "Box 1 < Box 2";
        } else {
            System.out.println(compare);
            return "Incomparable";
        }
    }

    public static boolean compareSides(int[] box1, int[] box2) {
        return false; // wip
    }

    public static int getMax(int[] array) {
        int max = 0;
        int size = array.length;
        for (int i = 0; i < size; i++) {
            if (i == 0) {
                max = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
