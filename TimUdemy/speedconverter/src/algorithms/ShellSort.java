package algorithms;

/**
 * Evolved from insertion sort. Shell sort chooses which element to insert using
 * a gap that is typically based on the size of the set being sorted whereas
 * insertion sort only uses a gap value of 1. The shell sort shrinks its gap value
 * with each iteration until it is finally 1.
 * One very common way to calculate the gap value is called Knuth Sequence where
 * the gap value is calculated using (3^k - 1) / 2
 */

public class ShellSort {
}
