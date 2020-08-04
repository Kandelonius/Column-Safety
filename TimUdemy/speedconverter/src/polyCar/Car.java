package polyCar;

public class Car
{
    private String name;

    private int cyliners;

    private boolean hasBoost;

    private int wheels;

    private boolean engine;

    public Car(
        String name,
        int cyliners,
        boolean hasBoost
        //        int wheels,
        //        boolean engine
    )
    {
        this.name = name;
        this.cyliners = cyliners;
        this.hasBoost = hasBoost;
        this.wheels = 4;
        this.engine = true;
    }

    public String getName()
    {
        return name;
    }

    public String startEngine()
    {
        return "The engine has engaged";
    }

    public String accelerate(int rpm)
    {
        if (hasBoost && rpm > 3)
        {
            return "eccelerating super fast";
        } else
        {
            return "vroom vroom normal acceleration";
        }
    }

    public String brake()
    {
        return "braking is an important par of driving";
    }
}

class Mustang extends Car
{
    public Mustang()
    {
        super("Fast and Red",
            8,
            false);
    }

    @Override
    public String startEngine()
    {
        return "Listen to her purr";
    }

    @Override
    public String accelerate(int rpm)
    {
        return "eccelerating super fast";
    }

    @Override
    public String brake()
    {
        return "trying to keep my brake petal looking new so I never use it";
    }
}

class AudiTTS extends Car
{
    public AudiTTS()
    {
        super("Audi Sight",
            4,
            true);
    }

    @Override
    public String startEngine()
    {
        return "bit of a hum sounds nice";
    }

    @Override
    public String accelerate(int rpm)
    {
        if (rpm > 3)
        {
            return "eccelerating super fast";
        } else
        {
            return "vroom vroom normal acceleration";
        }
    }

    @Override
    public String brake()
    {
        return "nice and responsive brakes";
    }
}

class FordPinto extends Car
{
    public FordPinto()
    {
        super("Pinto Bean",
            6,
            false);
    }

    @Override
    public String startEngine()
    {
        int chances = (int) Math.random() * 10;
        if (chances < 7)
        {
            return "not starting today my friend";
        } else
        {
            return "no bus for me today";
        }
    }

    @Override
    public String accelerate(int rpm)
    {
        return "Is that smoke or steam coming from the hood?";
    }

    @Override
    public String brake()
    {
        return "Oh please no, I don't want the car to die at this stop light";
    }
}

class Generic extends Car
{
    public Generic()
    {
        super("Probably a Toyota",
            (int) Math.random() * 6,
            false);
    }
}