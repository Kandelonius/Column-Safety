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
        TimCar car = new TimCar(8, "Base Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRW 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Ford ford = new Ford(6, "Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Holden holden = new Holden(6, "Ford Falcon");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());
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

    static class Holden extends TimCar
    {
        public Holden(
            int cylinders,
            String name)
        {
            super(cylinders,
                name);
        }

        @Override
        public String startEngine()
        {
            return getClass().getSimpleName()+" -> startEngine(fancy)"; // another way of getting the class name
        }

        @Override
        public String accelerate()
        {
            return "Holden -> accelerate()";
        }

        @Override
        public String brake()
        {
            return "Holden -> brake()";
        }
    }

    static class Ford extends TimCar
    {
        public Ford(
            int cylinders,
            String name)
        {
            super(cylinders,
                name);
        }

        @Override
        public String startEngine()
        {
            return "Ford -> startEngine()";
        }

        @Override
        public String accelerate()
        {
            return "Ford -> accelerate()";
        }

        @Override
        public String brake()
        {
            return "Ford -> brake()";
        }
    }
}
