package algorithms;

public class RecursiveAlgos {
    public static void main(String[] args) {

        System.out.println("factorial 0 is " + recursiveFactorial(0));
        System.out.println("factorial 5 is " + recursiveFactorial(5));

    }
        /*
            1! -0 != 1 - 1
            2! = 2 * 1 = 2 * 1!
            3! = 3 * 2 * 1 = 3 * 2!
            4! = 4 * 3 * 2 * 1 = 4 * 3!

            n! = n *(n - 1)!
         */

    public static int recursiveFactorial(int num) {
        if (num == 0) {
            return 1;
        }
        return num * recursiveFactorial(num - 1);
    }

    public static int iterativeFactorial(int num) {
        if (num == 0) {
            return 1;
        }

        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= 1;
        }

        return factorial;

    }

}
