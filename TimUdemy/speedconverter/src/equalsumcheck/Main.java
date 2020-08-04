package equalsumcheck;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("equalsumcheck");
    }

    public static boolean hasEqualSum(
        int numOne,
        int numTwo,
        int numThree)
    {
        return (numOne + numTwo) == numThree;
    }

    public static boolean hasTeen(
        int numOne,
        int numTwo,
        int numThree)
    {
        if (
            isTeen(numOne) || isTeen(numTwo) || isTeen(numThree))
        {
            return true;
        }
        return false;
    }

    public static boolean isTeen(int number)
    {
        if (number > 12 && number < 20)
        {
            return true;
        }
        return false;
    }
}