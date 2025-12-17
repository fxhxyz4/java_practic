package exceptions;

import passes.SchoolPass;

public class SchoolPassOverdueException extends Exception {
    private SchoolPass pass;

    public SchoolPassOverdueException(SchoolPass pass) {
        this.pass = pass;
    }

    public String toString() {
        return "SchoolPassOverdueException: ID " + pass.getUid();
    }
}