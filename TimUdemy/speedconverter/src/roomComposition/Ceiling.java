package roomComposition;

public class Ceiling
{
    private int height;

    private String painedColor;

    public Ceiling(
        int height,
        String painedColor)
    {
        this.height = height;
        this.painedColor = painedColor;
    }

    public int getHeight()
    {
        return height;
    }

    public String getPainedColor()
    {
        return painedColor;
    }
}
