import passes.*;
import exceptions.*;
import java.time.YearMonth;

public class Main {
    public static void main(String[] args) {
        Turnstile turnstile = new Turnstile();

        SchoolPass p1 = new SchoolPass(50, YearMonth.of(2023, 1));
        SchoolPass p2 = new SchoolPass(20, YearMonth.now().plusMonths(1));
        StudentPass p3 = new StudentPass(YearMonth.of(2023, 1));
        RegularPass p4 = new RegularPass(2.0);

        MetroPass[] cards = {p1, p2, p3, p4};

        for (MetroPass card : cards) {
            try {
                turnstile.validateEntryPermission(card);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        System.out.println("\nTotal Permissions: " + KyivSmartCard.getPermissions());
        System.out.println("Total Prohibitions: " + KyivSmartCard.getProhibitions());
    }
}