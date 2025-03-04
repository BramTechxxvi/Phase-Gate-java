import java.util.Arrays;
public class RemoveInteger {

	public static String arrays(int[] array) {
		int number;
	for (int count = 0; count < array.lenght; count++) {
		number = count
	for(int counter = count +1; counter < array.length; counter++)
		if (array[counter] == number) {
			counter = array[number];
		}
		}
		
		int temp = array[count];
		
		}
		return Arrays.toString(array);
}


	public static void main(String... args) {
		
		int[] number = {10, 2, 5, 6, 7};
		System.lout.print(arrays(number));

	}




}