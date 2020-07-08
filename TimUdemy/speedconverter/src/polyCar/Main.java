package polyCar;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("vroom vroom");
        for(int i = 1; i <= 10; i++)
        {
            Car car = RandomCar();
            System.out.println("Car # "+i+
                " : "+car.getName()+"\nLet's start the engine : "
                +car.startEngine()+"\nNow let's see how it accelerates when it does : "
                +car.accelerate((int) (Math.random() * 9) + 1)+
                "\nNow we should see how it handles braking : "+car.brake()+"\n");
        }
    }

    public static Car RandomCar()
    {
        int randomCar = (int) (Math.random() * 4) +1;
        System.out.println("Random number generated was: "+randomCar);
        switch (randomCar)
        {
            case 1:
                return new Mustang();
            case 2:
                return new AudiTTS();
            case 3:
                return new FordPinto();
            case 4:
                return new Generic();
        }
        return null;
    }
}
