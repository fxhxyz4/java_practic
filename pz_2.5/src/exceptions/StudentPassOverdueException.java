package exceptions;

import passes.StudentPass;

public class StudentPassOverdueException extends Exception {
    private StudentPass pass;

    public StudentPassOverdueException(StudentPass pass) {
        this.pass = pass;
    }

    public String toString() {
        return "StudentPassOverdueException: ID " + pass.getUid();
    }
}