public class IntegerTarget {

	public static int[] array(int[] num) {
		int target = 9;
		int[] numbers;
	for(int index = 0; index < num.length; index++) {
	if (num[index] + num[index] == target) {
		numbers = (num[index]);
	}
	}

		return numbers;
	}




	public static void main(String... args) {
		System.out.println(array());

	}


}