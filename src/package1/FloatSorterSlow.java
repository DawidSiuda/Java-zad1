package package1;

import java.util.List;

public class FloatSorterSlow extends AbstractFloatSorter {
	/**
	 * @see package1.AbstractIntSorter#solve(java.util.List)
	 * Sorting function.
	 * @param list List of Integer to sort.
     * @return List&lt;IntElement&gt; List of sorted elements.
	 */
	@Override
	public List<IntElement> solve(List<IntElement> list) {
		// TODO Auto-generated method stub
		return list;
	}

	/**
	 * @see package1.AbstractFloatSorter#solve(java.util.List)
	 * Sorting function.
	 * @param list List of variables to sort
     * @return List&lt;IElement&gt; List of sorted elements.
	 */
	@Override
	public List<IElement> solve2(List<IElement> list) {
		// TODO Auto-generated method stub
		return list;
	}

	/**
	 * @see package1.AbstractFloatSorter#description()
	 * @return String Description of used algorithm.
	 */
	@Override
	public String description() {
		return "FloatSorter-quick sort";
	}

	/**
	 * @see package1.AbstractFloatSorter#isStable()
	 * @return Boolean Information if algorithm is stable.
	 */
	@Override
	public Boolean isStable() {
		return true;
	}

	/**
	 * @see package1.AbstractFloatSorter#isInSitu()
	 * @return Boolean Information if algorithm sort without create new array.
	 */
	@Override
	public Boolean isInSitu() {
		return false;
	}
}
