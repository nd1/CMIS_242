// CMIS 242 
// Duane J. Jarc
// July 7, 2015
// Week 8 Examples

// This program reads in a file of employee records and sorts them using the
// defined comparison by name and also sorts them by ID using a comparator.

package sortemployees;

import java.io.*;
import java.util.*;

class Sort
{
	private static class IdCompare implements Comparator<Employee>
	{
        @Override
		public int compare(Employee left, Employee right)
		{
			return left.getId() - right.getId();
		}
	}
	 
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner file = new Scanner(new File("employees.txt"));
		List<Employee> employees = new ArrayList();
		
		while (file.hasNext())
		{
			String name = file.next();
			int id = file.nextInt();
			employees.add(new Employee(name, id));
		}
		System.out.println("Sorted By name");
		Collections.sort(employees);
		for (Employee employee: employees)
			System.out.println(employee);
		System.out.println("\nSorted By id");
		Collections.sort(employees, new IdCompare());
		for (Employee employee: employees)
			System.out.println(employee);
	}
}