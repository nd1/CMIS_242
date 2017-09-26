// CMIS 242 
// Duane J. Jarc
// June 23, 2015
// Week 6 Examples

// This class contains both an iterative and recursive version of a method that
// computes the n squared by summing the first n odd integers.

import java.util.*;

class Square
{
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int n = stdin.nextInt();
		int squared_1 = iterativeSquare(n);
		System.out.println("Iterative square = " + squared_1);
		int squared_2 = recursiveSquare(n);
		System.out.println("Recursive square = " + squared_2);
	}
	private static int iterativeSquare(int n)
	{
		int sum = 0;
		for (int i = 1; i <= n; i++)
			sum += 2 * i-1;
		return sum;
	}
	private static int recursiveSquare(int n)
	{
		if (n == 1)
			return 1;
		return recursiveSquare(n - 1) + (2 * n - 1);
	}
}
