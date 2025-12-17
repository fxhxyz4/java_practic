import passes.*;
import exceptions.*;
import java.time.YearMonth;

public class Turnstile {
    public void validateEntryPermission(MetroPass pass) throws
            SchoolPassOverdueException,
            StudentPassOverdueException,
            SchoolPassTripFinishedException,
            RegularPassNotEnoughMoneyException {

        if (pass instanceof SchoolPass school) {
            if (school.getExpirationDate().isBefore(YearMonth.now())) {
                KyivSmartCard.addProhibition();
                throw new SchoolPassOverdueException(school);
            }

            if (school.getCountOfTrip() <= 0) {
                KyivSmartCard.addProhibition();
                throw new SchoolPassTripFinishedException(school);
            }

            school.setCountOfTrip(school.getCountOfTrip() - 1);
            KyivSmartCard.addPermission();
        }
        else if (pass instanceof StudentPass student) {
            if (student.getExpirationDate().isBefore(YearMonth.now())) {
                KyivSmartCard.addProhibition();
                throw new StudentPassOverdueException(student);
            }

            KyivSmartCard.addPermission();
        }
        else if (pass instanceof RegularPass regular) {
            if (regular.getBalance() < KyivSmartCard.FARE) {
                KyivSmartCard.addProhibition();
                throw new RegularPassNotEnoughMoneyException(regular);
            }
            
            regular.setBalance(regular.getBalance() - KyivSmartCard.FARE);
            KyivSmartCard.addPermission();
        }
    }
}