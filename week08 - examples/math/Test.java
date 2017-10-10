// CMIS 242 
// Duane J. Jarc
// July 7, 2015
// Week 8 Examples

// This program contains a main driver method to test the MathSet class.
// It also includes a method to form a set from an array of integers.

package math;

class Test
{
	public static void main(String[] args)
	{
		int[] list1 = {1, 4, 7, 3, 1}, list2 = {4, 6, 5, 6, 1};
		
		MathSet<Integer> set1, set2, set3;
		set1 = makeSet(list1);
		set2 = makeSet(list2);
		set3 = set1.union(set2);
		System.out.println(set3);
		set3 = set1.intersect(set2);
		System.out.println(set3);
	}
	private static MathSet<Integer> makeSet(int[] list)
	{
		MathSet<Integer> result =  new MathSet();
		for (int value: list)
			result.add(value);
		return result;
	}
}