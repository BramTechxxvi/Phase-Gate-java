import java.util.Arrays;
public class IndexOfLowest {
	
	public static String lowest(int[] number) {
		//int[] temp = new int[1];
		int lowest = number[0];
	for (int index = 0; index < number.length; index++) {
		if (number[index] < lowest) {
			lowest = number[index];
		}
	}
		return Arrays.toString(lowest);
	}
		
	
	public static void main(String... Bram) {
		int[] array = {1, 0, 0, 2, 3};
	System.out.println(lowest(array));

	}
}