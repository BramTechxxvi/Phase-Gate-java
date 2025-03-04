// initialize largest as first index
// initialize secondlargest as first index
// compare largest to array[index]
// collect and store
// compare array[index] to secondLargest and largest
// collect and store
// return largest and secondlargest

import java.util.Arrays;
public class HighestNumber {

	public static int[] highest(int[] array) {
		int largest = array[0];
		int secondLargest = array[0];
		int[] input = new int[2];
	for (int index = 0; index < array.length; index+=1) {
	if (array[index] > largest) {
			input[0] = array[index];
	} else if (array[index] > secondLargest && array[index] < largest) {
			input[1] = array[index];
	} 
	}
		return input;
	}

	public static void main(String... Tope) {
		int [] array1 = {1, 4, 5, 6, 9, 7, 10, 9};
		System.out.println(Arrays.toString(highest(array1)));

		int [] array2 = {1, 4, 6, 8, 0, 1, 2, 7};
		System.out.println(Arrays.toString(highest(array2)));

		int [] array3 = {1, 6, 7, 8, 1000};
		System.out.println(Arrays.toString(highest(array3)));
		
	}
}