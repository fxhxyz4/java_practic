import java.util.*;
import java.util.function.*;

public class BattleEfficiencyAnalyzer {
    public static List<Unit> filterUnits(List<Unit> units, Predicate<Unit> condition) {
        List<Unit> filteredUnits = new ArrayList<Unit>();

        for (Unit unit : units) {
           if (condition.test(unit)) {
               filteredUnits.add(unit);
           }
        }

        return filteredUnits;
    }

    public static List<String> transformUnits(List<Unit> units, Function<Unit, String> transformer) {
        List<String> result = new ArrayList<>();

        for (Unit unit : units) {
            result.add(transformer.apply(unit));
        }

        return result;
    }

    public static double aggregate(List<Unit> units, ToDoubleFunction<Unit> metric) {
        double result = 0.0;

        for (Unit unit : units) {
            result += metric.applyAsDouble(unit);
        }

        return result;
    }

    public static void actOnUnits(List<Unit> units, Consumer<Unit> action) {
        for(Unit unit : units) {
            action.accept(unit);
//            System.out.println("Accepted");
        }
    }

    public static Unit compareUnits(Unit u1, Unit u2, BiFunction<Unit, Unit, Unit> comparator) {
        return  comparator.apply(u1, u2);
    }
}