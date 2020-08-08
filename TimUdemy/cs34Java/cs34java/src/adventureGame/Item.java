package adventureGame;

public class Item
{
    private static int maxId = 0;

    public int id;
    public String name;
    public String location;
    public String description;

    public Item(
        String name,
        String location,
        String description)
    {
        this.name = name;
        this.location = location;
        this.description = description;
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

    public String getLocation()
    {
        return location;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }
}
