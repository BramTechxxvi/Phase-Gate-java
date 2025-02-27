import java.util.Arrays;
public class TwoLowestNumber {

	public int[] findTwoLowest (int[] array) {
	int firstLowest = array[0]; int secondLowest = array[0]; 
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
	TwoLowestNumber myMethod = new TwoLowestNumber();
		int[] array = {11, 2, 6, 16, 7};
		int[] temp = myMethod.findTwoLowest(array);
	System.out.print(Arrays.toString(temp));
}
}