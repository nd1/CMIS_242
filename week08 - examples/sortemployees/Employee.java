// CMIS 242 
// Duane J. Jarc
// July 7, 2015
// Week 8 Examples

// This class defines employee objects that consist of a name and ID.
// It provides a compareTo method that compares them by name.

package sortemployees;

class Employee implements Comparable<Employee>
{
	private String name;
	private int id;
	
	public Employee(String name, int id)
	{
		this.name = name;
		this.id = id;
	}
    @Override
	public int compareTo(Employee other)
	{
		return name.compareTo(other.name);
	}
    @Override
	public String toString()
	{
		return "Name: " + name + " Id; " + id;
	}
	public int getId()
	{
		return id;
	}
	
}