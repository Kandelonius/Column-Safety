package roomComposition;

public class Main
{
    public static void main(String[] args)
    {
        Wall wall1 = new Wall("north");
        Wall wall2 = new Wall("south");
        Wall wall3 = new Wall("east");
        Wall wall4 = new Wall("west");
        Ceiling ceiling = new Ceiling(8,
            "blue");
        Sofa sofa = new Sofa(8,
            8);
        Lamp theLamp = new Lamp(false);
        Material wood = new Material("rigid",
            1);
        EndTable endTable = new EndTable(5,
            5,
            wood,
            true,
            theLamp);
        Room room = new Room("Main Room",
            wall1,
            wall2,
            wall3,
            wall4,
            ceiling,
            sofa,
            endTable);
        room.lightRoom();
        endTable.pressPowerButton();
        wood.getFlexibility();

    }
}
