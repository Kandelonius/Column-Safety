package adventureGame;

import java.util.ArrayList;
import java.util.List;

public class Stash
{
    public boolean obtained;
    public List<Item> items = new ArrayList<>();

    public Stash(boolean obtained)
    {
        this.obtained = obtained;
    }

    public boolean isObtained()
    {
        return obtained;
    }

    public void setObtained(boolean obtained)
    {
        this.obtained = obtained;
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
