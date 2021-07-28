package sollersjava.diamondproblem;

public class DiamondProblem {
    public static void main(String[] args) {
        ChildOfInterfaces coi = new ChildOfInterfaces();
        coi.duplicate(); // this calls both duplicates that were inherited
    }
}
