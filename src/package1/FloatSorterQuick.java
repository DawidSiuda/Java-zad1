package package1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dawid
 * Quick sorter with parameterized type of sorting list
 */
public class FloatSorterQuick extends AbstractFloatSorter {
	/**
	 * @see package1.AbstractIntSorter#solve(java.util.List)
	 * Sorting function.
	 * @param list List of Integer to sort.
     * @return List<IntElement> List of sorted elements.
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
     * @return List<IElement> List of sorted elements.
	 */
	@Override
	public List<IElement> solve2(List<IElement> list)
	{
		//IntElement[] array = list.toArray(new IntElement[list.size()]);
		IElement[] array = list.toArray(new IElement[list.size()]);

//		int i =0;
//		for (IntElement var : list)
//		{
//			array[i++] = var.getValue();
//		}

		//printArray(array);

		quickSort(array, 0, list.size()-1);

		//printArray(array);

		List<IntElement> outList = new ArrayList<IntElement>();

//		for(int x: array)
//		{
//			IntElement intElement = new IntElement(x);
//			outList.add(intElement);
//		}

		return list;
	}

	void quickSort(IElement arr[], int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition(arr, low, high);

            //printArray(arr);

            // Recursively sort elements before
            // partition and after partition
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }

	int partition(IElement arr[], int low, int high)
    {
		IElement pivot = arr[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than the pivot

//        	Object a = arr[j].getValue();
//        	Object b = pivot.getValue();

            if (arr[j].getValue() < pivot.getValue())
            {
                i++;

                // swap arr[i] and arr[j]
                IElement temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        IElement temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
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
