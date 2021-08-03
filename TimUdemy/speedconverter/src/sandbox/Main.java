package sandbox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {
//        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
//        BufferedReader in = new BufferedReader(reader);
//        String line;
//        int input;
//        while ((line = in.readLine()) != null) {
////            input = square(Integer.parseInt(line));
//            input = CoinCount(Integer.parseInt(line));
//            line = String.valueOf(input);
//            System.out.println(line);
//        }
        Main obj = new Main(n);
        String s = "homie";
        System.out.println(s.charAt(0));


    }
    static int a = 10;
    static int n;
    int b = 5;
    int c;
    public Main(int m) {
        System.out.println(a + ", " + b + ", " + c + ", " + n + ", " + m);
    }
    {
        b = 30;
        n = 20;
    }
    static {
        a = 60;
    }
    public static int square(int num) {
        return num * num;
    }
    public static int CoinCount(int num) {
        int count = 0;
        int total = 0;
        while(total < num) {
            total = Coins(total, num);
            count++;
        }
        return count;
    }
    public static int Coins(int num, int target) {
        if((num + 5) <= target) {
            return (num + 5);
        } else if((num + 3) <= target) {
            return (num + 3);
        }else {
            return num + 1;
        }
    }



}
