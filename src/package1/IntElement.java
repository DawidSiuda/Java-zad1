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
}
