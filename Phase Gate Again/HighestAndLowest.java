import java.util.Arrays;
public class HighestAndLowest {

	public int[] findHighestAndLowest (int[] array) {
	int largest = array[0]; int lowest = array[0]; 
	int[] newArray = new int[2];
	for (int count = 0; count < array.length; count++) {
		if(array[count] > largest) {
			largest = array[count];
	}
	}
	for (int counter = 0; counter < array.length; counter++) {
		if(array[counter] < lowest) {
			lowest = array[counter];
	}
	}
	return new int[]{largest, lowest};
}

	public static void main(String... args) {
	HighestAndLowest myMethod = new HighestAndLowest();
		int[] array = {11, 2, 6, 16, 7};
		int[] temp = myMethod.findHighestAndLowest(array);
	System.out.print(Arrays.toString(temp));
}
}