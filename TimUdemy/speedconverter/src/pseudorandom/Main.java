package pseudorandom;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int lower = scanner.nextInt();
//        int upper = scanner.nextInt();
//        Random random = new Random();

//        int intervalLength = upper - lower + 1;

//        System.out.println(random.nextInt(intervalLength) + lower);
//        System.out.println(random.nextInt(intervalLength) + lower);
//        System.out.println(random.nextInt(intervalLength) + lower);
//        System.out.println(random.nextInt(intervalLength) + lower);

        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        Random random = new Random(a + b); // seed rng
        int intervalLength = b - a + 1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += random.nextInt(intervalLength) + a;
        }
        System.out.println(sum);

//        int n = random.nextInt(3);
        System.out.println(n);
    }
}