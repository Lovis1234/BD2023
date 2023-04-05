package nl.belastingdienst.H11.H11Bank;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();
        bank.createAccount(AccountType.CheckingAccount);
        bank.createAccount(AccountType.CheckingAccount);
        bank.createAccount(AccountType.CheckingAccount);
        bank.createAccount(AccountType.SavingsAccount);
        bank.createAccount(AccountType.SavingsAccount);
        bank.getIntrests();
        System.out.println(bank.getCapital());
        bank.getIntrests();


    }

//    public static void main(String[] args) {
//        JFrame frame = new JFrame("MainScreen");
//        frame.setContentPane(new MainScreen().rootPanel);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(1000, 750);
//        frame.setVisible(true);
//
//    }
}
