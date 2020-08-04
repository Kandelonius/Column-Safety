package vehicleclass;

public class Main
{
    public static void main(String[] args)
    {
        Dimensions dimensions = new Dimensions(20,
            20,
            5);
        Case theCase = new Case("2200",
            "Dell",
            "240",
            dimensions);

        Monitor theMonitor = new Monitor("27inch Beast",
            "Acer",
            27,
            new Resolution(2540,
                1440));

        Motherboard theMotherboard = new Motherboard("MJ-200",
            "Asus",
            4,
            6,
            "v2.44");

        PC thePC = new PC(theCase,
            theMonitor,
            theMotherboard);
        // thePC.getMonitor().drawPixelAt(1500, 1200, "red"); // commented these methods out in the pc class.
        // thePC.getMotherboard().loadProgram("Windows 1.0");
        // thePC.getTheCase().pressPowerButton();
        thePC.powerUp();
    }
}