package package1;

/**
 * @author Dawid
 *
 */
public class IntElement implements IElement<Integer>
{
	/**
	 * Default constructor.
	 */
	public IntElement()
	{
		name = "name";
		value = 0;
	}
	/**
	 * Constructor with initialize Integer.
	 * @param aint Parameter to initialize value.
	 */
	public IntElement(int aint)
	{
		name = "name";
		value = aint;
	}
	/**
	 * @see package1.IElement#getName()
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * @see package1.IElement#getValue()
	 */
	public Integer getValue()
	{
		return value;
	}

	/**
	 *  Name of variable.
	 */
	String name;
	/**
	 *  Value.
	 */
	Integer value;

	/**
	 * @param second second number;
	 * @return -1 if the is smaller, 0 if equal, 1 if is greater.
	 */
	@Override
	public int compare(Integer second)
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
