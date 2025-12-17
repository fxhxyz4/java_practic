package exceptions;

import passes.SchoolPass;

public class SchoolPassTripFinishedException extends Exception {
    private SchoolPass pass;

    public SchoolPassTripFinishedException(SchoolPass pass) {
        this.pass = pass;
    }

    public String toString() {
        return "SchoolPassTripFinishedException: ID " + pass.getUid();
    }
}