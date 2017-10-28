package drivers;

import java.util.List;

import algorithms.BSTSort;
import algorithms.BubbleSort;
import algorithms.HeapSort;
import algorithms.JavaSort;
import algorithms.MergeSort;
import algorithms.ModifiedMergeSort;
import utility.AlgorithmUtilities;

public class TestPackage {

	public static void main(String[] args) 
	{
		AlgorithmUtilities.clearResults();
		/*
		 * BEGIN JAVASORT
		 */				
		AlgorithmUtilities.writeToResults("Java Sort");
		AlgorithmUtilities.writeNewLine();		
		runJavaSort(1000);
		runJavaSort(10000);
		runJavaSort(100000);
		runJavaSort(1000000);
		
		AlgorithmUtilities.writeToResults("Already Sorted");
		AlgorithmUtilities.writeNewLine();		
		runJavaAlreadySort(1000);
		runJavaAlreadySort(10000);
		runJavaAlreadySort(100000);		
		runJavaAlreadySort(1000000);	
		
		AlgorithmUtilities.writeToResults("Half Sorted");
		AlgorithmUtilities.writeNewLine();		
		runJavaHalfSort(1000);
		runJavaHalfSort(10000);
		runJavaHalfSort(100000);
		runJavaHalfSort(1000000);
		/*
		 * END JAVASORT
		 */
		
		/*
		 * BEGIN BUBBLESORT
		 */		
		AlgorithmUtilities.writeToResults("Bubble Sort");
		AlgorithmUtilities.writeNewLine();
		runBubbleSort(1000);
		runBubbleSort(10000);
		runBubbleSort(100000);
		//runBubbleSort(1000000);		
		
		AlgorithmUtilities.writeToResults("Already Sorted");
		AlgorithmUtilities.writeNewLine();
		runBubbleAlreadySort(1000);
		runBubbleAlreadySort(10000);
		runBubbleAlreadySort(100000);
		//runBubbleAlreadySort(1000000);				

		AlgorithmUtilities.writeToResults("Half Sorted");
		AlgorithmUtilities.writeNewLine();
		runBubbleHalfSort(1000);
		runBubbleHalfSort(10000);
		runBubbleHalfSort(100000);
		//runBubbleHalfSort(1000000);		
		/*
		 * END BUBBLESORT
		 */
		
		/*
		 * BEGIN BSTSORT
		 */		
		AlgorithmUtilities.writeToResults("BST Sort");
		AlgorithmUtilities.writeNewLine();		
		runBSTSort(1000);
		runBSTSort(10000);
		runBSTSort(100000);
		runBSTSort(1000000);
		
		AlgorithmUtilities.writeToResults("Already Sorted");
		AlgorithmUtilities.writeNewLine();		
		runBSTAlreadySort(1000);
		runBSTAlreadySort(10000);
		runBSTAlreadySort(100000);	
		//runBSTAlreadySort(1000000);	
		
		AlgorithmUtilities.writeToResults("Half Sorted");
		AlgorithmUtilities.writeNewLine();		
		runBSTHalfSort(1000);
		runBSTHalfSort(10000);
		runBSTHalfSort(100000);
		//runBSTHalfSort(1000000);
		/*
		 * END BSTSORT
		 */
		
		/*
		 * BEGIN MERGESORT
		 */		
		AlgorithmUtilities.writeToResults("Merge Sort");
		AlgorithmUtilities.writeNewLine();		
		runMergeSort(1000);
		runMergeSort(10000);
		runMergeSort(100000);
		runMergeSort(1000000);
		
		AlgorithmUtilities.writeToResults("Already Sorted");
		AlgorithmUtilities.writeNewLine();		
		runMergeAlreadySort(1000);
		runMergeAlreadySort(10000);
		runMergeAlreadySort(100000);	
		runMergeAlreadySort(1000000);

		AlgorithmUtilities.writeToResults("Half Sorted");
		AlgorithmUtilities.writeNewLine();		
		runMergeHalfSort(1000);
		runMergeHalfSort(10000);
		runMergeHalfSort(100000);
		runMergeHalfSort(1000000);
		/*
		 * END MERGESORT
		 */
		
		/*
		 * BEGIN HEAPSORT
		 */		
		AlgorithmUtilities.writeToResults("Heap Sort");
		AlgorithmUtilities.writeNewLine();
		runHeapSort(1000);
		runHeapSort(10000);
		runHeapSort(100000);	
		runHeapSort(1000000);
		
		AlgorithmUtilities.writeToResults("Already Sorted");
		AlgorithmUtilities.writeNewLine();
		runHeapAlreadySort(1000);
		runHeapAlreadySort(10000);
		runHeapAlreadySort(100000);
		runHeapAlreadySort(1000000);

		AlgorithmUtilities.writeToResults("Half Sorted");
		AlgorithmUtilities.writeNewLine();
		runHeapHalfSort(1000);
		runHeapHalfSort(10000);
		runHeapHalfSort(100000);	
		runHeapHalfSort(1000000);
		/*
		 * END HEAPSORT
		 */
		
		/*
		 * BEGIN MODIFIED MERGESORT
		 */		
		//10 ELEMENTS
		AlgorithmUtilities.writeToResults("Modified Merge Sort: 10");
		AlgorithmUtilities.writeNewLine();		
		runModifiedMergeSort(1000, 10);
		runModifiedMergeSort(10000, 10);
		runModifiedMergeSort(100000, 10);
		runModifiedMergeSort(1000000, 10);
		
		AlgorithmUtilities.writeToResults("Already Sorted");
		AlgorithmUtilities.writeNewLine();		
		runModifiedMergeAlreadySort(1000, 10);
		runModifiedMergeAlreadySort(10000, 10);
		runModifiedMergeAlreadySort(100000, 10);	
		runModifiedMergeAlreadySort(1000000, 10);

		AlgorithmUtilities.writeToResults("Half Sorted");
		AlgorithmUtilities.writeNewLine();		
		runModifiedMergeHalfSort(1000, 10);
		runModifiedMergeHalfSort(10000, 10);
		runModifiedMergeHalfSort(100000, 10);
		runModifiedMergeHalfSort(1000000, 10);
		
		// 50 ELEMENTS
		AlgorithmUtilities.writeToResults("Modified Merge Sort: 50");
		AlgorithmUtilities.writeNewLine();		
		runModifiedMergeSort(1000, 50);
		runModifiedMergeSort(10000, 50);
		runModifiedMergeSort(100000, 50);
		runModifiedMergeSort(1000000, 50);
		
		AlgorithmUtilities.writeToResults("Already Sorted");
		AlgorithmUtilities.writeNewLine();		
		runModifiedMergeAlreadySort(1000, 50);
		runModifiedMergeAlreadySort(10000, 50);
		runModifiedMergeAlreadySort(100000, 50);	
		runModifiedMergeAlreadySort(1000000, 50);

		AlgorithmUtilities.writeToResults("Half Sorted");
		AlgorithmUtilities.writeNewLine();		
		runModifiedMergeHalfSort(1000, 50);
		runModifiedMergeHalfSort(10000, 50);
		runModifiedMergeHalfSort(100000, 50);
		runModifiedMergeHalfSort(1000000, 50);
		
		//100 ELEMENTS
		AlgorithmUtilities.writeToResults("Modified Merge Sort: 100");
		AlgorithmUtilities.writeNewLine();		
		runModifiedMergeSort(1000, 100);
		runModifiedMergeSort(10000, 100);
		runModifiedMergeSort(100000, 100);
		runModifiedMergeSort(1000000, 100);
		
		AlgorithmUtilities.writeToResults("Already Sorted");
		AlgorithmUtilities.writeNewLine();		
		runModifiedMergeAlreadySort(1000, 100);
		runModifiedMergeAlreadySort(10000, 100);
		runModifiedMergeAlreadySort(100000, 100);	
		runModifiedMergeAlreadySort(1000000, 100);

		AlgorithmUtilities.writeToResults("Half Sorted");
		AlgorithmUtilities.writeNewLine();		
		runModifiedMergeHalfSort(1000, 100);
		runModifiedMergeHalfSort(10000, 100);
		runModifiedMergeHalfSort(100000, 100);
		runModifiedMergeHalfSort(1000000, 100);
		
		//500 ELEMENTS
		AlgorithmUtilities.writeToResults("Modified Merge Sort: 500");
		AlgorithmUtilities.writeNewLine();		
		runModifiedMergeSort(1000, 500);
		runModifiedMergeSort(10000, 500);
		runModifiedMergeSort(100000, 500);
		runModifiedMergeSort(1000000, 500);
		
		AlgorithmUtilities.writeToResults("Already Sorted");
		AlgorithmUtilities.writeNewLine();		
		runModifiedMergeAlreadySort(1000, 500);
		runModifiedMergeAlreadySort(10000, 500);
		runModifiedMergeAlreadySort(100000, 500);	
		runModifiedMergeAlreadySort(1000000, 500);

		AlgorithmUtilities.writeToResults("Half Sorted");
		AlgorithmUtilities.writeNewLine();		
		runModifiedMergeHalfSort(1000, 500);
		runModifiedMergeHalfSort(10000, 500);
		runModifiedMergeHalfSort(100000, 500);
		runModifiedMergeHalfSort(1000000, 500);
		/*
		 * END MODIFIED MERGESORT
		 */
		System.out.print("Execution finished!"); //This is just so I could tell it actually finished
	}
	
	private static void runJavaSort(int numOfElements)
	{
		List<Integer> array = AlgorithmUtilities.fillArray(numOfElements);
		JavaSort jSort = new JavaSort();
		
		long t0 = AlgorithmUtilities.getCurrentTime();
		jSort.sort(array);
		long t1 = AlgorithmUtilities.getCurrentTime();
		long time = t1 - t0;
		
		AlgorithmUtilities.writeToResults("Is array sorted? " + AlgorithmUtilities.isSorted(array));
    	AlgorithmUtilities.writeToResults("Number of elements: " + array.size());
		AlgorithmUtilities.writeToResults("Time to execute: " + (double)time / 1000000000.0);
		AlgorithmUtilities.writeNewLine();
	}
	
	private static void runJavaAlreadySort(int numOfElements)
	{
		List<Integer> array = AlgorithmUtilities.fillArray(numOfElements);
		JavaSort jSort = new JavaSort();
		
		jSort.sort(array);
		long t0 = AlgorithmUtilities.getCurrentTime();
		jSort.sort(array);
		long t1 = AlgorithmUtilities.getCurrentTime();
		long time = t1 - t0;
		
		AlgorithmUtilities.writeToResults("Is array sorted? " + AlgorithmUtilities.isSorted(array));
    	AlgorithmUtilities.writeToResults("Number of elements: " + array.size());
		AlgorithmUtilities.writeToResults("Time to execute: " + (double)time / 1000000000.0);
		AlgorithmUtilities.writeNewLine();
	}
	
	private static void runJavaHalfSort(int numOfElements)
	{
		List<Integer> array = AlgorithmUtilities.fillArray(numOfElements);
		JavaSort jSort = new JavaSort();
		
		jSort.sort(array.subList(0, array.size()/2));
		long t0 = AlgorithmUtilities.getCurrentTime();
		jSort.sort(array);
		long t1 = AlgorithmUtilities.getCurrentTime();
		long time = t1 - t0;
		
		AlgorithmUtilities.writeToResults("Is array sorted? " + AlgorithmUtilities.isSorted(array));
    	AlgorithmUtilities.writeToResults("Number of elements: " + array.size());
		AlgorithmUtilities.writeToResults("Time to execute: " + (double)time / 1000000000.0);
		AlgorithmUtilities.writeNewLine();
	}
	
	private static void runBubbleSort(int numOfElements)
	{
		List<Integer> array = AlgorithmUtilities.fillArray(numOfElements);
		BubbleSort bSort = new BubbleSort();
		
		long t0 = AlgorithmUtilities.getCurrentTime();
		bSort.sort(array);
		long t1 = AlgorithmUtilities.getCurrentTime();
		long time = t1 - t0;
		
		AlgorithmUtilities.writeToResults("Is array sorted? " + AlgorithmUtilities.isSorted(array));
    	AlgorithmUtilities.writeToResults("Number of elements: " + array.size());
		AlgorithmUtilities.writeToResults("Time to execute: " + (double)time / 1000000000.0);
		AlgorithmUtilities.writeNewLine();
	}
	
	private static void runBubbleAlreadySort(int numOfElements)
	{
		List<Integer> array = AlgorithmUtilities.fillArray(numOfElements);
		BubbleSort bSort = new BubbleSort();
		
		bSort.sort(array);
		long t0 = AlgorithmUtilities.getCurrentTime();
		bSort.sort(array);
		long t1 = AlgorithmUtilities.getCurrentTime();
		long time = t1 - t0;
		
		AlgorithmUtilities.writeToResults("Is array sorted? " + AlgorithmUtilities.isSorted(array));
    	AlgorithmUtilities.writeToResults("Number of elements: " + array.size());
		AlgorithmUtilities.writeToResults("Time to execute: " + (double)time / 1000000000.0);
		AlgorithmUtilities.writeNewLine();
	}
	
	private static void runBubbleHalfSort(int numOfElements)
	{
		List<Integer> array = AlgorithmUtilities.fillArray(numOfElements);
		BubbleSort bSort = new BubbleSort();
		
		bSort.sort(array.subList(0, array.size()/2));
		long t0 = AlgorithmUtilities.getCurrentTime();
		bSort.sort(array);
		long t1 = AlgorithmUtilities.getCurrentTime();
		long time = t1 - t0;
		
		AlgorithmUtilities.writeToResults("Is array sorted? " + AlgorithmUtilities.isSorted(array));
    	AlgorithmUtilities.writeToResults("Number of elements: " + array.size());
		AlgorithmUtilities.writeToResults("Time to execute: " + (double)time / 1000000000.0);
		AlgorithmUtilities.writeNewLine();
	}
	
	private static void runBSTSort(int numOfElements) {
		List<Integer> array = AlgorithmUtilities.fillArray(numOfElements);
		BSTSort bstSort = new BSTSort();
		
		long t0 = AlgorithmUtilities.getCurrentTime();
		bstSort.sort(array);
		long t1 = AlgorithmUtilities.getCurrentTime();
		long time = t1 - t0;
		
		AlgorithmUtilities.writeToResults("Is array sorted? " + AlgorithmUtilities.isSorted(array));
    	AlgorithmUtilities.writeToResults("Number of elements: " + array.size());
		AlgorithmUtilities.writeToResults("Time to execute: " + (double)time / 1000000000.0);
		AlgorithmUtilities.writeNewLine();
	}
	
	private static void runBSTAlreadySort(int numOfElements) {
		List<Integer> array = AlgorithmUtilities.fillArray(numOfElements);
		BSTSort bstSort = new BSTSort();
		
		bstSort.sort(array);
		long t0 = AlgorithmUtilities.getCurrentTime();
		bstSort.sort(array);
		long t1 = AlgorithmUtilities.getCurrentTime();
		long time = t1 - t0;
		
		AlgorithmUtilities.writeToResults("Is array sorted? " + AlgorithmUtilities.isSorted(array));
    	AlgorithmUtilities.writeToResults("Number of elements: " + array.size());
		AlgorithmUtilities.writeToResults("Time to execute: " + (double)time / 1000000000.0);
		AlgorithmUtilities.writeNewLine();
	}
	
	private static void runBSTHalfSort(int numOfElements) {
		List<Integer> array = AlgorithmUtilities.fillArray(numOfElements);
		BSTSort bstSort = new BSTSort();
		
		bstSort.sort(array.subList(0, array.size()/2));
		long t0 = AlgorithmUtilities.getCurrentTime();
		bstSort.sort(array);
		long t1 = AlgorithmUtilities.getCurrentTime();
		long time = t1 - t0;
		
		AlgorithmUtilities.writeToResults("Is array sorted? " + AlgorithmUtilities.isSorted(array));
    	AlgorithmUtilities.writeToResults("Number of elements: " + array.size());
		AlgorithmUtilities.writeToResults("Time to execute: " + (double)time / 1000000000.0);
		AlgorithmUtilities.writeNewLine();
	}
	
	private static void runHeapSort(int numOfElements) {
		List<Integer> array = AlgorithmUtilities.fillArray(numOfElements);
		HeapSort heapSort = new HeapSort();
		
		long t0 = AlgorithmUtilities.getCurrentTime();
		heapSort.sort(array);
		long t1 = AlgorithmUtilities.getCurrentTime();
		long time = t1 - t0;
		
		AlgorithmUtilities.writeToResults("Is array sorted? " + AlgorithmUtilities.isSorted(array));
    	AlgorithmUtilities.writeToResults("Number of elements: " + array.size());
		AlgorithmUtilities.writeToResults("Time to execute: " + (double)time / 1000000000.0);
		AlgorithmUtilities.writeNewLine();
	}
	
	private static void runHeapAlreadySort(int numOfElements) {
		List<Integer> array = AlgorithmUtilities.fillArray(numOfElements);
		HeapSort heapSort = new HeapSort();
		
		heapSort.sort(array);
		long t0 = AlgorithmUtilities.getCurrentTime();
		heapSort.sort(array);
		long t1 = AlgorithmUtilities.getCurrentTime();
		long time = t1 - t0;
		
		AlgorithmUtilities.writeToResults("Is array sorted? " + AlgorithmUtilities.isSorted(array));
    	AlgorithmUtilities.writeToResults("Number of elements: " + array.size());
		AlgorithmUtilities.writeToResults("Time to execute: " + (double)time / 1000000000.0);
		AlgorithmUtilities.writeNewLine();
	}
	
	private static void runHeapHalfSort(int numOfElements) {
		List<Integer> array = AlgorithmUtilities.fillArray(numOfElements);		
		HeapSort heapSort = new HeapSort();
		
		heapSort.sort(array.subList(0, array.size()/2));		
		long t0 = AlgorithmUtilities.getCurrentTime();
		heapSort.sort(array);
		long t1 = AlgorithmUtilities.getCurrentTime();
		long time = t1 - t0;
		
		AlgorithmUtilities.writeToResults("Is array sorted? " + AlgorithmUtilities.isSorted(array));
    	AlgorithmUtilities.writeToResults("Number of elements: " + array.size());
		AlgorithmUtilities.writeToResults("Time to execute: " + (double)time / 1000000000.0);
		AlgorithmUtilities.writeNewLine();
	}
	
	private static void runMergeSort(int numOfElements) {
		List<Integer> array = AlgorithmUtilities.fillArray(numOfElements);
		MergeSort mergeSort = new MergeSort();
		
		long t0 = AlgorithmUtilities.getCurrentTime();
		mergeSort.sort(array);
		long t1 = AlgorithmUtilities.getCurrentTime();
		long time = t1 - t0;
		
		AlgorithmUtilities.writeToResults("Is array sorted? " + AlgorithmUtilities.isSorted(array));
    	AlgorithmUtilities.writeToResults("Number of elements: " + array.size());
		AlgorithmUtilities.writeToResults("Time to execute: " + (double)time / 1000000000.0);
		AlgorithmUtilities.writeNewLine();
	}
	
	private static void runMergeAlreadySort(int numOfElements) {
		List<Integer> array = AlgorithmUtilities.fillArray(numOfElements);
		MergeSort mergeSort = new MergeSort();
		
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
	
	private static void runMergeHalfSort(int numOfElements) {
		List<Integer> array = AlgorithmUtilities.fillArray(numOfElements);		
		MergeSort mergeSort = new MergeSort();
		
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
}
