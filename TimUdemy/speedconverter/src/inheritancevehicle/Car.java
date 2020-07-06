package inheritancevehicle;

import inheritancevehicle.Vehicle;

public class Car extends Vehicle
{
    private int doors;
    private int engineCapacity;
    private int wheels;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public Car(
        String name,
        int doors,
        int engineCapacity,
        int wheels,
        int gears,
        boolean isManual)
    {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
        this.wheels = wheels;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear)
    {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): Changed to "+this.currentGear+" gear");
    }

    public void changeVelocity(int speed, int direction)
    {
        System.out.println("Car.changeVelocity(): "+speed+" direction "+direction);
    }

    @Override
    public void stop()
    {
        super.stop();
    }
}
