package nl.belastingdienst.H7ObjectOrientation.H7Bank;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainScreen extends JPanel implements ActionListener {
    public JPanel rootPanel;
    private JButton actionButton;
    private JTextField textField2;
    private JLabel topLabel;
    private JLabel messageLabel;
    private JButton adminButton;
    private JButton createAccountButton;
    private JButton transferButton;
    private JButton depositWithdrawButton;
    private JLabel capitalLabel;
    private JTextField textField1;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private ButtonGroup buttonGroup = new ButtonGroup();

    private Bank bank = new Bank();

    private PAGE CURRENTPAGE = PAGE.HOME;
    private int currentAccountNumber;

    public MainScreen() {
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        bank.createAccount(69.11);
        bank.createAccount(1000);
        bank.createAccount(1250.50);
        bank.createAccount(100.69);
        topLabel.setSize(30, 30);
        topLabel.setText("Input an account number and select one of the buttons");
        actionButton.setText("Log in");
        messageLabel.setVisible(false);
        capitalLabel.setVisible(false);
        actionButton.setVisible(false);
        depositWithdrawButton.setVisible(false);
        adminButton.setVisible(false);
        createAccountButton.setVisible(false);
        transferButton.setVisible(false);
        textField1.setVisible(true);
        textField2.setVisible(false);
        radioButton1.setVisible(false);
        radioButton2.setVisible(false);
        actionButton.setVisible(true);
//        label.setText(String.valueOf(bank.getCapital()));

        actionButton.addActionListener(this);
        adminButton.addActionListener(this);
        createAccountButton.addActionListener(this);
        depositWithdrawButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == actionButton) {
            if (CURRENTPAGE == PAGE.CREATE) {
                String message = bank.createAccount(Double.parseDouble(textField2.getText()));
                messageLabel.setText(message);
                messageLabel.setVisible(true);
            }
            if (CURRENTPAGE == PAGE.HOME) {
                if (!textField1.getText().isEmpty()) {
                    currentAccountNumber = Integer.parseInt(textField1.getText());
                    depositWithdrawButton.setVisible(true);
                    adminButton.setVisible(true);
                    createAccountButton.setVisible(true);
                    transferButton.setVisible(true);
                    messageLabel.setText("Logged into account #" + currentAccountNumber);
                } else {
                    messageLabel.setText("Put in an account number");
                }
                messageLabel.setVisible(true);
            }
        }
//        if (e.getSource() == adminButton) {
//            CURRENTPAGE = PAGE.ADMIN;
//            topLabel.setText("Admin overview");
//            textField2.setVisible(false);
//            topLabel.setVisible(false);
//            actionButton.setVisible(false);
//            capitalLabel.setVisible(true);
//            capitalLabel.setText("The bank currently holds: " + bank.getCapital());
//        }

        if (e.getSource() == depositWithdrawButton) {
            CURRENTPAGE = PAGE.CHANGE;
            actionButton.setText("Deposit/Withdraw");
            ACTION option;
            topLabel.setText("Deposit or withdraw to an account");
            actionButton.setVisible(true);
            textField1.setVisible(true);
            textField1.setText("Accountnumber");
            textField2.setVisible(true);
            topLabel.setVisible(true);
            actionButton.setVisible(true);
            radioButton2.setText("Deposit to an account");
            radioButton1.setText("Withdraw from an account");
            radioButton1.setVisible(true);
            radioButton2.setVisible(true);
            capitalLabel.setVisible(false);

            if (radioButton1.isSelected()) {
                option = ACTION.WITHDRAW;

            } else if (radioButton2.isSelected()) {
                option = ACTION.DEPOSIT;
            }

        }

        if (e.getSource() == createAccountButton) {
            CURRENTPAGE = PAGE.CREATE;
            radioButton2.setVisible(false);
            radioButton1.setVisible(false);
            actionButton.setText("Create account");
            topLabel.setText("Create an account by inputting the desired amount");
            textField2.setVisible(true);
            topLabel.setVisible(true);
            actionButton.setVisible(true);
            capitalLabel.setVisible(false);
            textField1.setVisible(false);

        }

        if (e.getSource() == adminButton) {
            CURRENTPAGE = PAGE.ADMIN;
            radioButton2.setVisible(false);
            radioButton1.setVisible(false);
            topLabel.setText("Admin overview");
            textField2.setVisible(false);
            topLabel.setVisible(false);
            actionButton.setVisible(false);
            capitalLabel.setVisible(true);
            textField1.setVisible(false);

            StringBuilder stringBuilder = new StringBuilder("<html>");
            stringBuilder.append("The bank currently holds: ").append(bank.getCapital()).append(bank.getIntrests()).append("</html>");
            System.out.println(stringBuilder);
            capitalLabel.setText(stringBuilder.toString());
        }

    }
}
