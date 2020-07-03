package pointclass;

public class Point
{
    private int x;
    private int y;

    public Point()
    {
    }

    public Point(
        int x,
        int y)
    {
        this.x = x;
        this.y = y;
    }

    public double distance()
    {
        return Math.sqrt((0 - (double)x)*(0 - (double)x) + (0 - (double)y)*(0 - (double)y));
    }

    public double distance(int x, int y)
    {
        return Math.sqrt((this.x - (double)x)*(this.x - (double)x) + (this.y - (double)y)*(this.y - (double)y));
    }

    public double distance(Point point)
    {
        return Math.sqrt((point.x - (double)x)*(point.x - (double)x) + (point.y - (double)y)*(point.y - (double)y));
    }

    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public int getY()
    {
        return y;
    }

    public void setY(int y)
    {
        this.y = y;
    }
}
