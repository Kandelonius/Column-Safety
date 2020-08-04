package decimalcomparator;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("decimalcomparator");
        System.out.println(areEqualByThreeDecimalPlaces(3.1756,
            3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.176,
            3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.0,
            3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.175,
            3.175));
    }

    public static boolean areEqualByThreeDecimalPlaces(
        double numOne,
        double numTwo)
    // if(((String) numOne.length()).equals((String) numTwo.length()))
    // {

    // }
    // (String) numOne.findIndexOf('.');
    // double modNumOne = numOne%1, modNumTwo = numTwo%1;
    // if((int) numOne == (int) numTwo)
    // {
    // 	for(int i = 0; i < )
    // }
    {
        return (int) (numOne * 1000) == (int) (numTwo * 1000);
    }
}