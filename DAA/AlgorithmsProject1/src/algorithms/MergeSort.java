package algorithms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MergeSort {
	
	public List<Integer> sort(List<Integer> list) {
		List<Integer> sortedList = new ArrayList<Integer>();
		
		if(list.size()>1) {
			int splitId = list.size()/2;
			List<Integer> list1, list2; 
			list1 = sort(list.subList(0, splitId)); //First portion of array
			list2 = sort(list.subList(splitId, list.size())); //Second portion of array
			sortedList = merge(list1,list2);
		}
		else {
			sortedList = list;
		}		
		return sortedList;
	}
	
	private List<Integer> merge(List<Integer> list1, List<Integer> list2) {
		List<Integer> mergedList = new ArrayList<Integer>();
		Iterator<Integer> list1Iterator = list1.iterator();
		Iterator<Integer> list2Iterator = list2.iterator();
		
		int currentList1Element = iterate(list1Iterator);		
		int currentList2Element = iterate(list2Iterator);
		
		for(int i = 0; i < list1.size()+list2.size(); i++) {
			if(currentList1Element < currentList2Element) {
				mergedList.add(currentList1Element);
				currentList1Element = iterate(list1Iterator);
			}
			else {
				mergedList.add(currentList2Element);
				currentList2Element = iterate(list2Iterator);
			}
		}
		return mergedList;
	}
	
	/*
	 * Java doesn't let you get the "Current" element of
	 * an iterator, so I created this utility method
	 * to make the code easier to read
	 */
	private int iterate(Iterator<Integer> iterator) {
		int returnValue;
		if(iterator.hasNext()) {
			returnValue = iterator.next();
		}
		else {
			returnValue = Integer.MAX_VALUE; //Max value ensures the other value is selected
		}
		return returnValue;
	}
}
