package vehicleclass;

public class Car extends Vehicle {
    int yearModel;

    String make;

    int speed;

    private int doors;

    private int engineCapacity;

    public Car(
        String name,
        int doors,
        int engineCapacity) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }

    public void accelerate() {
        this.speed += 5;
    }
    public void brake() {
        if (this.speed > 5) {
            this.speed -= 5;
        }else {
            this.speed = 0;
        }
    }

}