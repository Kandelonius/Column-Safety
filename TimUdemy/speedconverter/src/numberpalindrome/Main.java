package numberpalindrome;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(12321));
        System.out.println(isPalindrome(11));
        System.out.println(isPalindrome(12231));
        System.out.println(isPalindrome(10));
        System.out.println(isPalindrome(101));
    }

    public static boolean isPalindrome(int number)
    {
        int rebmun = 0, tempNum = number;
        while (tempNum >= 10)
        {
            rebmun += tempNum % 10;
            rebmun *= 10;
            tempNum /= 10;
        }
        System.out.println("outside rebmun " + rebmun + " tempNum " + tempNum);
        rebmun += tempNum;
        while (number > 0)
        {
            if (number % 10 == rebmun % 10)
            {
                number /= 10;
                rebmun /= 10;
                continue;
            } else
            {
                return false;
            }
        }
        return true;
    }

    public static boolean hasSharedDigit(
        int numOne,
        int numTwo)
    {
        if (numOne < 10 || numOne > 99 || numTwo < 10 || numTwo > 99)
        {
            return false;
        }
        return numOne % 10 == numTwo % 10 || numOne / 10 == numTwo % 10 || numOne % 10 == numTwo / 10 || numOne / 10 == numTwo / 10;
    }

    public static boolean hasSameLastDigit(
        int numOne,
        int numTwo,
        int numThree)
    {
        if (isValid(numOne) && isValid(numTwo) && isValid(numThree))
        {
            return numOne % 10 == numTwo % 10 || numOne % 10 == numThree % 10 || numTwo % 10 == numThree % 10;
        }
        return false;
    }

    public static boolean isValid(int num)
    {
        return num > 9 && num <= 1000;
    }
}