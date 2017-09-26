// CMIS 242 
// Duane J. Jarc
// June 23, 2015
// Week 6 Examples

// This class illustrates the binary search of an integer array done
// using both iteration and recursion. The recursive version illustrates
// the use of a helper method and tail recursion.

import java.util.*;

class BinarySearch
{
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		int[] array = {7, 23, 45, 57, 87, 99, 105, 128, 236}; 
		System.out.print("Enter an  integer: ");
		int n = stdin.nextInt();
		int search_1 = iterativeBinarySearch(array, n);
		System.out.println("Iterative Search = " + search_1);
		int search_2 = recursiveBinarySearch(array, n);
		System.out.println("Recursive Search = " + search_2);
	}
	private static int iterativeBinarySearch(int[] array, int target)
	{
		int left = 0, right = array.length - 1, middle;
		while (left <= right)
		{
			middle = (left + right) / 2;
			if (array[middle] == target)
				return middle;
			else if (array[middle] > target)
				right = middle - 1;
			else
				left = middle + 1;
		}
		return -1;
	}
	private static int recursiveBinarySearch(int[] array, int target, int left, int right)
	{
		if (left > right)
			return -1;
		int middle = (left + right) / 2;
		if (array[middle] == target)
			return middle;
		if (array[middle] > target)
			return recursiveBinarySearch(array, target, left, middle - 1);
		return recursiveBinarySearch(array, target, middle + 1, right);
	}
	private static int recursiveBinarySearch(int[] array, int target)
	{
		return recursiveBinarySearch(array, target, 0, array.length - 1);
	}
}
