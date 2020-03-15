package package1;

import java.util.List;

/**
 * @author Dawid
 *
 */
public abstract class AbstractIntSorter 
{
	/**
	 * @param list List of Integer to sort.
     * @return List<IntElement> List of sorted elements.
	 */
	public abstract List<IntElement> solve(List<IntElement> list);
	
	/**
	 * @return String Description of used algorithm.
	 */
	public abstract  String description();
	
	/**
	 * @return Boolean Information if algorithm is stable.
	 */
	public abstract Boolean isStable();
	
	/**
	 * @return Boolean Information if algorithm sort without create new array.
	 */
	public abstract Boolean isInSitu();
}
