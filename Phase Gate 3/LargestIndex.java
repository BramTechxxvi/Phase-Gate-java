import java.util.Arrays;
public class LargestIndex {
	public static int arrays(int[][] array) {
		int largest = array[0][0];
	for(int row = 0; row < array.length; row++) {
	for(int col = row; col < array[row].length; col++) {
		if (array[row][col] > largest) {
			largest = array[row][col];
		}
	}
	}

		return largest;
}	 



	public static void main(String... args) {
		int[][] array ={ {1, 2, 3}, {4, 5, 6} };
		System.out.println(arrays(array));

	}




}