// CMIS 242 
// Duane J. Jarc
// June 30, 2015
// Week 7 Examples

// This class defines a generic stack implemented with an array of objects
// that implements the StackInterface. No checks are made for underflow or overflow.

package stacks;

class ArrayStack<T> implements StackInterface<T>
{
	private T[] stack = (T[]) new Object[200];
	private int top = 0;
  
    @Override
	public void push(T item)
	{
		stack[top++] = item;
	}
    @Override
	public T pop()
	{
		return stack[--top];
	}
    @Override
	public boolean isEmpty()
	{
		return top == 0;
	}
}