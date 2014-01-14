import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;


public class DataStructuresIntro {
	
	/**
	 * TODO: Output a comparison of the contains method for both a HashSet and an ArrayList
	 * @param args
	 */
	static int a = 100000;
	public static void main(String[] args) {
		System.out.println("For now we will focus on utilizing Java data structures inside this one main class.");
		System.out.println("Hash set time. " + hashSetMetrics() +" seconds");
		System.out.println("Array set time. " + arrayListMetrics() +" seconds");
	}
	
	/**
	 * While timing the entire method, insert 100000 random numbers into a HashSet, and then perform 100000 random contains() calls
	 * 
	 * @return the average time (in seconds) for a .contains(x) call on a HashSet
	 */
	private static double hashSetMetrics() {
		HashSet<Long> mySet = new HashSet<Long>();
		Random random = new Random();
				
		for (int i=0;i<100000;i++){
			mySet.add(random.nextLong());
			
		}
		
		long startTime = System.currentTimeMillis();
		for (int i=0;i<a;i++){
			mySet.contains(random.nextLong());
			
		}
		long endTime = System.currentTimeMillis();
		
		double result = (endTime - startTime)/1000.0;
		
		return result;
		
	}

	/**
	 * While timing the entire method, insert 100000 random numbers into an ArrayList, and then perform 100000 random contains() calls
	 * Austin is learning some java
	 * @return the average time (in seconds) for a .contains(x) call on an ArrayList
	 */
	public static double arrayListMetrics() {
		ArrayList<Long> myList = new ArrayList<Long>();
		Random random = new Random ();
		
		for (int i=0;i<a;i++){
			myList.add(random.nextLong()); 
		}
		
		long startTime = System.currentTimeMillis();
		for (int i=0;i<a;i++){
			myList.contains(random.nextLong());
			
		}
		long endTime = System.currentTimeMillis();
		
		double result = (endTime - startTime)/1000.0;
		
		return result;
		
	}

}


	
	

