// CMIS 242 
// Duane J. Jarc
// September 13, 2016
// Week 4 Examples

// A checked exception thrown when a purchase is attempted before sufficient amount is deposited

package soda;

class InsufficientAmount extends Exception
{
	public InsufficientAmount(String amount)
	{
		super(amount);
	}
}
