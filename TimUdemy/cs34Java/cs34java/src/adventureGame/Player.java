package adventureGame;

public class Player
{
    public String name;

    public Room room;

    public Player(
        String name,
        Room room)
    {
        this.name = name;
        this.room = room;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Room getRoom()
    {
        return room;
    }

    public void setRoom(Room room)
    {
        this.room = room;
    }
}
