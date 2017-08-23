// CMIS 242 
// Duane J. Jarc
// May 19, 2015
// Week 1 Examples

// This version of the mutable wrapper class for ints program illustrates the 
// use of the reserved word this in two different ways.

package ints;

class AnotherInt 
	{
	private int value;
	
	public AnotherInt(int value)
	{
		this.value = value;
	}
	public AnotherInt(AnotherInt intObject)
	{
		this(intObject.value);
	}
	public void setInt(int aValue)
	{
		value = aValue;
	}
	public boolean equals(AnotherInt other)
	{
		return value == other.value;
	}
	@Override
	public String toString()
	{
		return "" + value;
	}
}