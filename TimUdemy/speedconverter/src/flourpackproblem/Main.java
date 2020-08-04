package flourpackproblem;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println(canPack(1,
            0,
            4));
        System.out.println(canPack(1,
            0,
            5));
        System.out.println(canPack(0,
            5,
            4));
        System.out.println(canPack(2,
            2,
            1));
        System.out.println(canPack(-3,
            2,
            12));
    }

    // bigCount is 5kg, smallCount is 1kg
    public static boolean canPack(
        int bigCount,
        int smallCount,
        int goal)
    {
        if (bigCount < 0 || smallCount < 0 || goal < 0)
        {
            return false;
        }
        if (bigCount > 0)
        {
            while (goal >= 5 && bigCount >= 1)
            {
                goal -= 5;
                bigCount -= 1;
            }
            // System.out.println(goal+" bc "+bigCount);
        }
        if (smallCount >= goal)
        {
            goal -= smallCount;
            // System.out.println("calculation "+ (4 % 5));
            // System.out.println(goal+" sc "+smallCount);
        }
        return goal <= 0;
    }
}