package playerDemo;

public class Main
{
    public static void main(String[] args)
    {
        Player player = new Player();
        player.name = "Tim";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        damage = 11;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer ePlayer = new EnhancedPlayer("Jago",
            200,
            "Sword");
        System.out.println("Initial health is " + ePlayer.getHealth());

        EnhancedPlayer ePlayer2 = new EnhancedPlayer("Largo",
            50,
            "Sword");
        System.out.println("Initial health is " + ePlayer2.getHealth());
    }

}
