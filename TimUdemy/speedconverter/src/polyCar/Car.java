package polyCar;

public class Car
{
    private String name;
    private int cyliners;
    private boolean hasBoost;
    private int wheels;
    private String engine;

    public Car(
        String name,
        int cyliners,
        boolean hasBoost,
        int wheels,
        String engine)
    {
        this.name = name;
        this.cyliners = cyliners;
        this.hasBoost = hasBoost;
        this.wheels = wheels;
        this.engine = engine;
    }
}
