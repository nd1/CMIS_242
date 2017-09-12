// CMIS 242 
// Duane J. Jarc
// June 2, 2015
// Week 3 Examples

// This class contains a main method to add together a list of lengths and
// to display the sum.

package lengths;

class SumAddables
{
	public static void main(String[] args)
	{
		AddableLength lengths[] = {new AddableLength(1, 0), new AddableLength(1, 6), 
			new AddableLength(0, 12)},	sum = new AddableLength(0, 0);
		computeSum(lengths, sum);
		System.out.println("Sum = " + sum);
	}
	public static void computeSum(Addable[] values, Addable sum)
	{
		for (Addable value: values)
			sum.addTo(value);
	}
}