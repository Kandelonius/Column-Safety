package adventureGame;

import java.util.ArrayList;
import java.util.List;

public class Room
{
    public int id;

    public String name;

    public String flavor;

    public Room north = null;

    public Room south = null;

    public Room east = null;

    public Room west = null;

    public List<Item> items = new ArrayList<>();

    public Stash[] carryAll = new Stash[1];

    public Room(
        int id,
        String name,
        String flavor)
    {
        this.id = id;
        this.name = name;
        this.flavor = flavor;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getFlavor()
    {
        return flavor;
    }

    public void setFlavor(String flavor)
    {
        this.flavor = flavor;
    }

    public List<Item> getItems()
    {
        return items;
    }

    public void setItems(List<Item> items)
    {
        this.items = items;
    }

    public String getCarryAll()
    {
        String contents = carryAll.length > 0 ? "at the overlook" : "with the player";
        return "The backpack is " + contents + ".";
    }

    public void setCarryAll(Stash[] carryAll)
    {
        this.carryAll = carryAll;
    }

    public Room getNorth()
    {
        return north;
    }

    public void setNorth(Room north)
    {
        this.north = north;
    }

    public Room getSouth()
    {
        return south;
    }

    public void setSouth(Room south)
    {
        this.south = south;
    }

    public Room getEast()
    {
        return east;
    }

    public void setEast(Room east)
    {
        this.east = east;
    }

    public Room getWest()
    {
        return west;
    }

    public void setWest(Room west)
    {
        this.west = west;
    }

    @Override
    public String toString()
    {
        return "Room{" +
            "name='" + name + '\'' +
            ", flavor='" + flavor + '\'' +
            '}';
    }
}
