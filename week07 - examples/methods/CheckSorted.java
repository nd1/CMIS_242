// CMIS 242 
// Duane J. Jarc
// June 30, 2015
// Week 7 Examples

// This program illustrates the use of a generic method isSorted that uses a
// bounded types and is implicitly instantiated for both integers and strings.

package methods;

class CheckSorted
{
	public static void main(String[] args)
	{
		Integer[] sorted1 = {1, 2, 3, 4, 5}, unsorted1 = {3, 4, 1, 6, 5};
		System.out.println("Sorted = " + isSorted(sorted1));
		System.out.println("Unsorted = " + isSorted(unsorted1));
		String[] sorted2 = {"a", "ab", "abb"};
		String[] unsorted2 = {"a", "z", "b"}; 
		System.out.println("Sorted = " + isSorted(sorted2));
		System.out.println("Unsorted = " + isSorted(unsorted2));
	}

	public static <T extends Comparable> boolean isSorted(T[] array)
	{
		for (int i = 1; i < array.length; i++)
			if (array[i-1].compareTo(array[i]) > 0)
				return false;
		return true;
	}
}