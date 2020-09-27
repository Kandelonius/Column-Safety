Rules of TDD (red, green, refactor)
1. Test the expected outcome of an example.
2. Don't pre-judge design... let your tests drive it.
3. Write the minimum code required to get your tests to pass after writing a test which fails.
4. Each test should validate one single piece of logic.

https://en.wikipedia.org/wiki/International_Standard_Book_Number

Specific to ISBNs
--- 10 digit isbn
final digit is a base 11 check digit with X representing 10 and allows the ISBN to evenly
result in ISBN % 11 = 0
For example, for an ISBN-10 of 0-306-40615-2:

s = (0 * 10) + (3 * 9) + (0 * 8) + (6 * 7) + (4 * 6) + (0 * 5) + (6 * 4) + (1 * 3) + (5 * 2) + (2 * 1)
s = 0 + 27 + 0 + 42 + 24 + 0 + 24 + 3 + 10 + 2
s = 132 = 12 * 11

--- 13 digit isbn
 The ISBN-13 check digit, which is the last digit of the ISBN, must range from 0 to 9 and 
 must be such that the sum of all the thirteen digits, each multiplied by its (integer) 
 weight, alternating between 1 and 3, is a multiple of 10.
 the ISBN-13 check digit of 978-0-306-40615-? is calculated as follows:
 
s = 9×1 + 7×3 + 8×1 + 0×3 + 3×1 + 0×3 + 6×1 + 4×3 + 0×1 + 6×3 + 1×1 + 5×3
s = 9 + 21 + 8 + 0 + 3 + 6 + 12 + 0 + 18 + 1 + 15
s = 93
93 % 10 = 3 so ? = 7
 
Best practices-

    - test one item of functionality only
    - test business logic, not methods
    - test must be repeatable, and consistent
    - test must be thorough