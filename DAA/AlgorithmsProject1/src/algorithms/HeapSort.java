package algorithms;

import java.util.List;

public class HeapSort {
	
	public void sort(List<Integer> a) {
		heapify(a);
		int N = a.size()-1;
		while(N > 0) {
			int v = a.get(0);
			a.set(0, a.get(N));
			a.set(N, v);
			N = N - 1;
			downheap(a,N,0);
		}
	}
		
	private void downheap(List<Integer> a, int N, int k) {
		if(N>0) {
			int v = a.get(k);
			while (k <= N/2) {
				int j = k+k;
				if(j < N && a.get(j) < a.get(j+1)) {
					j++;
				}
				if(v >= a.get(j)) {
					break;
				}
				a.set(k,a.get(j));
				k = j;
			}
			a.set(k, v);
		}
	}
	
	private void heapify(List<Integer> a) {
		int N = a.size()-1;
		int k = N/2;
		while(k>=0) {
			downheap(a,N,k);
			k = k-1;
		}
	}
}
