// initialize largest as first index
// initialize lowest as first index
// declare empty array
// loop through array length
// compare largest to array[index]
// collect and store in empty array
// compare lowest to array[index]
// collect and store in empty array
// return empty array

import java.util.Arrays;
public class HighestAndLowest {

	public static int[] highlow(int[] array) {
		int largest = array[0];
		int smallest = array[0];
		int[] input = new int[2];
	for (int index = 0; index < array.length; index++) {
		if (array[index] > largest) {
		input[0] = array[index];
		}
		if (array[index] < smallest) {
		input[1] = array[index];
		}
	}	
		return input;
	}

	public static void main(String... Tope) {
		int[] array1 = {7, 4, 6, 2, 5};
		System.out.println(Arrays.toString(highlow(array1)));

		int[] array2 = {10, 20, 30, 40, 50, 60, -10};
		System.out.println(Arrays.toString(highlow(array2)));

		int[] array3 = {100, 1000, 1000000, 20, 0};
		System.out.println(Arrays.toString(highlow(array3)));
	}
}