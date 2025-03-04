import java.util.Arrays;
public class ConcatArray {

	public static int[] arrays(int[] input, int[] array) {
		int[] kiop = new int [input.length + array.length];
	for(int count = 0; count < input.length; count++) {
		kiop[count] = input[count];
	for(int counter = 0; counter < array.length; counter++){
		kiop[counter + input.length] =  array[counter];		
	}
		
	}
		return kiop;

	}



	public static void main(String... args) {
	int [] array = {1, 2, 3};
	int[] arr = {2, 3, 4};
		System.out.println(Arrays.toString(arrays(array, arr)));





	}

}