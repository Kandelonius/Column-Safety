package billsburgers;

public class Burger
{
    private String name;

    private String meat;

    private double price;

    private String bun;
    //    private boolean meatless;

    private String additional1Name;

    private double addPrice1;

    private String additional2Name;

    private double addPrice2;

    private String additional3Name;

    private double addPrice3;

    private String additional4Name;

    private double addPrice4;

    public Burger(
        String name,
        String meat,
        double price,
        String bun)
    {
        this.name = name;
        this.bun = bun;
        this.meat = meat;
        this.price = price;
    }

    public void addAdditionalItem1(
        String name,
        double price)
    {
        this.additional1Name = name;
        this.addPrice1 = price;
    }

    public void addAdditionalItem2(
        String name,
        double price)
    {
        this.additional2Name = name;
        this.addPrice2 = price;
    }

    public void addAdditionalItem3(
        String name,
        double price)
    {
        this.additional3Name = name;
        this.addPrice3 = price;
    }

    public void addAdditionalItem4(
        String name,
        double price)
    {
        this.additional4Name = name;
        this.addPrice4 = price;
    }

    public double totalPrice()
    {
        double hambergerPrice = this.price;
        System.out.println(this.name + " hamburger " + "on a " + this.bun + " bun"
            + " price is " + this.price);
        if (this.additional1Name != null)
        {
            hambergerPrice += this.addPrice1;
            System.out.println("Added " + this.additional1Name + " for an extra " + this.addPrice1);
        }
        if (this.additional2Name != null)
        {
            hambergerPrice += this.addPrice2;
            System.out.println("Added " + this.additional2Name + " for an extra " + this.addPrice2);
        }
        if (this.additional3Name != null)
        {
            hambergerPrice += this.addPrice3;
            System.out.println("Added " + this.additional3Name + " for an extra " + this.addPrice3);
        }
        if (this.additional4Name != null)
        {
            hambergerPrice += this.addPrice4;
            System.out.println("Added " + this.additional4Name + " for an extra " + this.addPrice4);
        }
        System.out.println("burger price is " + hambergerPrice);
        return hambergerPrice;
    }
}
