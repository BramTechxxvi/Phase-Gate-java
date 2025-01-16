public class SmallestIndex {

	public static int[] smallest(int[] numbers){
		numbers[0] = largest;
		for (int index = 0; index < numbers.length; index++) {
		if(numbers[index] > largest){
				largest = numbers[index];
		}
		}
			return largest;
	}


	public static void main(String... args) {
		System.out.println(smallest(1, 5, 3, 4, 5, 5));

	}

}