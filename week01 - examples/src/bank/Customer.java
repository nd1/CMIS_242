// CMIS 242 
// Duane J. Jarc
// May 19, 2015
// Week 1 Examples

// This class defines a customer objects that have two bank accounts, a checking
// and a savings. It illustrates a compositional relationship between classes.
// A constructor and toString method are provided. 

package bank;

class Customer
{
	private String name;
	private Account checking, savings;
	
	public Customer(String name, Account checking, Account savings)
	{
		this.name = name;
		this.checking = checking;
		this.savings = savings;
	}
    @Override
	public String toString()
	{
		return "Name: " + name + " Checking " + checking + " Savings " + savings;
	}
}