@FunctionalInterface
public interface Command {
    abstract void execute(Soldier s);
}