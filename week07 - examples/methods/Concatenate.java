// CMIS 242 
// Duane J. Jarc
// June 30, 2015
// Week 7 Examples

// This program illustrates the use of a generic method concatenate that
// that is implicitly instantiated for both integers and strings.

package methods;

class Concatenate
{
	public static void main(String[] args)
	{
		Integer[] numbers = {1, 2, 3, 4, 5};
		System.out.println(concatenate(numbers));
		String[] strings = {"a", "ab", "abb"};
		System.out.println(concatenate(strings));
	}

	public static <T> String concatenate(T[] array)
	{
		String result = "";
		for (T element: array)
			result += element + " ";
		return result;
	}
}