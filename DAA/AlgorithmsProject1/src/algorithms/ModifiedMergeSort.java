package algorithms;

import java.util.ArrayList;
import java.util.List;

public class ModifiedMergeSort {		
		
		private List<Integer> strList;	 
		private int size;
		private BubbleSort bubble;
		
		
		public ModifiedMergeSort(int size) {
			bubble = new BubbleSort();
			this.size = size;
		}
	     
	    public void sort(List<Integer> input) {
	    	strList = input;
	        strList = mergeSort(strList);
	    }
	 
	    public List<Integer> mergeSort(List<Integer> whole) {
	        List<Integer> left = new ArrayList<Integer>();
	        List<Integer> right = new ArrayList<Integer>();
	        int center;
	 
	        if (whole.size() < size) {   
	        	bubble.sort(whole);
	            return whole;
	        } else {
	            center = whole.size()/2;
	            // copy the left half of whole into the left.
	            for (int i=0; i<center; i++) {
	                    left.add(whole.get(i));
	            }
	 
	            //copy the right half of whole into the new arraylist.
	            for (int i=center; i<whole.size(); i++) {
	                    right.add(whole.get(i));
	            }
	 
	            // Sort the left and right halves of the arraylist.
	            left  = mergeSort(left);
	            right = mergeSort(right);
	 
	            // Merge the results back together.
	            merge(left, right, whole);
	        }
	        return whole;
	    }
	 
	    private void merge(List<Integer> left, List<Integer> right, List<Integer> whole) {
	        int leftIndex = 0;
	        int rightIndex = 0;
	        int wholeIndex = 0;
	 
	        // As long as neither the left nor the right ArrayList has
	        // been used up, keep taking the smaller of left.get(leftIndex)
	        // or right.get(rightIndex) and adding it at both.get(bothIndex).
	        while (leftIndex < left.size() && rightIndex < right.size()) {
	            if ( (left.get(leftIndex).compareTo(right.get(rightIndex))) < 0) {
	                whole.set(wholeIndex, left.get(leftIndex));
	                leftIndex++;
	            } else {
	                whole.set(wholeIndex, right.get(rightIndex));
	                rightIndex++;
	            }
	            wholeIndex++;
	        }
	 
	        List<Integer> rest;
	        int restIndex;
	        if (leftIndex >= left.size()) {
	            // The left ArrayList has been use up...
	            rest = right;
	            restIndex = rightIndex;
	        } else {
	            // The right ArrayList has been used up...
	            rest = left;
	            restIndex = leftIndex;
	        }
	 
	        // Copy the rest of whichever ArrayList (left or right) was not used up.
	        for (int i=restIndex; i<rest.size(); i++) {
	            whole.set(wholeIndex, rest.get(i));
	            wholeIndex++;
	        }
	    }
}
