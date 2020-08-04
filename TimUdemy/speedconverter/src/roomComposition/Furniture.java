package roomComposition;

public class Furniture
{
    private int length;

    private int width;

    private Material material;

    private boolean isSurface;

    public Furniture(
        int length,
        int width,
        Material material,
        boolean isSurface)
    {
        this.length = length;
        this.width = width;
        this.material = material;
        this.isSurface = isSurface;
    }

}
