// CMIS 242 
// Duane J. Jarc
// June 30, 2015
// Week 7 Examples

// This interface defines a generic stack that requires push, pop and isEmpty
// methods.

package stacks;

interface StackInterface<T>
{
	void push(T item);
	T pop();
	boolean isEmpty();
}