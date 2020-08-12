package arrays;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        char ch = '\u0031' + '\u0035'; // prints 'f'
        System.out.println(ch);
        int[] myIntArray1 = new int[5];
        int[] myIntArray2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] myIntArray3 = new int[5];
        int[] myIntArray4 = getIntegers(5);
        myIntArray1[3] = 50;
        double[] myDoubleArray = new double[10];
        System.out.println(myIntArray1[3]);
        for(int i = 0; i < myIntArray3.length; i++)
        {
            myIntArray3[i] = i*10;
        }
        printArray(myIntArray3);
        printArray(myIntArray4);
        System.out.println(getAverage(myIntArray4));
    }

    public static void printArray(int[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }

    public static int[] getIntegers(int number)
    {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];
        for(int i = 0; i < values.length; i++)
        {
            values[i] = stdIn.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array)
    {
        int sum = 0;
        for(int i = 0; i < array.length; i++)
        {
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }
}
