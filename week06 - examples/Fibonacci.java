// CMIS 242 
// Duane J. Jarc
// June 23, 2015
// Week 6 Examples

// This class contains both an iterative and recursive version of a method that
// computes the nth Fibonacci number. The recursive version is much less efficient
// than the iterative one.

import java.util.*;

class Fibonacci
{
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int n = stdin.nextInt();
		int fibonacci_1 = iterativeFibonacci(n);
		System.out.println("Iterative Fibonacci = " + fibonacci_1);
		int fibonacci_2 = recursiveFibonacci(n);
		System.out.println("Recursive Fibonacci = " + fibonacci_2);
	}
	private static int iterativeFibonacci(int n)
	{
		int previous = 0, current = 1, next;
		for (int i = 1; i <= n; i++)
		{
			next = previous + current;
			previous = current;
			current = next;
		}
		return previous;
	}
	private static int recursiveFibonacci(int n)
	{
		if (n <= 1)
			return n;
		return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
	}
}
