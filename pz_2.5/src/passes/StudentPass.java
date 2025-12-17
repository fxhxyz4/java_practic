package passes;

import java.time.YearMonth;

public class StudentPass extends MetroPass {
    private YearMonth expirationDate;

    public StudentPass(YearMonth expirationDate) {
        this.expirationDate = expirationDate;
    }

    public YearMonth getExpirationDate() {
        return expirationDate;
    }
}