import java.util.Arrays;
public class UniqueElement {

	public static int[] unique(int[] array) {
		int[] extract = new int[3];
	for (int index = 0; index < array.length; index++) {
		if (array[index] == 1) {
		extract[0] = array[index];
		} else if (array[index] == 2) {
		extract[1] = array[index];
		} else if (array[index] == 4) {
		extract[2] = array[index];
		}
	}
		return extract;
}
	public static void main(String... Tope) {
	int[] array = {1, 2, 3, 4, 0,8};
	System.out.print(Arrays.toString(unique(array)));

	}
}