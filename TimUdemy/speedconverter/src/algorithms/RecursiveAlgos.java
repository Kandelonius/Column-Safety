package algorithms;

public class RecursiveAlgos {
    public static void main(String[] args) {

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
