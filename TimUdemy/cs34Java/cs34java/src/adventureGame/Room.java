package adventureGame;

import java.util.ArrayList;
import java.util.List;

public class Room
{
    public int id;
    public String name;
    public String flavor;
    public List<Item> items = new ArrayList<>();

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
}
