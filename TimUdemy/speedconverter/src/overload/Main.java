package overload;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println(calculateFeetAndInchesToCentimeters(6,
            0));
        System.out.println(calculateFeetAndInchesToCentimeters(7,
            5));
        System.out.println(calculateFeetAndInchesToCentimeters(47));
        System.out.println(calculateFeetAndInchesToCentimeters(11));
    }

    public static double calculateFeetAndInchesToCentimeters(
        double feet,
        double inches)
    {
        if (feet < 0 || inches < 0 || (inches > 12))
        {
            return -1;
        } else
        {
            double feetCentimeters = feet * 12 * 2.54;
            double inchCentimeters = inches * 2.54;
            return (double) (feetCentimeters + inchCentimeters);
        }
    }

    public static double calculateFeetAndInchesToCentimeters(double inches)
    {
        if (inches < 0)
        {
            return -1;
        }
        if (inches > 12)
        {
            double tempFeet = inches / 12;
            double tempInches = inches % 12;
            calculateFeetAndInchesToCentimeters(tempFeet,
                tempInches);
        }
        return inches * 2.54;
    }
}