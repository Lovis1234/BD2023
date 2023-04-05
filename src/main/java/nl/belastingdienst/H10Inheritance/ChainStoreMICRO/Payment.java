package nl.belastingdienst.H10Inheritance.ChainStoreMICRO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Payment implements ActionListener {
    private JPanel rootPane;
    private JButton TransferButton;
    private JButton SaldoButton;
    private JPanel TransferPane;
    private JLabel titelLabel;
    private JTextField textField1;
    private JTextField textField2;
    private JButton actionButton;
    private JLabel messageLabel;
    private JLabel saldoLabel;
    private JPanel saldoPanel;
    private ShopUserInterface shop = ShopUserInterface.getShopUserInterface();

    public Payment() {
        TransferButton.setText("Transfer");
        SaldoButton.setText("Overview");
        actionButton.setText("Confirm");
        titelLabel.setText("Choose first the desired account # and the desired amount");
        actionButton.addActionListener(this);
        messageLabel.setVisible(false);
        SaldoButton.addActionListener(this);
        saldoPanel.setVisible(false);
        TransferButton.addActionListener(this);
    }

    public JPanel getRootPane() {
        return rootPane;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == actionButton) {
            try {
                if ((!textField1.getText().isEmpty() && !textField2.getText().isEmpty())) {
                    boolean response = shop.StartPayment(Integer.parseInt(textField1.getText()), Integer.parseInt(textField2.getText()));
                    messageLabel.setText(response ? "Payment succesful!" : "Not enough credit, get a goldcard for infinite credit!");
                } else {
                    messageLabel.setText("Please fill all fields");
                }
            } catch (NumberFormatException b) {
                messageLabel.setText("Only input numbers");
            } catch (NullPointerException b) {
                messageLabel.setText("Card not found!");
            }
            messageLabel.setVisible(true);
        }
        if (e.getSource() == SaldoButton) {
            TransferPane.setVisible(false);
            saldoPanel.setVisible(true);
            saldoLabel.setText(shop.getCards());
        }
        if (e.getSource() == TransferButton) {
            saldoPanel.setVisible(false);
            TransferPane.setVisible(true);
        }

    }
}
