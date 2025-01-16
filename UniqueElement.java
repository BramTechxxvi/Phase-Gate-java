public class UniqueElement {

	public static int[] num(int[] array) {
		int[] numbers = {1, 2, 3, 2};
		int[] unique = new int [4];
	if (numbers[0] == numbers[1] || numbers[0] == numbers[2] || numbers[0] == numbers[3]) {
		unique[0] = numbers[0];
		}
	if (numbers[1] == numbers[0] || numbers[1] == numbers[2] || numbers[1] == numbers[3]) {
		unique[1] = numbers[1];
		}
	if (numbers[2] == numbers[0] || numbers[2] == numbers[1] || numbers[2] == numbers[3]) {
		unique[2] = numbers[2];
		}
	if (numbers[3] == numbers[0] || numbers[3] == numbers[1] || numbers[3] == numbers[2]) {
		unique[3] = numbers[3];
		}

		int[] total = new int[0];
	for(int index = 0; index < unique.length; index++) {
			total+=unique[index];
	}
			return total;

		}


	public static void main(String... args) {
	//System.out.print(unique);







		}






}