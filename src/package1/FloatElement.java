package package1;

/**
 * @author Dawid
 *
 */
public class FloatElement implements IElement<Float> {

	/**
	 *  Constructor.
	 */
	public FloatElement()
	{
		name = "name";
		value = (float) 0;
	}
	/**
	 * Constructor with initialize value.
	 * @param aval initialize main value
	 */
	public FloatElement(Float aval)
	{
		name = "name";
		value = aval;
	}

	public FloatElement(Float aval, String aString)
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

	/**
	 * @param second second number;
	 * @return -1 if the is smaller, 0 if equal, 1 if is greater.
	 */
	@Override
	public int compare(Float second)
	{
		if (this.getValue() > second)
		{
			return -1;
		}
		else if (this.getValue() == second)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
}
