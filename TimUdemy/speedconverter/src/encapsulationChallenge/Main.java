package encapsulationChallenge;

public class Main
{
    public static void main(String[] args)
    {
        Printer printerD = new Printer(45, true);
        Printer printerN = new Printer(80, false);
        printerD.fillToner(50);
        printerD.printPages(12);
        printerD.printPages(11);
        printerN.fillToner((25));
        printerN.printPages(12);
        printerN.printPages(11);
        printerD.fillToner(51);
        System.out.println("pages printed for printer D is "+printerD.getNumberOfPages());
        System.out.println("pages printed for printer N is "+printerN.getNumberOfPages());
    }
}
