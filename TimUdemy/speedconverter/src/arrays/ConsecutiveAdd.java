package arrays;

import java.util.Arrays;

public class ConsecutiveAdd {
    public static void main(String[] args) {
        int[] statues = {6, 2, 3, 8};
        int[] statues2 = {6, 3};
        int[] statues3 = {0, 3};
        makeArrayConsecutive2(statues);
        makeArrayConsecutive2(statues2);
        makeArrayConsecutive2(statues3);
    }

    public static int makeArrayConsecutive2(int[] statues) {
        Arrays.sort(statues);
        int compare = 0;
        int sum = 0;
        if (statues[0] > 0) {
            sum = -(statues[0] - 1);
        } else {
            sum = 0;
        }
        // on the first iteration set compare to i, after that add new i - compare and set compare to i.
        for (int i = 0; i < statues.length; i++) {
            if (sum == 0 && i == 0) {
                compare = statues[i];
            } else {
                sum += statues[i] - compare - 1;
                compare = statues[i];
            }
        }
        System.out.println(sum);
        return sum;
    }
}
