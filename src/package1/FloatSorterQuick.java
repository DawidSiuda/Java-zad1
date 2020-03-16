//package package1;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static java.util.Collections.swap;
//
///**
// * @author Dawid
// * Quick sorter with parameterized type of sorting list
// */
//public class FloatSorterQuick extends AbstractFloatSorter {
//	/**
//	 * @see package1.AbstractIntSorter#solve(java.util.List)
//	 * Sorting function.
//	 * @param list List of Integer to sort.
//     * @return List<IntElement> List of sorted elements.
//	 */
//	@Override
//	public List<IntElement> solve(List<IntElement> list) {
//		// TODO Auto-generated method stub
//		return list;
//	}
//
//	/**
//	 * @see package1.AbstractFloatSorter#solve(java.util.List)
//	 * Sorting function.
//	 * @param list List of variables to sort
//     * @return List<IElement> List of sorted elements.
//	 */
//	@Override
//	public List<IElement> solve2(List<IElement> list)
//	{
//
//		quickSort(list, 0, list.size()-1);
//
//		return list;
//	}
//
//	void quickSort(List<IElement> arr, int low, int high)
//    {
//        if (low < high)
//        {
//            int pi = partition(arr, low, high);
//
//            quickSort(arr, low, pi-1);
//            quickSort(arr, pi+1, high);
//        }
//    }
//
//	int partition(List<IElement> arr, int low, int high)
//    {
//		IElement pivot = arr.get(high);
//        int i = (low-1);
//        for (int j=low; j<high; j++)
//        {
//            if (arr.get(j).equals(pivot))
//            {
//                i++;
//                swap(arr, i, j);
//            }
//        }
//
//        swap(arr, i+1, high);
//
//        return i+1;
//    }
//
//	/**
//	 * @see package1.AbstractFloatSorter#description()
//	 * @return String Description of used algorithm.
//	 */
//	@Override
//	public String description() {
//		return "FloatSorter-quick sort";
//	}
//
//	/**
//	 * @see package1.AbstractFloatSorter#isStable()
//	 * @return Boolean Information if algorithm is stable.
//	 */
//	@Override
//	public Boolean isStable() {
//		return true;
//	}
//
//	/**
//	 * @see package1.AbstractFloatSorter#isInSitu()
//	 * @return Boolean Information if algorithm sort without create new array.
//	 */
//	@Override
//	public Boolean isInSitu() {
//		return false;
//	}
//}

package package1;

import java.util.ArrayList;
import java.util.Arrays;
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
     * @return List&lt;IntElement&gt; List of sorted elements.
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
     * @return List&lt;IElement&gt; List of sorted elements.
	 */
	@Override
	public List<IElement> solve2(List<IElement> list)
	{
		IElement[] array = list.toArray(new IElement[list.size()]);

		quickSort(array, 0, list.size()-1);

		List<IElement> outList = Arrays.asList(array);

		return outList;
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


	private void quickSort(IElement arr[], int low, int high)
    {
        if (low < high)
        {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }

	private int partition(IElement arr[], int low, int high)
    {
		IElement pivot = arr[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
        	if (arr[j].compare(pivot.getValue()) == -1)
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
}
