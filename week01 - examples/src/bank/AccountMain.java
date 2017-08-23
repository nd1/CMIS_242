// CMIS 242 
// Duane J. Jarc
// May 19, 2015
// Week 1 Examples

// This class contains a main method that is used to test the Account class.

package bank;

class AccountMain
{
	public static void main (String[] args)
	{
		Account checking = new Account (100000),
			savings = new Account (500000);
      
		checking.deposit(10000);
		savings.withdraw(5000);
		savings.transfer(50000, checking);
		System.out.println("Checking " + checking + " Savings " + savings);
	}
}

