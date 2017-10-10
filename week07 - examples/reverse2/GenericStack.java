// CMIS 242 
// Duane J. Jarc
// June 30, 2015
// Week 7 Examples

// This class defines a generic stack implemented with an array of objects.
// No checks are made for underflow or overflow.

package reverse2;

class GenericStack<T>
{
	private T[] stack = (T[]) new Object[200];
	private int top = 0;
  
	public void push(T item)
	{
		stack[top++] = item;
	}
	public T pop()
	{
		return stack[--top];
	}
	public boolean isEmpty()
	{
		return top == 0;
	}
}