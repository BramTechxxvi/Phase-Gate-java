import java.util.Arrays;
public class TwoHighestNumber {

	public int findTwoLargest(int[] array) {
		int firstLargest = array[0]; int secondLargest = array[0];
	for (int count = 0; count <array.length; count++) {
		if (array[count] > firstLargest) {
		firstLargest = array[count];
		}
	for (int counter = count+1; counter <array.length; counter++) {
		secondLargest = array[counter];
	if(secondLargest < firstLargest && secondLargest > array[counter]) {
			secondLargest = array[counter];
	}
	}
	}
		return secondLargest;
	}

	public static void main(String... args) {
	TwoHighestNumber myMethod = new TwoHighestNumber();
		int[] array = {45, 78, 900, 12, 8};
		int lol = myMethod.findTwoLargest(array);
	System.out.print(lol);
	}
}