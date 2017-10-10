// CMIS 242 
// Duane J. Jarc
// June 30, 2015
// Week 7 Examples

// This class defines a generic stack implemented with a singly linked list of 
// objects. It implements the StackInterface. No checks are made for underflow or overflow.

package stacks;

class LinkedStack<T> implements StackInterface<T>
{
	private static class Node<T>
	{
		T data;
		Node previous;
	}
	private Node<T> top;

    @Override
	public void push(T item)
	{
		Node newTop = new Node();
		newTop.data = item;
		newTop.previous = top;
		top = newTop;
	}
    @Override
	public T pop()
	{
		if (top == null)
			return null;
		T item = top.data;
		top = top.previous;
		return item;
	}
    @Override
	public boolean isEmpty()
	{
		return top == null;
	}
}
