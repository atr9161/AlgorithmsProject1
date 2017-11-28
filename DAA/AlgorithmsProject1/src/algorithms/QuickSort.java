package algorithms;

import java.util.List;
//Adapted from the Hoare partition scheme at: https://en.wikipedia.org/wiki/Quicksort
public class QuickSort {

	public void sort(List<Integer> A) {
		quicksort(A, 0, A.size() - 1);
	}

	private void quicksort(List<Integer> A, int lo, int hi) {
		if (lo < hi) {
			int p = partition(A, lo, hi);
			quicksort(A, lo, p);
			quicksort(A, p + 1, hi);
		}
	}

	private int partition(List<Integer> A, int lo, int hi) {
		int pivot = A.get(lo);
		int i = lo - 1;
		int j = hi + 1;
		while(true) {
			do {
	            i++;
			}
	        while (A.get(i) < pivot);

	        do
	            j--;
	        while (A.get(j) > pivot);

	        if (i >= j) {
	            return j;
	        }

	        swap(A,i,j);
		}
	}

	private void swap(List<Integer> A, int lo, int hi) {
		int swap = A.get(lo);
		A.set(lo, A.get(hi));
		A.set(hi, swap);
	}
}
