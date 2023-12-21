package entities;

public class Account {

    private int number;
    private String holder;
    private double balance;

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public Account(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        this.deposit(initialDeposit);
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHolder() {
        return this.holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount + 5.0;
    }

    public String toString() {
        int var10000 = this.number;
        return "Account " + var10000 + ", Holder: " + this.holder + ", Balance: $ " + String.format("%.2f", this.balance);
    }



}
