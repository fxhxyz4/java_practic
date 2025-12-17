package passes;

public abstract class MetroPass {
    private static int idCounter = 0;
    private int uid;

    public MetroPass() {
        this.uid = ++idCounter;
    }

    public int getUid() {
        return uid;
    }
}