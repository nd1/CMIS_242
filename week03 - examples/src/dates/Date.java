// CMIS 242 
// Duane J. Jarc
// June 2, 2015
// Week 3 Examples

// This class defines a date consisting of a month, day and year. It contains
// a class method to create a Date object from a string in the format MM/DD/YYYY.
// If the string does not contain two slashes it throws an exception. It also
// contains a toString method to output the date using the month name.

package dates;

import java.util.*;

class Date
{
	protected int day, month, year;
	private static final String[] months = {"January", "February", "March", 
		"April", "May", "June", "July", "August", "September", "October", 
		"November", "December"}; 
	public static Date fromString(String string) throws IllegalArgumentException
	{
		String[] strings = string.split("/");
		if (strings.length != 3)
			throw new IllegalArgumentException();
		Date date = new Date();
		date.month = Integer.parseInt(strings[0]);
		date.day = Integer.parseInt(strings[1]);
		date.year = Integer.parseInt(strings[2]);
		return date;
	}
	@Override
	public String toString()
	{
		return months[month - 1] + " " + day + ", " + year;
	}
}