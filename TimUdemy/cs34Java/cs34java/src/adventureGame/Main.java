package adventureGame;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //        Map<String, Room> areas = new HashMap<>();
        //        Item luckyCat = new Item("lucky_cat",
        //            "outside",
        //            "This one has its left paw raised");
        //        Item candelabra = new Item("candelabra",
        //            "foyer",
        //            "The wax has dried out and it's not useful as a light source.");
        //        Item snowGlobe = new Item("snow_globe",
        //            "foyer",
        //            "There appears to be water and small white flakes, but there are palm trees on a beach as well.");
        //        Item dagger = new Item("dagger",
        //            "overlook",
        //            "It's rather dull.");
        //        Item brokenCompass = new Item("broken_compass",
        //            "overlook",
        //            "You wouldn't really need this in this place anyway.");
        //        Item wirtsLeg = new Item("wirts_leg",
        //            "overlook",
        //            "Hmm, where is that tome of town portal?");
        //        Item cellPhone = new Item("cell_phone",
        //            "narrow",
        //            "No reception, it looks like it wants me to enter a number.");
        //        Item teddyBear = new Item("teddy_bear",
        //            "narrow",
        //            "How do I know that?");
        //        Item incaTreasure = new Item("inca_treasure",
        //            "treasure",
        //            "This looks valuable, I hope I'm not asked to destroy it.");
        //        Item trollex = new Item("trollex",
        //            "treasure",
        //            "a cheap knock-off");
        //
        //        areas.put("outside",
        //            new Room(10,
        //                "Outside Cave Entrance",
        //                "North of you, the cave mount beckons"));

        setupAndPlay();
        newGame();
    }

    public static void setupAndPlay()
    {
        Scanner stdIn = new Scanner(System.in);
        Map<String, Room> areas = new HashMap<>();

        Item luckyCat = new Item("lucky_cat",
            "outside",
            "This one has its left paw raised");

        Item candelabra = new Item("candelabra",
            "foyer",
            "The wax has dried out and it's not useful as a light source.");

        Item snowGlobe = new Item("snow_globe",
            "foyer",
            "There appears to be water and small white flakes, but there are " +
                "palm trees on a beach as well.");

        Item dagger = new Item("dagger",
            "overlook",
            "It's rather dull.");

        Item brokenCompass = new Item("broken_compass",
            "overlook",
            "You wouldn't really need this in this place anyway.");

        Item wirtsLeg = new Item("wirts_leg",
            "overlook",
            "Hmm, where is that tome of town portal?");

        Item cellPhone = new Item("cell_phone",
            "narrow",
            "No reception, it looks like it wants me to enter a number.");

        Item teddyBear = new Item("teddy_bear",
            "narrow",
            "How do I know that?");

        Item incaTreasure = new Item("inca_treasure",
            "treasure",
            "This looks valuable, I hope I'm not asked to destroy it.");

        Item trollex = new Item("trollex",
            "treasure",
            "a cheap knock-off");

        Room outside = new Room(10,
            "Outside Cave Entrance",
            "North of you, the cave mount beckons");
        outside.items.add(luckyCat);

        Room foyer = new Room(11,
            "Foyer",
            "Dim light filters in from the south. Dusty passages run north and east. " +
                "The door outside is now locked.");
        foyer.items.add(candelabra);
        foyer.items.add(snowGlobe);

        Room overlook = new Room(12,
            "Grand Overlook",
            "A steep cliff appears " +
                "before you, falling into the darkness. Ahead to the north, a light flickers in " +
                "the distance, but there is no way across the chasm.");
        overlook.items.add(dagger);
        overlook.items.add(brokenCompass);
        overlook.items.add(wirtsLeg);

        Room narrow = new Room(13,
            "Narrow Passage",
            "The narrow passage bends " +
                "here from west to north. The smell of gold permeates the air.");
        narrow.items.add(cellPhone);
        narrow.items.add(teddyBear);

        Room treasure = new Room(14,
            "Treasure Chamber",
            "You've found the long-lost treasure chamber! Sadly, it has already been " +
                "mostly emptied by earlier adventurers. The only exit is to the south.");
        treasure.items.add(incaTreasure);
        treasure.items.add(trollex);


        Room incinerator = new Room(15,
            "Incinerator Room",
            "This place appears to have ill-purpose. You see a trap-door in the ceiling.");

        outside.setNorth(foyer);
        foyer.setNorth(overlook);
        foyer.setEast(narrow);
        foyer.setSouth(foyer);
        narrow.setNorth(treasure);
        narrow.setWest(foyer);
        treasure.setSouth(narrow);

        Player darkharden = new Player("Darkharden",
            outside);
        Stash backpack = new Stash(false);
        overlook.carryAll[0] = backpack;
        String[] cardinalDirections = {"n", "w", "s", "e"};
        //        cardinalDirections = ;


        while (true)
        {
            String[] action;
            System.out.println(darkharden.room.toString());
            System.out.println("What will you do?");
            action = stdIn.nextLine()
                .strip()
                .toLowerCase()
                .split(" ");

            //            System.out.println(action[0] + " and " + action[1]);

            if (action.length == 1) // check that action only has one item for movement
            {
                for (int i = 0; i < cardinalDirections.length; i++) // loop through array
                {
                    if (action[0].equals(cardinalDirections[i])) // check to see if user input is in array
                    {
                        move(darkharden,
                            action[0]);
                    }
                }
            }
        }
    }

    public static void move(
        Player player,
        String direction)
    {
        switch (direction)
        {
            case "n":
                if (player.getRoom()
                    .getNorth() != null)
                {
                    player.setRoom(player.getRoom()
                        .getNorth());
                }
            case "s":
                if (player.getRoom()
                    .getSouth() != null)
                {
                    player.setRoom(player.getRoom()
                        .getSouth());
                }
            case "e":
                if (player.getRoom()
                    .getEast() != null)
                {
                    player.setRoom(player.getRoom()
                        .getEast());
                }
            case "w":
                if (player.getRoom()
                    .getWest() != null)
                {
                    player.setRoom(player.getRoom()
                        .getWest());
                }
        }
    }

    public static void newGame()
    {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("Would you like to play again? (y) or (n)");
        String response = stdIn.nextLine();
        if (response == "y")
        {
            setupAndPlay();
        } else
        {
            System.out.print("have a nice day!");
        }
    }
}
