// CMIS 242 
// Duane J. Jarc
// June 2, 2015
// Week 3 Examples

// This class extends the Date class. It contains a class method to create a 
// Date object from a string in the format MM/DD/YYYY.  If the string does not
// contain all numbers or if the values are out or range it throws an exception. 

package dates;

class CheckedDate extends Date
{
	private static int[] daysInMonth = 
		{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public CheckedDate(Date date)
	{
		this.month = date.month;
		this.day = date.day;
		this.year = date.year;
	}
	public static CheckedDate fromString(String string)
	{
		try
		{
			Date date = Date.fromString(string);
			CheckedDate checkedDate = new CheckedDate(date);
			checkedDate.checkRange();
			return checkedDate;
		}
		catch (NumberFormatException exception)
		{
			throw new InvalidDate("Contains nonnumeric data");
		}	
		catch (IllegalArgumentException exception)
		{
			throw new InvalidDate("Does not contain 3 numbers");
		}
	}
	private void checkRange()
	{
		if (month < 1 || month > 12)
			throw new InvalidDate("Month out of range");
		if (day < 1 || !isLeapDay() && day > daysInMonth[month - 1])
			throw new InvalidDate("Day out of range");
	}
	private boolean isLeapDay()
	{
		return month == 2 && day == 29 && year % 4 == 0;
	}
}