// initialize lowest as first index
// initialize secondlowest as first index
// compare lowest to array[index]
// collect and store
// compare array[index] to secondLowest and lowest
// collect and store
// return lowest and secondlowest

import java.util.Arrays;
public class LowestNumber {

	public static int[] lowest(int[] array) {
		int lowest = array[0];
		int secondLowest = array[0];
		int[] input = new int[2];
	for (int count = 0; count < array.length; count++) {
	if (array[count] < lowest) {
			input[0] = array[count];
	} else if (array[count] < secondLowest && array[count] < lowest) {
			input[1] = array[count];
	}
	}
		return input;
	}

	public static void main(String... Tope) {
		int[] array1 = {2, 2, 1};
		System.out.println(Arrays.toString(lowest(array1)));

		int[] array2 = {4, 1, 2, 1, 2};
		System.out.println(Arrays.toString(lowest(array2)));

		int[] array3 = {4, 7, 9, -1, 0};
		System.out.println(Arrays.toString(lowest(array3)));
	}
}