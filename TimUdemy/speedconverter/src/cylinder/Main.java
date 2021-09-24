package cylinder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.75);
        System.out.println("circle.radius = " + circle.getRadius());
        System.out.println("circle.area = " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55,
                7.25);
        System.out.println("cylinder.radius = " + cylinder.getRadius());
        System.out.println("cylinder.height = " + cylinder.getHeight());
        System.out.println("cylinder.area = " + cylinder.getArea());
        System.out.println("cylinder.volume = " + cylinder.getVolume());
        try (Scanner stdin = new Scanner(System.in)) {
            System.out.println("Enter a radius value");
            int radius = stdin.nextInt();

            MyInterface ref;

            ref = () -> 3.1415;

            System.out.println("rea of this circle is " + radius * radius * ref.getPiValue());
        }
    }
}
