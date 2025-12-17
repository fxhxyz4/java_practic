import passes.*;
import java.util.ArrayList;
import java.util.List;

public class KyivSmartCard {
    // 8 грн проезд
    public static final double FARE = 8.0;
    // local db
    private static List<MetroPass> registry = new ArrayList<>();

    // статистика. сколько прошло через турникет, а сколько нет
    private static int permissions = 0;
    private static int prohibitions = 0;

    public static void registerPass(MetroPass pass) {
        registry.add(pass);
    }

    public static void addPermission() {
        permissions++;
    }

    public static void addProhibition() {
        prohibitions++;
    }

    public static int getPermissions() {
        return permissions;
    }

    public static int getProhibitions() {
        return prohibitions;
    }
}