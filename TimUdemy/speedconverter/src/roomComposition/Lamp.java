package roomComposition;

public class Lamp
{
    private boolean lumens;

    public Lamp(boolean lumens)
    {
        this.lumens = lumens;
    }

    public boolean getLumens()
    {
        return lumens;
    }

    public void powerLamp()
    {
        this.lumens = !lumens; // toggle lumens
        System.out.println("Lumens set to "+lumens);
    }
}
