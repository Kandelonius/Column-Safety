package billsburgers;

public class Burger
{
    private String name;
    private String bun;
//    private boolean meatless;
    private String meat;
    private double price;
    
    private String additional1;
    private double addPrice1;

    private String additional2;
    private double addPrice2;

    private String additional3;
    private double addPrice3;

    private String additional4;
    private double addPrice4;

    public Burger(
        String name,
        String bun,
        String meat,
        double price)
    {
        this.name = name;
        this.bun = bun;
        this.meat = meat;
        this.price = price;
    }

    private void addAdditionalItem1(String name, double price)
    {
        this.additional1 = name;
        this.addPrice1 = price;
    }

    private void addAdditionalItem2(String name, double price)
    {
        this.additional2 = name;
        this.addPrice2 = price;
    }

    private void addAdditionalItem3(String name, double price)
    {
        this.additional3 = name;
        this.addPrice3 = price;
    }

    private void addAdditionalItem4(String name, double price)
    {
        this.additional4 = name;
        this.addPrice4 = price;
    }

    public double totalPrice()
    {
        double hambergerPrice = this.price;
        System.out.println(this.name+" hamburger "+" on a "+this.bun+" bun"
        +" price is "+this.price);
    }
}
