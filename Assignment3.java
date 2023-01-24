package cop2805;

public class Assignment3 {

	public static void main(String[] args) {
		
		//initialize String, Integer, and Double array data set
		String[] colors = {"Red", "Green", "Blue"};
		Integer[] numbers = {1, 2, 3};
		Double[] circleRadius = {3.0, 5.9, 2.9};
		
		//print out result of "min" function for all Types
		System.out.printf("Colors: %s\n", min(colors));
		System.out.printf("Numbers: %s\n", min(numbers));
		System.out.printf("Circle Radius: %s\n", min(circleRadius));
	}
	
	//create a generic function that extends the Comparable interface and takes in array
	public static <E extends Comparable<E>> E min (E[] list) {
		
		//set minElement to first element of array
		E minElement = list[0];

		//loop through array list and use the "compareTo" method to determine 
		//if the array item is less than minElement item
		for(int i = 0; i < list.length; i++) {
			
			//if current array list item is a negative number compared to current minElement, 
			//then assign minElement to new minimum element
			if(list[i].compareTo(minElement) < 0) {
				minElement = list[i];
			}
		}
		
		//return minimum element
		return minElement;
	}

}
