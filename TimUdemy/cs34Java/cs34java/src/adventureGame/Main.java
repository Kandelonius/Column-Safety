package adventureGame;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Map<String, Room> areas = new HashMap<>();
        Item luckyCat = new Item("lucky_cat",
            "outside",
            "This one has its left paw raised");
        Item candelabra = new Item("candelabra",
            "foyer",
            "The wax has dried out and it's not useful as a light source.");
        Item snowGlobe = new Item("snow_globe",
            "foyer",
            "There appears to be water and small white flakes, but there are palm trees on a beach as well.");
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

        areas.put("outside",
            new Room(10,
                "Outside Cave Entrance",
                "North of you, the cave mount beckons"));
    }

    public static void setup()
    {
        // Declare a Map called cities with
        // keys being Strings, values being Integers
        // and initialize it as a HashMap with keys as Strings values as Integers
        // The String, Integer type for initialization, the one on the right of the equals sign
        // can be inferred from the String, Integer for the declaration, the one on the left.
        // So instead of saying
        // Map<String, Integer> cities = new HashMap<String, Integer>();
        // we can say
        Map<String, Integer> cities = new HashMap<>();

        // put new key, value pairs into the HashMap
        cities.put("Lehi",
            62712);
        cities.put("Seattle",
            724745);
        cities.put("San Francisco",
            884363);
        cities.put("Austin",
            1000000);
        cities.put("Denver",
            619968);
        cities.put("Raleigh",
            464758);
        cities.put("New York City",
            8623000);

        // putting a key that already exists in the HashMap causes the value associated
        // with that key to be replaced with the new sent value!
        cities.put("Austin",
            950715);

        // Displaying the HashMap. Note that putting the \n at the start of our string to display
        // says to first display a blank line and then display our text. So the following is the same as
        // System.out.println();
        // System.out.prtinln("*** The HashMap ***")
        System.out.println("\n*** The HashMap ***");
        System.out.println(cities);

        // Determine if the HashMap contains a certain key use containsKey()
        System.out.println("\nHashMap contains Raleigh as a key: " + cities.containsKey("Raleigh"));
        // Determine if the HashMap contains a certain value use containsValue()
        System.out.println("HashMap contains the value 1000000: " + cities.containsValue(1000000));

        // Since HashMaps do not have a fixed size, we must calculate its size using the method size();
        System.out.println("\nSize of the HashMap is " + cities.size());

        // Remove the item from the HashMap based off of a key
        // use remove();
        cities.remove("Seattle");
        cities.remove("Portland"); // Since Portland is not a key, does nothing

        System.out.println("\nHashMap with one Removed");

        // Using a For Each loop, print the key, value pairs in the HashMap
        // We are looping through the entries, elements, in the HashMaps
        // These Entries are part of a set called entrySet
        // Each entry is composed of a key and a value, in our case a String and an Integer
        // HashMap.Entry can determine what key and value data types it needs from the HashMap
        // we are looping through
        for (HashMap.Entry mapElem : cities.entrySet())
        {
            // print() says do not start the next line on a new line
            // so no return at the end of this print statement.
            System.out.print("Key is " + mapElem.getKey());
            System.out.println("   Value is " + mapElem.getValue());
        }

        // Sorting a HashMap directly is not possible.
        // First we must put the data into an ArrayList and then sort the ArrayList
        // We also have to decide whether we want the HashMap sorted by key or by value
        // Let's sort by key first
        // HashMap.Entry can determine the key and value data types from the HashMap we are converting to the ArrayList
        // the Constructor for an ArrayList can take a set as a parameter!
        List<HashMap.Entry> myList = new ArrayList<>(cities.entrySet());

        // To sort by the keys, use the ArrayList sort method which takes a method
        // Comparator.comparing, which takes argument of what to sort!
        myList.sort(Comparator.comparing(o -> o.getKey()
            .toString()));

        System.out.println("\nSorted by Key");
        System.out.println(myList);

        // To sort by the value, use the ArrayList sort method which takes a method
        // Comparator.comparing, which takes arguments of what to sort and
        // the optional argument saying to sort in descending order!
        myList.sort(Comparator.comparing(o -> (int) o.getValue(),
            Comparator.reverseOrder()));

        System.out.println("\nSort by Value");
        System.out.println(myList);

        // To clear the HashMap use clear()
        // Java would automatically free up the memory allotted to the HashMap when the HashMap goes out of scope,
        // so at the end of this method.
        myList.clear();
        System.out.println("\nThe HashMap Cleared");
        System.out.println(myList);
    }
}
