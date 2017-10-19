package algorithms;

import java.util.ArrayList;
import java.util.List;

// http://www.vogella.com/tutorials/JavaAlgorithmsMergesort/article.html
public class MergeSort {
	
	private ArrayList<Integer> helper;
	
	public void sort(List<Integer> list, int p, int r) {
		helper = new ArrayList<Integer>(list);
		mergeSort(list,p,r-1);
	}
	
	private void mergeSort(List<Integer> list, int low, int high) {
		if(low < high) {
			int middle = low+(high-low) / 2;
			mergeSort(list,low,middle); //First portion of array
			mergeSort(list,middle+1,high); //Second portion of array
			merge(list,low,middle,high);
		}	
	}
	
	private void merge(List<Integer> list, int low, int middle, int high) {		
		for(int i = low; i < high; i++) {
			helper.set(i, list.get(i));
		}
		
		int i = low;
		int j = middle+1;
		int k = low;
		while(i <= middle && j <= high) {
			if(helper.get(i) <= helper.get(j)) {
				list.set(k,helper.get(i));
				i++;
			}
			else {
				list.set(k,helper.get(j));
				j++;
			}
			k++;
		}
		
		while(i <= middle) {
			list.set(k,helper.get(i));
			i++;
			k++;
		}
	}
}
