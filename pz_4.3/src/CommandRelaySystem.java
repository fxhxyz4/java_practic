import java.util.*;
import java.util.function.*;

public class CommandRelaySystem {

    public static void broadcast(List<Soldier> soldiers, Command command) {
        for(Soldier soldier : soldiers) {
            command.execute(soldier);
        }
    }

    public static void conditionalBroadcast(List<Soldier> soldiers, Predicate<Soldier> condition, Command command) {
        for (Soldier soldier : soldiers) {
            if (condition.test(soldier)) {
                command.execute(soldier);
            }
        }
    }

    public static Command chainCommands(Command c1, Command c2) {
        return (soldier) -> {
            c1.execute(soldier);
            c2.execute(soldier);
        };
    }

    public static void supply(List<Soldier> soldiers, Supplier<Command> commandSupplier) {
        for (Soldier soldier : soldiers) {
            commandSupplier.get().execute(soldier);
        }
    }
}