import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

class Program {
    public static void main(String[] args) {
        List<Unit> units = List.of(
                new Unit("Rifleman", "Infantry", 400, 120, 0.65, 0.8),
                new Unit("Sniper", "Recon", 1200, 25, 0.95, 0.7),
                new Unit("Mortar Team", "Artillery", 2500, 30, 0.82, 0.75),
                new Unit("Howitzer", "Artillery", 6000, 20, 0.88, 0.85),
                new Unit("T-90 Tank", "Armored", 4000, 40, 0.85, 0.9)
        );

        List<Unit> filtered = BattleEfficiencyAnalyzer.filterUnits(
                units,
                u -> u.getType().equalsIgnoreCase("Artillery") && u.getAccuracy() > 0.8
        );

        System.out.println("Артилерійські підрозділи з точністю понад 80%:");
        BattleEfficiencyAnalyzer.actOnUnits(filtered, System.out::println);

        double avgMorale = BattleEfficiencyAnalyzer.aggregate(units, (u) -> u.getMorale());
                System.out.printf("%nСередній рівень моралі: %.2f%n", avgMorale);

                Unit u1 = units.get(2);
                Unit u2 = units.get(3);

                Unit better = BattleEfficiencyAnalyzer.compareUnits(
                        u1,
                        u2,
                        (a, b) -> (a.getAccuracy() * a.getMorale()) > (b.getAccuracy() * b.getMorale()) ? a : b
                );

                System.out.printf("%nКраща одиниця за показником accuracy * morale: %s ( %s )%n", better.getName(), better.getType());

                List<String> report = BattleEfficiencyAnalyzer.transformUnits(
                        units,
                        u -> u.toString()
                );

                System.out.println("\nТекстовий звіт:");
                report.forEach(System.out::println);

        System.out.println("\n\n\n\n2 zadanie\n\n");

        List<Soldier>soldiers = List.of(
                new Soldier("Alex", "Sniper", 80, 30),
                new Soldier("Marta", "Medic", 90, 2),
                new Soldier("John", "Engineer", 75, 50),
                new Soldier("Olena", "Sniper", 85, 4),
                new Soldier("Victor", "Engineer", 70, 40)
        );

        Command attack = soldier -> soldier.attack();
        Command rest   = soldier -> soldier.rest();

        Command reload = soldier -> {
            if (soldier.getAmmo() < 5) {
                soldier.reload();
            } else {
                System.out.println(soldier.getName() + " no reload");
            }
        };

        System.out.println("\n=== Виконання reload для солдатів з ammo < 5 ===");
         for (Soldier soldier : soldiers) {
           reload.execute(soldier);
         }

        System.out.println("=== Виконання attack and rest для всіх солдатів ===");
        Command attackAndRest = CommandRelaySystem.chainCommands(attack, rest);

        for (Soldier s : soldiers) {
            attackAndRest.execute(s);
        }

        System.out.println("=== Виконання вибору между attack and reload ===");
        Random rand = new Random();

        for (Soldier s : soldiers) {
            Command rndCmd = (rand.nextInt() % 2 == 0) ? attack : reload;
            rndCmd.execute(s);
        }
    }
}
