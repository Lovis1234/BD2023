package nl.belastingdienst.H7Bank;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private static final double INTEREST = 2.5;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double calculateInterest() {
        return balance * (1 + INTEREST / 100) - balance;
    }

    public void transfer(BankAccount bankAccount, double amount) throws InsufficientFundsException {
        if (balance >= amount) {
            bankAccount.setBalance(bankAccount.getBalance() + amount);
        } else throw new InsufficientFundsException("U hebt geen toereikend saldo voor deze overboeking");
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (balance >= amount) {
            setBalance(getBalance() - amount);
        } else throw new InsufficientFundsException("U hebt geen toereikend saldo voor deze opname");
    }

    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }

    public void printBalance() {
        System.out.println("Current balance of account #" + accountNumber + " = €" + balance);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
