package billsburgers;

public class Main
{
    public static void main(String[] args)
    {
        //      Burger(String name, String meat, double price, String bun)
        Burger burger = new Burger("basic",
            "beef",
            12.00,
            "sourdough");
        double price = burger.totalPrice();
        burger.addAdditionalItem1("bacon",
            1.00);
        burger.addAdditionalItem2("avocado",
            0.75);
        burger.addAdditionalItem3("cheese",
            0.50);
        price = burger.totalPrice();
        HealthyBurger healthyBurger = new HealthyBurger("chicken",
            13.50);
        healthyBurger.addHealthyItem1("tomato",
            0.35);
        healthyBurger.addHealthyItem2("egg",
            1.00);
        price = healthyBurger.totalPrice();
    }
}
