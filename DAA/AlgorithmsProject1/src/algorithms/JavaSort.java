package algorithms;

import java.util.ArrayList;
import java.util.Collections;

public class JavaSort {
	
	public ArrayList<Integer> sort(ArrayList<Integer> list) {
		Collections.sort(list); //Collections.sort() has a return type of void; it instead uses the reference list to sort
		return list;
	}
}
