package branchingstatements;
/*
Will be increasing the height of the bus to N centimeters.
going under several bridges, check that N < the height of the shortest bridge.
Sample Input 1:

234 8
465 453 981 463 1235 871 475 981
Sample Output 1:

Will not crash
Sample Input 2:

211 5
871 205 123 871 1681
Sample Output 2:

Will crash on bridge 2
 */

import java.util.Scanner;

public class BusTour {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        // first line of input is the height of the bus N and the number of bridges
        String[] dimensions = stdIn.nextLine()
            .split(" ");
        int height = Integer.parseInt(dimensions[0]);
        int bridges = Integer.parseInt(dimensions[1]);
        String[] bridgeHeights = stdIn.nextLine()
            .split(" ");
        for (int i = 0; i < bridges; i++) {
            if (height >= Integer.parseInt(bridgeHeights[i])) {
                System.out.println("Will crash on bridge " + (i + 1));
                break;
            } else if (i + 1 == bridges) {
                System.out.println("Will not crash");
            }
        }
    }
}
