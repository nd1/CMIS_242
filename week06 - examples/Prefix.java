// CMIS 242 
// Duane J. Jarc
// June 23, 2015
// Week 6 Examples

// This class contains a recursive method that evaluates a prefix expression.
// This problem is an excellent use of recursion because if solved with
// iteration would require the use of a stack.

import java.util.*;

class Prefix
{
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter a prefix expression: ");
		String expression = stdin.nextLine();
		int result = prefixEvaluate(new StringTokenizer(expression, "+-*/ ", true));
		System.out.println(expression + " = " + result);

	}
	private static int prefixEvaluate(StringTokenizer tokenizer)
	{
		String token;
		do
		{
			token = tokenizer.nextToken();
		}
		while (token.equals(" "));
		if (Character.isDigit(token.charAt(0)))
			return Integer.parseInt(token);
		int left = prefixEvaluate(tokenizer);
		int right = prefixEvaluate(tokenizer);
		switch (token.charAt(0))
		{
			case '+':
				return left + right;
			case '-':
				return left - right;
			case '*':
				return left * right;
			case '/':
				return left / right;
		}
		return 0;
	}
}
