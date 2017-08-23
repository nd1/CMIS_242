// CMIS 242 
// Duane J. Jarc
// May 19, 2015
// Week 1 Examples

// This class defines a mutable wrapper class for ints. It also contains
// a copy constructor and a method to deep compare objects for equality.

package ints;

class Int 
	{
	private int value;
	
	public Int(int aValue)
	{
		value = aValue;
	}
	public Int(Int intObject)
	{
		value = intObject.value;
	}
	public void setInt(int aValue)
	{
		value = aValue;
	}
	public boolean equals(Int other)
	{
		return value == other.value;
	}
    @Override
	public String toString()
	{
		return "" + value;
	}
}