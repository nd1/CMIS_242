// CMIS 242 
// Duane J. Jarc
// June 30, 2015
// Week 7 Examples

// This class defines a nongeneric stack implemented with an array of objects.
// No checks are made for underflow or overflow.

package reverse1;

class ObjectStack
{
	private Object[] stack = new Object[200];
	private int top = 0;
  
	public void push(Object item)
	{
		stack[top++] = item;
	}
	public Object pop()
	{
		return stack[--top];
	}
	public boolean isEmpty()
	{
		return top == 0;
	}
}