package roomComposition;

public class Sofa
{
    private int softness;
    private int comfort;

    public Sofa(
        int softness,
        int comfort)
    {
        this.softness = softness;
        this.comfort = comfort;
    }

    public int getSoftness()
    {
        return softness;
    }

    public int getComfort()
    {
        return comfort;
    }
}
