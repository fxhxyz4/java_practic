package passes;

import java.time.YearMonth;

public class SchoolPass extends MetroPass {
    private int countOfTrip;
    private YearMonth expirationDate;

    public SchoolPass(int countOfTrip, YearMonth expirationDate) {
        this.countOfTrip = countOfTrip;
        this.expirationDate = expirationDate;
    }

    public int getCountOfTrip() {
        return countOfTrip;
    }

    public void setCountOfTrip(int countOfTrip) {
        this.countOfTrip = countOfTrip;
    }

    public YearMonth getExpirationDate() {
        return expirationDate;
    }
}