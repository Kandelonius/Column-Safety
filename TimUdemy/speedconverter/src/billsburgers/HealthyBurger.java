package billsburgers;

public class HealthyBurger extends Burger
{
    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    private String healthyItem1Name;

    private double addHealthyPrice1;

    private String healthyItem2Name;

    private double addHealthyPrice2;

    public HealthyBurger(
        String meat,
        double price)
    {
        super("Healthy",
            meat,
            price,
            "Brown rye");
    }

    public void addHealthyItem1(
        String name,
        double price)
    {
        this.healthyItem1Name = name;
        this.addHealthyPrice1 = price;
    }

    public void addHealthyItem2(
        String name,
        double price)
    {
        this.healthyItem2Name = name;
        this.addHealthyPrice2 = price;
    }

    @Override
    public double totalPrice()
    {
        double healthyPrice = super.totalPrice();
        if (this.healthyItem1Name != null)
        {
            healthyPrice += this.addHealthyPrice1;
            System.out.println("Added " + this.healthyItem1Name + " for an extra " + this.addHealthyPrice1);
        }
        if (this.healthyItem2Name != null)
        {
            healthyPrice += this.addHealthyPrice2;
            System.out.println("Added " + this.healthyItem2Name + " for an extra " + this.addHealthyPrice2);
        }
        System.out.println("burger price is "+healthyPrice);
        return healthyPrice;
    }
}
