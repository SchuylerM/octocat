import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;


public class DataStructuresIntro {

	private static long SIZE = 100000;
	
	/**
	 * TODO: Output a comparison of the contains method for both a HashSet and an ArrayList
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("For now we will focus on utilizing Java data structures inside this one main class.");
	
		double setTime = hashSetMetrics();
		
		double listTime = arrayListMetrics();
		
		System.out.println(String.format("The set took an average of %.2f seconds and the list took an average of %.2f seconds", setTime, listTime));
		
	}
	
	/**
	 * While timing the entire method, insert 100000 random numbers into a HashSet, and then perform 100000 random contains() calls
	 * 
	 * @return the average time (in seconds) for a .contains(x) call on a HashSet
	 */
	public static double hashSetMetrics() {
		long start = System.currentTimeMillis();
		
		Set<Long> mySet = new HashSet<Long>();
		Random rand = new Random();
		
		for(int i = 0; i < SIZE; i++) {
			mySet.add(rand.nextLong());
		}
		
		for(int i = 0; i < SIZE; i++) {
			mySet.contains(rand.nextLong());
		}
		
		long end = System.currentTimeMillis();
		
		return (end - start) / 1000.0;
	}

	/**
	 * While timing the entire method, insert 100000 random numbers into an ArrayList, and then perform 100000 random contains() calls
	 * 
	 * @return the average time (in seconds) for a .contains(x) call on an ArrayList
	 */
	public static double arrayListMetrics() {
		long start = System.currentTimeMillis();
		
		List<Long> myList = new ArrayList<Long>();
		Random rand = new Random();
		
		for(int i = 0; i < SIZE; i++) {
			myList.add(rand.nextLong());
		}
		
		for(int i = 0; i < SIZE; i++) {
			myList.contains(rand.nextLong());
		}
		
		long end = System.currentTimeMillis();
		
		return (end - start) / 1000.0;
	}

}
