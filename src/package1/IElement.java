package package1;

/**
 * @author Dawid
 *
 * @param <T> Type of containing value.
 */
public interface IElement<T extends Number> {

	/**
	 * @return String Name of element.
	 */
	public String getName();
	/**
	 * @return Object Return value of element.
	 */
	public T getValue();

	/**
	 * @param first number
	 * @param second second number;
	 * @return -1 if the is smaller, 0 if equal, 1 if is greater.
	 */
	public int compare(T second);
}
