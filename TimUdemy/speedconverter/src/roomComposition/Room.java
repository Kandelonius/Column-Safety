package roomComposition;

public class Room
{
    private String name;

    private Wall wall1;

    private Wall wall2;

    private Wall wall3;

    private Wall wall4;

    private Ceiling ceiling;

    private Sofa sofa;

    private EndTable endTable;

    public Room(
        String name,
        Wall wall1,
        Wall wall2,
        Wall wall3,
        Wall wall4,
        Ceiling ceiling,
        Sofa sofa,
        EndTable endTable)
    {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.sofa = sofa;
        this.endTable = endTable;
    }

    public EndTable getEndTable()
    {
        return endTable;
    }

    public void lightRoom()
    {
        System.out.println("In Room using light.");
        endTable.pressPowerButton();
    }
}
