// CMIS 242 
// Duane J. Jarc
// July 7, 2015
// Week 8 Examples

// This class defines the value of the key-value pairs for the phone book.
// It consists of an address and phone number.

package phone;

import java.util.*;

class Entry
{
	private String address, number;
	
	public Entry(String address, String number)
	{
		this.address = address;
		this.number = number;
	}
	public String toString()
	{
		return "Address: " + address + " Phone number: " + number;
	}
}