package pointclass;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("hello point");
        Point first = new Point(6,5);
        Point second = new Point(3,1);
        System.out.println("distance(0,0) = "+first.distance());
        System.out.println("distance(second) = "+first.distance(second));
        System.out.println("distance(2,2) = "+first.distance(2,2));
        Point point = new Point();
        System.out.println("dintance() = "+point.distance());
    }
}
