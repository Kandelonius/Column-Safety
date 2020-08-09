package adventureGame;

import java.util.ArrayList;
import java.util.List;

public class Room
{
    public int id;
    public String name;
    public String flavor;
    public String north = "none";
    public String south = "none";
    public String east = "none";
    public String west = "none";
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

    public String getNorth()
    {
        return north;
    }

    public void setNorth(String north)
    {
        this.north = north;
    }

    public String getSouth()
    {
        return south;
    }

    public void setSouth(String south)
    {
        this.south = south;
    }

    public String getEast()
    {
        return east;
    }

    public void setEast(String east)
    {
        this.east = east;
    }

    public String getWest()
    {
        return west;
    }

    public void setWest(String west)
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
