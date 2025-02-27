import java.util.Arrays;
public class IndexOfLargest {

	public int[] indexOfLargest(double[][] array) {
		double largest = array[0][0]; int row = 0; int col = 0;
	for (int count = 0; count < array.length; count++) {
	for (int counter = 0; counter < array[count].length; counter++) {
		if(array[count][counter] > largest) {
			largest = array[count][counter];
		row = count;
		col = counter;
	}
	}
	}
		return new int[]{row, col};
	}

	public static void main(String... args) {
	IndexOfLargest myIndex = new IndexOfLargest();
		double[][] array = {
			   {1.5, 2.3, 3.7, 4.6},
			   {5.1, 6.2, 7.3, 8.4},
			   {9.5, 10.1, 11.8, 12.7}
			};
		int[] temp = myIndex.indexOfLargest(array);
	System.out.println(Arrays.toString(temp));

		double[][] array2= {
			  {-1.2, -3.4},
			  {-2.5, -0.5}
			};
	int[] tempe = myIndex.indexOfLargest(array2);
	System.out.print(Arrays.toString(tempe));
}
}