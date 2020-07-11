package billsburgers;

public class Burger
{
    private String bun;
    private boolean meatless;
    private String meat;
    private String additional1;
    private String additional2;
    private String additional3;
    private String additional4;


    public Burger(
        String bun,
        boolean meatless,
        String meat,
        String additional1,
        String additional2,
        String additional3,
        String additional4)
    {
        this.bun = bun;
        this.meatless = meatless;
        this.meat = meat;
        this.additional1 = additional1;
        this.additional2 = additional2;
        this.additional3 = additional3;
        this.additional4 = additional4;

    }
}
