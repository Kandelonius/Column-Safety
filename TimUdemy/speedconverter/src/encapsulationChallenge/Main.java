package encapsulationChallenge;

public class Main
{
    public static void main(String[] args)
    {
        Printer printerD = new Printer(45, 20, true);
        Printer printerN = new Printer(80, 20, false);
        printerD.fillToner(50);
        printerD.printPages(12);
        printerD.printPages(11);
        printerN.fillToner((25));
        printerN.printPages(12);
        printerN.printPages(11);
    }
}
