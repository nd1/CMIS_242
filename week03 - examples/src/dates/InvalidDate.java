// CMIS 242 
// Duane J. Jarc
// June 2, 2015
// Week 3 Examples

// This class defines a custom unchecked exception to handle invalid dates.

package dates;

class InvalidDate extends RuntimeException
{
	public InvalidDate(String message)
	{
		super(message);
	}
}