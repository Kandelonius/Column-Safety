package roomComposition;

public class EndTable extends Furniture
{
    private Lamp lamp;

    public EndTable(int length,
                    int width,
                    Material material,
                    boolean isSurface, Lamp lamp)
    {
        super(length, width, material, isSurface);
        this.lamp = lamp;
    }

    public Lamp getLamp()
    {
        return lamp;
    }

    public void pressPowerButton()
    {
        System.out.println("Power button pressed");
        lamp.powerLamp();
    }
}
