import java.util.Arrays;
public class ReverseArray{

	public static String getArray(int[] array) {
	for(int index = 0; index < array.length; index++) {
		int largest = index;
	for (int count = index + 1; count < array.length; count++){
                 if(array[count] > array[largest]) {
                largest = count;
		}
	}
		int temp = array[largest];
		array[largest] = array[index];
		array[index] = temp;

	}	
		return Arrays.toString(array);

}

	public static String getArrays(int[] array) {
	for(int index = 0; index < array.length; index++) {
		int smallest = index;
	for(int counter = index + 1; counter < array.length; counter++) {
		if(array[counter] < array[smallest]) {
			smallest = counter;
		}
	}
		int temp = array[smallest];
		array[smallest] = array[index];
		array[index] = temp;
	}
		return Arrays.toString(array);

}




	public static void main(String... args) {
		int [] array = {10, 4, 61, 12, 5};
	System.out.println(getArrays(array));




}

}