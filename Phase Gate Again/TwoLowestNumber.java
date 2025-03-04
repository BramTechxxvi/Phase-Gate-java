import java.util.Arrays;
public class TwoLowestNumber {

	public int[] findTwoLowest (int[] array) {
		int firstLowest = array[0]; int secondLowest = array[0]; 
	int[] newArray = new int[2];
	for (int count = 0; count < array.length; count++) {
		if(array[count] < firstLowest) {
		secondLowest = firstLowest;
		firstLowest = array[count];
	} else if(array[count] > secondLowest && array[count] != firstLowest) {
		
}
		return new int[]{firstLowest, secondLowest};
}
	public static void main(String... args) {
	TwoLowestNumber myMethod = new TwoLowestNumber();
		int[] array = {11, 2, 6, 16, 7};
		int[] temp = myMethod.findTwoLowest(array);
	System.out.print(Arrays.toString(temp));
	}
}