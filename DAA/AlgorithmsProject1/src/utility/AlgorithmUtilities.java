package utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AlgorithmUtilities {
	public static boolean isSorted(List<Integer> list) {
		boolean sorted = true;
		for(int i = 1; i < list.size(); i++) {
			if(list.get(i) < list.get(i-1)) {
				sorted = false;
			}
		}
		return sorted;
	}
	
	public static List<Integer> fillArray(int size) {
		List<Integer> returnList = new ArrayList<>();
		Random r = new Random();
		for(int i = 0; i < size; i++) {
			returnList.add(Math.abs(r.nextInt()));
		}
		return returnList;
	}
	
	public static List<Integer> splitArray(List<Integer> list) {
		return list.subList(0, (list.size()/2)+1);
	}
	
	public static long getCurrentTime() {
		return System.currentTimeMillis() % 1000;
	}
}
