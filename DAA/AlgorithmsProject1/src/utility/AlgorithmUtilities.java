package utility;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

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
			returnList.add(ThreadLocalRandom.current().nextInt(0, 1000000 + 1));
		}
		return returnList;
	}
	
	public static List<Integer> splitArray(List<Integer> list) {
		return list.subList(0, (list.size()/2)+1);
	}
	
	public static long getCurrentTime() {
		return System.nanoTime();
	}
	
	public static void writeToResults(String outputString) {
		try 
		{
			BufferedWriter writer = new BufferedWriter(new FileWriter("Results.txt",true));
			writer.append(outputString);
			writer.newLine();
			writer.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void writeNewLine() {
		try 
		{
			BufferedWriter writer = new BufferedWriter(new FileWriter("Results.txt",true));
			writer.newLine();
			writer.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void clearResults() {
		try 
		{
			BufferedWriter writer = new BufferedWriter(new FileWriter("Results.txt"));
			writer.flush();
			writer.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
