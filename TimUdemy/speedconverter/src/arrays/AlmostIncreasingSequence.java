package arrays;

public class AlmostIncreasingSequence {
    public static void main(String[] args) {
        int[] arr = {10, 1, 2, 3, 4, 5};
        boolean check = almostIncreasingSequence(arr);
        System.out.println(check);
    }

    public static boolean almostIncreasingSequence(int[] sequence) {
    /*
    two pointer approach. compare first number to second number.
    if second number is larger increase both then continue in this
    way until the end. If there are more than one false numbers
    return false.
    */
        int leftNumber = 0;
        int rightNumber = 1;
        int count = 0;
        int gap = 0;
        while (leftNumber < sequence.length - 1 && rightNumber < sequence.length) {

            // if left is less than right all is well and we increment both by one.
            if (sequence[leftNumber] < sequence[rightNumber]) {
                System.out.println("Gcount is " + count + " left is " + leftNumber + " right is " + rightNumber);
//                leftNumber += 1;
                rightNumber += 1;
                leftNumber = rightNumber - 1;
            } // if the right number is the same as or less than left increment count and right.
            else if (sequence[leftNumber] >= sequence[rightNumber]) {
                count += 1;
                gap += 1;
//                leftNumber += 1;
                rightNumber += 1;
                System.out.println("Bcount is " + count + " left is " + leftNumber + " right is " + rightNumber);
            }
            // return false if we have seen more than one false comparison
            if (count > 1) {
                return false;
            }
        }
        // if we get here we have seen all numbers and not violated our condition more than once
        return true;
    }
}
