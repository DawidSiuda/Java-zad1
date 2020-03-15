package package1;

/**
 * @author Dawid
 *
 */
public class FloatElement implements IElement<Float> {

	/**
	 *  Constructor.
	 */
	FloatElement()
	{
		name = "name";
		value = (float) 0;
	}
	/**
	 * Constructor with initialize value.
	 * @param aval
	 */
	FloatElement(Float aval)
	{
		name = "name";
		value = aval;
	}
	/**
	 * @see package1.IElement#getName()
	 */
	public String getName() {
		return name;
	}

	/**
	 * @see package1.IElement#getValue()
	 */
	public Float getValue() {
		return value;
	}

	/**
	 * String pool.
	 */
	private String name;

	/**
	 * Main value of class.
	 */
	private Float value;
}
