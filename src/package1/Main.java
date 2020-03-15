package package1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Dawid
 * Entry point for tests.
 */
public class Main {
	/**
	 * Main function.s
	 * @param args
	 */
	static public void main(String[] args)
	{
//		IntElement intElem = new IntElement();

//		System.out.print("Hello world");

		List<IElement> list = new ArrayList<IElement>();
		Random rand = new Random();

//		// Set list.
//		for (int i = 0; i< 100; i++)
//		{
//			IntElement intElement = new IntElement(rand.nextInt(10000));
//			list.add(intElement);
//		}

		// Set list.
		int dtemp = 10;
		for (int i = 0; i< 10; i++)
		{
			//IntElement intElement = new IntElement(dtemp--);
			IntElement intElement = new IntElement(rand.nextInt(10000));
			list.add(intElement);
		}


		// Print list
		int line = 15;
		for (IElement var : list)
		{

		    System.out.print(var.getValue() + "  ");
		    line--;
		    if(line <=0)
		    {
		    	System.out.println("");
		    	line = 15;
		    }
		}

		// Sort list.

//		IntSorter intSorter = new IntSorter();
//
//		list = intSorter.solve(list);

		FloatSorterQuick intSorter = new FloatSorterQuick();

		list = intSorter.solve2(list);


		// print sorted list.

		// Print list
		line = 15;
		System.out.println("\n\n");
		for (IElement var : list)
		{

		    System.out.print(var.getValue() + "  ");
		    line--;
		    if(line <=0)
		    {
		    	System.out.println("");
		    	line = 15;
		    }
		}

	}
}
