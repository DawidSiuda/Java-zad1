package package1;

import java.util.List;
//<T>
/**
 * @author Dawid
 *
 */
public abstract class AbstractFloatSorter extends  AbstractIntSorter
{
	/**
	 * @param list List elements to sort.
	 * @return List List of sorted elements.
	 */
	public abstract List<IElement> solve2(List<IElement> list);
}
