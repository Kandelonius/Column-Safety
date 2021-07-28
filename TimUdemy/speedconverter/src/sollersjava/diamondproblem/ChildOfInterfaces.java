package sollersjava.diamondproblem;

public class ChildOfInterfaces implements IParent1, IParent2 {
    @Override
    public void duplicate() {
        IParent1.super.duplicate();
        IParent2.super.duplicate();
    }
}
