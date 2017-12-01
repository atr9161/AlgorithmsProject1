package algorithms;

import java.util.List;

//https://en.wikipedia.org/wiki/Insertion_sort
public class InsertionSort {
	public void sort(List<Integer> A) {
		int i = 1;
		while (i < A.size()) {
		    int j = i;
		    while (j > 0 && A.get(j-1) > A.get(j)) {
		        swap(A,j,j-1);
		        j--;
		    }
		    i = i + 1;
		}
	}	

	private void swap(List<Integer> A, int first, int second) {
		int swap = A.get(first);
		A.set(first, A.get(second));
		A.set(second, swap);
	}
}
