package package1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Dawid
 *
 */
public class IntSorter extends AbstractIntSorter
{
	/**
	 * @see package1.AbstractIntSorter#solve(java.util.List)
	 */
	@Override
	public List<IntElement> solve(List<IntElement> list)
	{
		//IntElement[] array = list.toArray(new IntElement[list.size()]);
		int[] array = new int[list.size()];

		int i =0;
		for (IntElement var : list)
		{
			array[i++] = var.getValue();
		}

		//printArray(array);

		quickSort(array, 0, list.size()-1);

		//printArray(array);

		List<IntElement> outList = new ArrayList<IntElement>();

		for(int x: array)
		{
			IntElement intElement = new IntElement(x);
			outList.add(intElement);
		}

		return outList;
	}

	/**
	 * @see package1.AbstractIntSorter#description()
	 */
	@Override
	public String description() {
		return "IntSorter";
	}

	/**
	 * @see package1.AbstractIntSorter#isStable()
	 */
	@Override
	public Boolean isStable() {
		return true;
	}

	/**
	 * @see package1.AbstractIntSorter#isInSitu()
	 */
	@Override
	public Boolean isInSitu() {
		return true;
	}

	void quickSort(int arr[], int low, int high)
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

	int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than the pivot
            if (arr[j] < pivot)
            {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    /**
     * Print list of IntElement.
     * @param arr list of IntElement
     */
    private static void printArray(IntElement[] arr)
    {
    	// Print list
		int line = 15;
		System.out.println("\n\n");
		for (IntElement var : arr)
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

    /**
     * Print array of int
     * @param arr Array of int
     */
    private static void printArray(int[] arr)
    {
    	// Print list
		int line = 15;
		System.out.println("\n\n");
		for (int var : arr)
		{

		    System.out.print(var + "  ");
		    line--;
		    if(line <=0)
		    {
		    	System.out.println("");
		    	line = 15;
		    }
		}
    }

}
