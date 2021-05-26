package algorithms;

/*
    Makes assumptions about the data, namely that all fo the elements have the same *radix and width.
    Must use a stable sort algorithm at each stage of the sort. Starts at the right of the element and
    moves left each step because the rightmost element is often the least impactful digit. Can be O(n),
    but is often slower than O(nlogn)

    *Radix is the amount of possible outcomes or unique digits a unit can have ie a binary has 2 possible
    states '0' or '1' so its radix is 2 whereas the english alphabet has 26 unique letters so its radix
    is 26. Keep in mind the radix for a decimal number is 10 not infinity. Width in this instance refers
    to the amount of digits or characters in the elements. 'cool' and '6174' both have a width of 4 but since
    the radix of each is not the same these cannot be used in the same radix sort.
 */

public class RadixSort {
    public static void sort(int[] arr) {

    }
}
