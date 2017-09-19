/*
 * Nicole Donnelly
 * 20170917
 * Project 2 - Account.java
 *
 * This class defines the Account method for the ATMMachineGUI.
 * By default, the object does not increment the withdrawalCount
 * if the withdrawal is part of a transfer. 
 */

public class Account {
  
  private static final double SERVICE_CHARGE = 1.50;
  private static final int FREE_WITHDRAWALS = 4;
  private static int withdrawalCount = 0;
  private static boolean freeTransfers = true;
  private double balance = 0.0;
  
  public Account (double balance) {
    this.balance = balance;
  } // end account
  
  public void deposit (double amount) {
      balance += amount;
  } // end deposit
  
  // the withdraw method has been overloaded to specify whether a withdrawal
  // as part of a transfer counts against the free withdrawals
  
  public void withdraw(double amount) throws InsufficientFunds {
    // if all free withdrawals have been used, add amount to service charge
    if (withdrawalCount >= FREE_WITHDRAWALS) {
      amount += SERVICE_CHARGE;
    } // end if

    // check for sufficient funds
    if (amount > balance) {
      throw new InsufficientFunds(String.format("Insufficent Funds. Transaction "
          + "amount: $%.2f Current Balance: $%.2f", amount, balance));
    } 
    else { // perform withdrawal, increment counter
      balance -= amount;
      withdrawalCount++;
    }
  } // end withdraw
  
  public void withdraw(boolean transfer, double amount) throws InsufficientFunds{
    if(transfer == true) {
      if (amount > balance) {
        throw new InsufficientFunds(String.format("Insufficent Funds. Transaction "
            + "amount: $%.2f Current Balance: $%.2f", amount, balance));
      } 
      else { // perform withdrawal, increment counter
        balance -= amount;
      }
    }
    else {
      withdraw(amount);
    }
  } // end withdraw
  
  public void transfer (double amount, Account toAccount) throws InsufficientFunds {
    // if there are insufficient funds, transfer will not proceed
    withdraw(freeTransfers, amount);
    toAccount.deposit(amount);
  } // end transfer
  
  public double balance() {
    return balance;
  } // end balance
  


} // end class
