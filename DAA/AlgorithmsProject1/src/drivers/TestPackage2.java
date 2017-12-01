package drivers;

import java.util.List;

import algorithms.BSTSort;
import algorithms.BubbleSort;
import algorithms.HeapSort;
import algorithms.InsertionSort;
import algorithms.JavaSort;
import algorithms.MergeSort;
import algorithms.ModifiedMergeSort;
import algorithms.ModifiedMergeSort2;
import algorithms.QuickSort;
import utility.AlgorithmUtilities;

public class TestPackage2 {

	public static void main(String[] args) 
	{
		AlgorithmUtilities.clearResults();
		/*
		 * BEGIN INSERTIONSORT
		 */				
		AlgorithmUtilities.writeToResults("Insertion Sort");
		AlgorithmUtilities.writeNewLine();		
		runInsertionSort(1000);
		runInsertionSort(10000);
		runInsertionSort(100000);
		
		AlgorithmUtilities.writeToResults("Already Sorted");
		AlgorithmUtilities.writeNewLine();		
		runInsertionAlreadySort(1000);
		runInsertionAlreadySort(10000);
		runInsertionAlreadySort(100000);	
		
		AlgorithmUtilities.writeToResults("Half Sorted");
		AlgorithmUtilities.writeNewLine();		
		runInsertionHalfSort(1000);
		runInsertionHalfSort(10000);
		runInsertionHalfSort(100000);
		/*
		 * END INSERTIONSORT
		 */
		
		/*
		 * BEGIN MODIFIED MERGESORT (BUBBLESORT)
		 */		
		// 7 ELEMENTS
		AlgorithmUtilities.writeToResults("Modified Merge Sort: 7");
		AlgorithmUtilities.writeNewLine();		
		runModifiedMergeSort(1000, 7);
		runModifiedMergeSort(10000, 7);
		runModifiedMergeSort(100000, 7);
		runModifiedMergeSort(1000000, 7);
		
		AlgorithmUtilities.writeToResults("Already Sorted");
		AlgorithmUtilities.writeNewLine();		
		runModifiedMergeAlreadySort(1000, 7);
		runModifiedMergeAlreadySort(10000, 7);
		runModifiedMergeAlreadySort(100000, 7);	
		runModifiedMergeAlreadySort(1000000, 7);

		AlgorithmUtilities.writeToResults("Half Sorted");
		AlgorithmUtilities.writeNewLine();		
		runModifiedMergeHalfSort(1000, 7);
		runModifiedMergeHalfSort(10000, 7);
		runModifiedMergeHalfSort(100000, 7);
		runModifiedMergeHalfSort(1000000, 7);
		
		// 8 ELEMENTS
		AlgorithmUtilities.writeToResults("Modified Merge Sort: 8");
		AlgorithmUtilities.writeNewLine();		
		runModifiedMergeSort(1000, 8);
		runModifiedMergeSort(10000, 8);
		runModifiedMergeSort(100000, 8);
		runModifiedMergeSort(1000000, 8);
		
		AlgorithmUtilities.writeToResults("Already Sorted");
		AlgorithmUtilities.writeNewLine();		
		runModifiedMergeAlreadySort(1000, 8);
		runModifiedMergeAlreadySort(10000, 8);
		runModifiedMergeAlreadySort(100000, 8);	
		runModifiedMergeAlreadySort(1000000, 8);

		AlgorithmUtilities.writeToResults("Half Sorted");
		AlgorithmUtilities.writeNewLine();		
		runModifiedMergeHalfSort(1000, 8);
		runModifiedMergeHalfSort(10000, 8);
		runModifiedMergeHalfSort(100000, 8);
		runModifiedMergeHalfSort(1000000, 8);
		/*
		 * END MODIFIED MERGESORT
		 */
		
		/*
		 * BEGIN MODIFIED MERGESORT (INSERTIONSORT)
		 */		
		// 7 ELEMENTS
		AlgorithmUtilities.writeToResults("Modified Merge Sort 2: 7");
		AlgorithmUtilities.writeNewLine();		
		runModifiedMergeSort2(1000, 7);
		runModifiedMergeSort2(10000, 7);
		runModifiedMergeSort2(100000, 7);
		runModifiedMergeSort2(1000000, 7);
		
		AlgorithmUtilities.writeToResults("Already Sorted");
		AlgorithmUtilities.writeNewLine();		
		runModifiedMergeAlreadySort2(1000, 7);
		runModifiedMergeAlreadySort2(10000, 7);
		runModifiedMergeAlreadySort2(100000, 7);	
		runModifiedMergeAlreadySort2(1000000, 7);

		AlgorithmUtilities.writeToResults("Half Sorted");
		AlgorithmUtilities.writeNewLine();		
		runModifiedMergeHalfSort2(1000, 7);
		runModifiedMergeHalfSort2(10000, 7);
		runModifiedMergeHalfSort2(100000, 7);
		runModifiedMergeHalfSort2(1000000, 7);
		
		// 8 ELEMENTS
		AlgorithmUtilities.writeToResults("Modified Merge Sort 2: 8");
		AlgorithmUtilities.writeNewLine();		
		runModifiedMergeSort2(1000, 8);
		runModifiedMergeSort2(10000, 8);
		runModifiedMergeSort2(100000, 8);
		runModifiedMergeSort2(1000000, 8);
		
		AlgorithmUtilities.writeToResults("Already Sorted");
		AlgorithmUtilities.writeNewLine();		
		runModifiedMergeAlreadySort2(1000, 8);
		runModifiedMergeAlreadySort2(10000, 8);
		runModifiedMergeAlreadySort2(100000, 8);	
		runModifiedMergeAlreadySort2(1000000, 8);

		AlgorithmUtilities.writeToResults("Half Sorted");
		AlgorithmUtilities.writeNewLine();		
		runModifiedMergeHalfSort2(1000, 8);
		runModifiedMergeHalfSort2(10000, 8);
		runModifiedMergeHalfSort2(100000, 8);
		runModifiedMergeHalfSort2(1000000, 8);
		/*
		 * END MODIFIED MERGESORT
		 */
		
		/*
		 * BEGIN QUICKSORT
		 */		
		// Not randomized
		AlgorithmUtilities.writeToResults("Quick Sort: Not Randomized");
		AlgorithmUtilities.writeNewLine();
		runQuickSort(1000, false);
		runQuickSort(10000, false);
		runQuickSort(100000, false);	
		runQuickSort(1000000, false);
		
		AlgorithmUtilities.writeToResults("Already Sorted");
		AlgorithmUtilities.writeNewLine();
		runQuickAlreadySort(1000, false);
		runQuickAlreadySort(10000, false);
		//runQuickAlreadySort(100000, false); Note: Did not run

		AlgorithmUtilities.writeToResults("Half Sorted");
		AlgorithmUtilities.writeNewLine();
		runQuickHalfSort(1000, false);
		runQuickHalfSort(10000, false);
		runQuickHalfSort(100000, false);	
		
		// Randomized
		AlgorithmUtilities.writeToResults("Quick Sort: Randomized");
		AlgorithmUtilities.writeNewLine();
		runQuickSort(1000, true);
		runQuickSort(10000, true);
		runQuickSort(100000, true);	
		runQuickSort(1000000, true);
		
		AlgorithmUtilities.writeToResults("Already Sorted");
		AlgorithmUtilities.writeNewLine();
		runQuickAlreadySort(1000, true);
		runQuickAlreadySort(10000, true);
		runQuickAlreadySort(100000, true);
		runQuickAlreadySort(1000000, true);

		AlgorithmUtilities.writeToResults("Half Sorted");
		AlgorithmUtilities.writeNewLine();
		runQuickHalfSort(1000, true);
		runQuickHalfSort(10000, true);
		runQuickHalfSort(100000, true);	
		runQuickHalfSort(1000000, true);	
		/*
		 * END QUICKSORT
		 */
		
		System.out.print("Execution finished!"); //This is just so I could tell it actually finished
	}
	
	private static void runModifiedMergeSort(int numOfElements, int numToSwitch) {
		List<Integer> array = AlgorithmUtilities.fillArray(numOfElements);
		ModifiedMergeSort mergeSort = new ModifiedMergeSort(numToSwitch);
		
		long t0 = AlgorithmUtilities.getCurrentTime();
		mergeSort.sort(array);
		long t1 = AlgorithmUtilities.getCurrentTime();
		long time = t1 - t0;
		
		AlgorithmUtilities.writeToResults("Is array sorted? " + AlgorithmUtilities.isSorted(array));
    	AlgorithmUtilities.writeToResults("Number of elements: " + array.size());
		AlgorithmUtilities.writeToResults("Time to execute: " + (double)time / 1000000000.0);
		AlgorithmUtilities.writeNewLine();
	}
	
	private static void runModifiedMergeAlreadySort(int numOfElements,int numToSwitch) {
		List<Integer> array = AlgorithmUtilities.fillArray(numOfElements);
		ModifiedMergeSort mergeSort = new ModifiedMergeSort(numToSwitch);
		
		mergeSort.sort(array);
		long t0 = AlgorithmUtilities.getCurrentTime();
		mergeSort.sort(array);
		long t1 = AlgorithmUtilities.getCurrentTime();
		long time = t1 - t0;
		
		AlgorithmUtilities.writeToResults("Is array sorted? " + AlgorithmUtilities.isSorted(array));
    	AlgorithmUtilities.writeToResults("Number of elements: " + array.size());
		AlgorithmUtilities.writeToResults("Time to execute: " + (double)time / 1000000000.0);
		AlgorithmUtilities.writeNewLine();
	}
	
	private static void runModifiedMergeHalfSort(int numOfElements, int numToSwitch) {
		List<Integer> array = AlgorithmUtilities.fillArray(numOfElements);		
		ModifiedMergeSort mergeSort = new ModifiedMergeSort(numToSwitch);
		
		mergeSort.sort(array.subList(0, array.size()/2));		
		long t0 = AlgorithmUtilities.getCurrentTime();
		mergeSort.sort(array);
		long t1 = AlgorithmUtilities.getCurrentTime();
		long time = t1 - t0;
		
		AlgorithmUtilities.writeToResults("Is array sorted? " + AlgorithmUtilities.isSorted(array));
    	AlgorithmUtilities.writeToResults("Number of elements: " + array.size());
		AlgorithmUtilities.writeToResults("Time to execute: " + (double)time / 1000000000.0);
		AlgorithmUtilities.writeNewLine();
	}
	
	private static void runModifiedMergeSort2(int numOfElements, int numToSwitch) {
		List<Integer> array = AlgorithmUtilities.fillArray(numOfElements);
		ModifiedMergeSort2 mergeSort = new ModifiedMergeSort2(numToSwitch);
		
		long t0 = AlgorithmUtilities.getCurrentTime();
		mergeSort.sort(array);
		long t1 = AlgorithmUtilities.getCurrentTime();
		long time = t1 - t0;
		
		AlgorithmUtilities.writeToResults("Is array sorted? " + AlgorithmUtilities.isSorted(array));
    	AlgorithmUtilities.writeToResults("Number of elements: " + array.size());
		AlgorithmUtilities.writeToResults("Time to execute: " + (double)time / 1000000000.0);
		AlgorithmUtilities.writeNewLine();
	}
	
	private static void runModifiedMergeAlreadySort2(int numOfElements,int numToSwitch) {
		List<Integer> array = AlgorithmUtilities.fillArray(numOfElements);
		ModifiedMergeSort2 mergeSort = new ModifiedMergeSort2(numToSwitch);
		
		mergeSort.sort(array);
		long t0 = AlgorithmUtilities.getCurrentTime();
		mergeSort.sort(array);
		long t1 = AlgorithmUtilities.getCurrentTime();
		long time = t1 - t0;
		
		AlgorithmUtilities.writeToResults("Is array sorted? " + AlgorithmUtilities.isSorted(array));
    	AlgorithmUtilities.writeToResults("Number of elements: " + array.size());
		AlgorithmUtilities.writeToResults("Time to execute: " + (double)time / 1000000000.0);
		AlgorithmUtilities.writeNewLine();
	}
	
	private static void runModifiedMergeHalfSort2(int numOfElements, int numToSwitch) {
		List<Integer> array = AlgorithmUtilities.fillArray(numOfElements);		
		ModifiedMergeSort2 mergeSort = new ModifiedMergeSort2(numToSwitch);
		
		mergeSort.sort(array.subList(0, array.size()/2));		
		long t0 = AlgorithmUtilities.getCurrentTime();
		mergeSort.sort(array);
		long t1 = AlgorithmUtilities.getCurrentTime();
		long time = t1 - t0;
		
		AlgorithmUtilities.writeToResults("Is array sorted? " + AlgorithmUtilities.isSorted(array));
    	AlgorithmUtilities.writeToResults("Number of elements: " + array.size());
		AlgorithmUtilities.writeToResults("Time to execute: " + (double)time / 1000000000.0);
		AlgorithmUtilities.writeNewLine();
	}
	
	private static void runInsertionSort(int numOfElements) {
		List<Integer> array = AlgorithmUtilities.fillArray(numOfElements);
		InsertionSort insertionSort = new InsertionSort();
		
		long t0 = AlgorithmUtilities.getCurrentTime();
		insertionSort.sort(array);
		long t1 = AlgorithmUtilities.getCurrentTime();
		long time = t1 - t0;
		
		AlgorithmUtilities.writeToResults("Is array sorted? " + AlgorithmUtilities.isSorted(array));
    	AlgorithmUtilities.writeToResults("Number of elements: " + array.size());
		AlgorithmUtilities.writeToResults("Time to execute: " + (double)time / 1000000000.0);
		AlgorithmUtilities.writeNewLine();
	}
	
	private static void runInsertionAlreadySort(int numOfElements) {
		List<Integer> array = AlgorithmUtilities.fillArray(numOfElements);
		InsertionSort insertionSort = new InsertionSort();
		
		insertionSort.sort(array);
		long t0 = AlgorithmUtilities.getCurrentTime();
		insertionSort.sort(array);
		long t1 = AlgorithmUtilities.getCurrentTime();
		long time = t1 - t0;
		
		AlgorithmUtilities.writeToResults("Is array sorted? " + AlgorithmUtilities.isSorted(array));
    	AlgorithmUtilities.writeToResults("Number of elements: " + array.size());
		AlgorithmUtilities.writeToResults("Time to execute: " + (double)time / 1000000000.0);
		AlgorithmUtilities.writeNewLine();
	}
	
	private static void runInsertionHalfSort(int numOfElements) {
		List<Integer> array = AlgorithmUtilities.fillArray(numOfElements);		
		InsertionSort insertionSort = new InsertionSort();
		
		insertionSort.sort(array.subList(0, array.size()/2));		
		long t0 = AlgorithmUtilities.getCurrentTime();
		insertionSort.sort(array);
		long t1 = AlgorithmUtilities.getCurrentTime();
		long time = t1 - t0;
		
		AlgorithmUtilities.writeToResults("Is array sorted? " + AlgorithmUtilities.isSorted(array));
    	AlgorithmUtilities.writeToResults("Number of elements: " + array.size());
		AlgorithmUtilities.writeToResults("Time to execute: " + (double)time / 1000000000.0);
		AlgorithmUtilities.writeNewLine();
	}
	
	private static void runQuickSort(int numOfElements, boolean randomized) {
		List<Integer> array = AlgorithmUtilities.fillArray(numOfElements);
		QuickSort quickSort = new QuickSort(randomized);
		
		long t0 = AlgorithmUtilities.getCurrentTime();
		quickSort.sort(array);
		long t1 = AlgorithmUtilities.getCurrentTime();
		long time = t1 - t0;
		
		AlgorithmUtilities.writeToResults("Is array sorted? " + AlgorithmUtilities.isSorted(array));
    	AlgorithmUtilities.writeToResults("Number of elements: " + array.size());
		AlgorithmUtilities.writeToResults("Time to execute: " + (double)time / 1000000000.0);
		AlgorithmUtilities.writeNewLine();
	}
	
	private static void runQuickAlreadySort(int numOfElements, boolean randomized) {
		List<Integer> array = AlgorithmUtilities.fillArray(numOfElements);
		QuickSort quickSort = new QuickSort(randomized);
		
		quickSort.sort(array);
		long t0 = AlgorithmUtilities.getCurrentTime();
		quickSort.sort(array);
		long t1 = AlgorithmUtilities.getCurrentTime();
		long time = t1 - t0;
		
		AlgorithmUtilities.writeToResults("Is array sorted? " + AlgorithmUtilities.isSorted(array));
    	AlgorithmUtilities.writeToResults("Number of elements: " + array.size());
		AlgorithmUtilities.writeToResults("Time to execute: " + (double)time / 1000000000.0);
		AlgorithmUtilities.writeNewLine();
	}
	
	private static void runQuickHalfSort(int numOfElements, boolean randomized) {
		List<Integer> array = AlgorithmUtilities.fillArray(numOfElements);		
		QuickSort quickSort = new QuickSort(randomized);
		
		quickSort.sort(array.subList(0, array.size()/2));		
		long t0 = AlgorithmUtilities.getCurrentTime();
		quickSort.sort(array);
		long t1 = AlgorithmUtilities.getCurrentTime();
		long time = t1 - t0;
		
		AlgorithmUtilities.writeToResults("Is array sorted? " + AlgorithmUtilities.isSorted(array));
    	AlgorithmUtilities.writeToResults("Number of elements: " + array.size());
		AlgorithmUtilities.writeToResults("Time to execute: " + (double)time / 1000000000.0);
		AlgorithmUtilities.writeNewLine();
	}
}
