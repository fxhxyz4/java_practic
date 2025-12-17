package exceptions;

import passes.RegularPass;

public class RegularPassNotEnoughMoneyException extends Exception {
    private RegularPass pass;

    public RegularPassNotEnoughMoneyException(RegularPass pass) {
        this.pass = pass;
    }

    public String toString() {
        return "RegularPassNotEnoughMoneyException: ID " + pass.getUid();
    }
}