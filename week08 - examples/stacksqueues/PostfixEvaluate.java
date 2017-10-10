// CMIS 242 
// Duane J. Jarc
// July 7, 2015
// Week 8 Examples

// This program evaluates a postfix expression with the explicit
// use of a stack. Operands are pushed onto the stack. Operators cause two
// operands to be popped, evaluated and the result pushed back on.

package stacksqueues;

import java.util.*;

public class PostfixEvaluate
{
	private static Scanner stdin = new Scanner(System.in);

	public static void main(String[] args)
	{
		Stack<Integer> stack = new Stack();
		StringTokenizer tokenizer;
		String expression, token;
		
		System.out.print("Enter a postfix expression: ");
		expression = stdin.nextLine();
		tokenizer = new StringTokenizer(expression, " +-*/", true);
		while (tokenizer.hasMoreTokens())
		{
			token = tokenizer.nextToken();
			if (Character.isDigit(token.charAt(0)))
				stack.push(Integer.parseInt(token));
			else if (!token.equals(" "))
				evaluate(stack, token);
		}
		System.out.println("The result = " + stack.pop());
	}
	private static void evaluate(Stack<Integer> stack, String token)
	{
		int result = 0, right = stack.pop(), left = stack.pop();
		char operation = token.charAt(0);

		switch (operation)
		{
			case '+':
				result = left + right;
				break;
			case '-':
				result = left - right;
				break;
			case '*':
				result = left * right;
				break;
			case '/':
				result = left / right;
				break;
			case '%':
				result = left % right;
				break;
		}
		stack.push(result);
	}
}