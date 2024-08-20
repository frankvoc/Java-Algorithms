package MergeSorting.src;

public class Driver {
    public static void main(String args[])
	{
		int arr[] = {-123,415,13,-981,1002};		//Sample data

		System.out.println("Given Array");		//Print array before Merge Sort
		MergeSort.printArray(arr);

		MergeSort temp = new MergeSort();		//Create object instance
		temp.sort(arr, 0, arr.length-1);		//Sort the array using Merge Sort

		System.out.println("\nSorted array");	//Print array after Merge Sort
		MergeSort.printArray(arr);
	}
}
