// CMIS 242 
// Duane J. Jarc
// May 19, 2015
// Week 1 Examples

// This class define a bank account that contains the account balance and allows
// three transactions, deposits, withdrawals and transfers between accounts.

package bank;

class Account
{
	private int balance;
   
	public Account (int startingBalance)
	{
		balance = startingBalance;
	}
	public void deposit (int amount)
	{
		balance += amount;
	}
	public void withdraw (int amount)
	{
		balance -= amount;
	}
	public void transfer (int amount, Account toAccount)
	{
		withdraw (amount);
		toAccount.deposit(amount);
	}
    @Override
	public String toString()
	{
		return "balance = " + balance;
	}
}