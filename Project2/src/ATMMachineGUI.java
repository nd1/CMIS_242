/*
 * Nicole Donnelly
 * 20170917
 * Project 2 - ATMMachinceGUI.java
 *
 * This class defines the GUI and holds the main method for an ATM.
 * Users can deposit, withdraw, transfer, and check balances for their
 * checking and savings account.
 */

import java.awt.*;
import javax.swing.*;

public class ATMMachineGUI extends JFrame {
  
  // withdrawal increment
  private static final double INCREMENT = 20.00;
  // initial account balance
  private static final double INITAL_BALANCE = 0.0;
  // GUI buttons
  private JButton withdrawButton = new JButton("Withdraw");
  private JButton depositButton = new JButton("Deposit");
  private JButton transferToButton = new JButton("Transfer To");
  private JButton balanceButton = new JButton("Balance");
  // GUI Radio buttons
  private JRadioButton checking = new JRadioButton("Checking", false);
  private JRadioButton savings = new JRadioButton("Savings", true);
  // GUI text field
  private JTextField amountField = new JTextField(20);

  private double amount;
  private Account checkingAccount = new Account(INITAL_BALANCE);
  private Account savingsAccount = new Account(INITAL_BALANCE);
  
  public ATMMachineGUI() {
    
    // super call with JFrame name
    super("ATM Machine");
    
    // size, close behavior, and layout
    setSize(300, 175);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    
    // button panel
    JPanel buttonPanel = new JPanel();
    buttonPanel.setLayout(new GridLayout(2, 2, 10, 10));
    buttonPanel.add(withdrawButton);
    buttonPanel.add(depositButton);
    buttonPanel.add(transferToButton);
    buttonPanel.add(balanceButton);
    add(buttonPanel);
    
    // radio buttons
    JPanel radioPanel = new JPanel();
    radioPanel.setLayout(new GridLayout(1, 2, 10, 10));
    radioPanel.add(checking);
    radioPanel.add(savings);
    add(radioPanel);
    ButtonGroup group = new ButtonGroup();
    group.add(checking);
    group.add(savings);
    
    // text field for amount
    JPanel amountPanel= new JPanel();
    amountPanel.setLayout(new FlowLayout());
    amountPanel.add(amountField);
    add(amountPanel);
    
    // button tooltips
    withdrawButton.setToolTipText("Withdraw amount from selected account (increments of $20)."
        + " After 4 withdrawals, a $1.50 fee will be imposed.");
    depositButton.setToolTipText("Deposit amount to selected account.");
    transferToButton.setToolTipText("Transfer amount to selected account. Transfers"
        + "are always fee free.");
    balanceButton.setToolTipText("Show balance of selected account.");
    
    // listeners
    withdrawButton.addActionListener(event -> withdrawATM());
    depositButton.addActionListener(event -> depositATM());
    transferToButton.addActionListener(event -> transferToATM());
    balanceButton.addActionListener(event -> balanceATM());
    
  } // end ATMMachineGUI
  
  public void withdrawATM() {
    try {
      // validate input is a number
      checkNumber();
     
      // validate input is evenly divisible by the increment
      if (checkAmount() == true) {
        try {
          whichAccount().withdraw(amount);
          JOptionPane.showMessageDialog(null, String.format("$%.2f withdrawn."
              + " New balance: $%.2f\n\n**After 4 withdrawals you will incur a"
              + " $1.50 fee per withdrawal.", amount, whichAccount().balance()));
        }
        catch (InsufficientFunds exception) {
          JOptionPane.showMessageDialog(null, exception.getMessage());
        }
      } // end if
    } // end try for validations
    catch (NumberFormatException exception) {
        JOptionPane.showMessageDialog(null, "Please enter a valid amount.");
      } // catch exception from checkNumber
    
  } // end withdrawATM
  
  public void depositATM() {
    // validate input is a number
    try {
      checkNumber();
      whichAccount().deposit(amount);
      JOptionPane.showMessageDialog(null, String.format("$%.2f deposited."
          + " New balance: $%.2f", amount, whichAccount().balance()));
    }
    catch (NumberFormatException exception) {
      JOptionPane.showMessageDialog(null, "Please enter a valid amount.");
    } // catch exception from checkNumber
    
  } // end depositATM
  
  public void transferToATM() {
    // validate input is a number
    try {
      checkNumber();
      if (whichAccount() == checkingAccount) {
        try {
          savingsAccount.transfer(amount, checkingAccount);
          JOptionPane.showMessageDialog(null, String.format("$%.2f transfered to checking."
            + "\nNew checking balance: $%.2f\nNew savings balance: $%.2f", 
            amount, checkingAccount.balance(), savingsAccount.balance()));
        }
        catch(InsufficientFunds error){
          JOptionPane.showMessageDialog(null, error.getMessage());
        }
      } // end if
      else {
        try { 
          checkingAccount.transfer(amount, savingsAccount);
          JOptionPane.showMessageDialog(null, String.format("$%.2f transfered to savings."
            + "\nNew savings balance: $%.2f\nNew checking balance: $%.2f", 
            amount, savingsAccount.balance(), checkingAccount.balance()));
        }
         catch(InsufficientFunds error){
           JOptionPane.showMessageDialog(null, error.getMessage());
         }
      } // end else
    }
    catch(NumberFormatException exception) {
      JOptionPane.showMessageDialog(null, "Please enter a valid amount.");
    } // catch exception from checkNumber
} // end transferToATM
  
  public void balanceATM() {
    // validate input is a number
    JOptionPane.showMessageDialog(null, String.format("Your balance is $%.2f", 
        whichAccount().balance()));
  } // end balanceATM
  
  private void checkNumber() throws NumberFormatException{
      amount = Double.parseDouble(amountField.getText());
    } // end checkNumber
  
  private boolean checkAmount() {
    // check if the withdrawal amount is a multiple of the increment
    if (amount%INCREMENT != 0.0) {
      JOptionPane.showMessageDialog(null, String.format("Withdrawals only permitted"
          + "in increments of $%.2f", INCREMENT));
      return false;
    }
    else {
      return true;
    }
  } // end checkAmount
  
  private Account whichAccount() {
    // which account is selected for the transaction
    if (checking.isSelected()) {
      return checkingAccount;
    }
    else {
      return savingsAccount;
    }
  } // end whichAccount
  
  public static void main(String[] args) {
      
    ATMMachineGUI frame = new ATMMachineGUI();
    frame.setVisible(true);
  } // end main

} // end class
