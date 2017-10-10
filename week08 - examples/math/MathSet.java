// CMIS 242 
// Duane J. Jarc
// July 7, 2015
// Week 8 Examples

// This class extends the HashSet by including the math set operations of
// union and intersection.

package math;

import java.util.*;

class MathSet<T> extends HashSet<T>
{
	public MathSet<T> union(MathSet<T> right)
	{
		MathSet<T> result = new MathSet();
		for (T element: this)
			result.add(element);
		for (T element: right)
			result.add(element);
		return result;
	}
	public MathSet<T> intersect(MathSet<T> right)
	{
		MathSet<T> result = new MathSet();
		for (T element: this)
			if (right.contains(element))
				result.add(element);
		return result;
	}
}