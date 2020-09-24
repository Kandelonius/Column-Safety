Rules of TDD
1. Test the expected outcome of an example.
2. Don't pre-judge design... let your tests drive it.
3. Write the minimum code required to get your tests to pass after writing a test which fails.
4. Each test should validate one single piece of logic.


Specific to ISBNs
final digit is a base 11 check digit with X representing 10 and allows the ISBN to evenly
result in ISBN % 11 = 0
For example, for an ISBN-10 of 0-306-40615-2:

s = (0 * 10) + (3 * 9) + (0 * 8) + (6 * 7) + (4 * 6) + (0 * 5) + (6 * 4) + (1 * 3) + (5 * 2) + (2 * 1)
s = 0 + 27 + 0 + 42 + 24 + 0 + 24 + 3 + 10 + 2
s = 132 = 12 * 11