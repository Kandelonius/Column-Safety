package numbertowords;

public class Main
{
    public static void main(String[] args)
    {
        numberToWords(100);
        numberToWords(445);
        numberToWords(4405);
        numberToWords(-4405);
        wordsToNumber("Eight");
    }

    public static void numberToWords(int number)
    {
        if (number < 0)
        {
            System.out.println("Invalid Value");
        }
        int rebmun = reverse(number);
        int count = getDigitCount(number);

        for (int i = 0; i < count; i++)
        {
            switch (rebmun % 10)
            {
                case 0:
                    System.out.println("Zero");
                    rebmun /= 10;
                    break;
                case 1:
                    System.out.println("One");
                    rebmun /= 10;
                    break;
                case 2:
                    System.out.println("Two");
                    rebmun /= 10;
                    break;
                case 3:
                    System.out.println("Three");
                    rebmun /= 10;
                    break;
                case 4:
                    System.out.println("Four");
                    rebmun /= 10;
                    break;
                case 5:
                    System.out.println("Five");
                    rebmun /= 10;
                    break;
                case 6:
                    System.out.println("Six");
                    rebmun /= 10;
                    break;
                case 7:
                    System.out.println("Seven");
                    rebmun /= 10;
                    break;
                case 8:
                    System.out.println("Eight");
                    rebmun /= 10;
                    break;
                case 9:
                    System.out.println("Nine");
                    rebmun /= 10;
                    break;
            }
        }
    }

    public static void wordsToNumber(String num)
    {
        switch (num)
        {
            //            case "Zero":
            //                System.out.println(0);
            //                break;
            case "One":
                System.out.println(1);
                break;
            case "Two":
                System.out.println(2);
                break;
            case "Three":
                System.out.println(3);
                break;
            case "Four":
                System.out.println(4);
                break;
            case "Five":
                System.out.println(5);
                break;
            case "Six":
                System.out.println(6);
                break;
            case "Seven":
                System.out.println(7);
                break;
            case "Eight":
                System.out.println(8);
                break;
            case "Nine":
                System.out.println(9);
                break;
            default:
                System.out.println("Not what we were expecting");
        }
    }

    public static int reverse(int number)
    {
        int rebmun = 0;
        if (number >= 0)
        {
            while (number > 0)
            {
                rebmun *= 10;
                rebmun += number % 10;
                number /= 10;
            }
        } else
        {
            number *= -1;
            while (number > 0)
            {
                rebmun *= 10;
                rebmun -= number % 10;
                number /= 10;
            }
        }
        // System.out.println("reverse of "+number+" is "+rebmun);
        return rebmun;
    }

    public static int getDigitCount(int number)
    {
        if (number < 0)
        {
            return -1;
        }
        int count = 0;
        do
        {
            count++;
            number /= 10;
        } while (number > 0);
        // System.out.println("count of "+number+" is "+count);
        return count;
    }
}