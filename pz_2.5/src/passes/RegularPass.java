package passes;

public class RegularPass extends MetroPass {
    private double balance;

    public RegularPass(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}