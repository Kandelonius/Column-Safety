package numberinword;

import java.util.HashMap;

public class RomanToInt {
    public static int romanToInt(String s) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (i == 0) {
                addNum(num,
                    temp,
                    'A');
            } else if (i == s.length() - 1) {

            }
        }
        return num;
    }

    public static int addNum(
        int n,
        char c,
        char m) {
        if (c == 'M') {
            n += 1000;
            System.out.println(n);
        }
        return n;
    }

    public static void main(String[] args) {
        /*
            range (1 - 3999) or (I - MMM CM XC IX)
            if s.length > 3 s[0] parseInt amount of Ms
            remove s[0]
        */
        int num = romanToInt("MCMXCIV");
    }

}
