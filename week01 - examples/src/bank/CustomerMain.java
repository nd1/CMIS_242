// CMIS 242 
// Duane J. Jarc
// May 19, 2015
// Week 1 Examples

// This class contains a main method that is used to test the Customer class.

package bank;

class CustomerMain
{

	public static void main(String[] args)
	{
		Account checking = new Account(1000), savings = new Account(5000);
		Customer john = new Customer("John", checking, savings);
		System.out.println(john);
	}
}