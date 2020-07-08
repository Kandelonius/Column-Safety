package polyCar;

public class TimCar
{
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public TimCar(
        int cylinders,
        String name)
    {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders()
    {
        return cylinders;
    }

    public String getName()
    {
        return name;
    }

    public String startEngine()
    {
        return "Car -> startEngine()";
    }

    public String accelerate()
    {
        return "Car -> accelerate()";
    }

    public String brake()
    {
        return "Car -> brake()";
    }
}

class Mitsubishi extends TimCar
{
    public Mitsubishi(
        int cylinders,
        String name)
    {
        super(cylinders,
            name);
    }

    @Override
    public String startEngine()
    {
        return "Mitsubishi -> startEngine()";
    }

    @Override
    public String accelerate()
    {
        return "Mitsubishi -> accelerate()";
    }

    @Override
    public String brake()
    {
        return "Mitsubishi -> brake()";
    }
}
