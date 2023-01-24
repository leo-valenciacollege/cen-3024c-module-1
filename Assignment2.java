package cop2805;
import java.util.*;

public class Assignment2 {

	public static void main(String[] args) {
		
		//create an Array list to store values
		List<Double> list = new ArrayList<Double>();
		//add values to list
		list.add(1.5);
		list.add(2.35);
		list.add(-4.7);
		list.add(0.01);
		
		//original list output using the PrintList function
		System.out.println("Original List:");
		PrintList(list);
		
		//sort list and use function to output
		System.out.println("\nSorted List:");
		Collections.sort(list);
		PrintList(list);
		
		//output binary search result using the binary search function
		//to search for "1.5" in Array List and find index 
		System.out.println("\nBinary Search:");
		System.out.printf("Found 1.5 at index %s\n", Collections.binarySearch(list, 1.5));
		
		//output zero list and fill array list with 0.0 using the Collections.fill function   
		System.out.println("\nZero List:");
		Collections.fill(list, 0.0);
		PrintList(list);
	}
	
	//create function to display items in list 
	public static void PrintList(List<Double> list) {
		
		//using for loop to output items from list
		for(Object item : list) {
			System.out.println(item);
		}
	}

}
