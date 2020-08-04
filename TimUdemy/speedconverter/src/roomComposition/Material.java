package roomComposition;

public class Material
{
    private String type;

    private int flexibility;

    public Material(
        String type,
        int flexibility)
    {
        this.type = type;
        this.flexibility = flexibility;
    }

    public String getType()
    {
        return type;
    }

    public int getFlexibility()
    {
        System.out.println("flexibility is " + flexibility);
        return flexibility;
    }
}
