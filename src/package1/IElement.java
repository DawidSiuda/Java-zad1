package package1;

/**
 * @author Dawid
 *
 * @param <T> Type of containing value.
 */
public interface IElement<T> {

	/**
	 * @return String Name of element.
	 */
	public String getName();
	/**
	 * @return Object Return value of element.
	 */
	public T getValue();
}
