public class DivisibleByThree {

	public int getTotal(int input) {
		int total = 0;
	for (int count = 1; count < input; count++) {
		if (count % 3 == 0) 
			total+=count;
	}
	return total;
}

	public static void main(String... args) {
	DivisibleByThree myMethod = new DivisibleByThree();
	int number = 30;
	System.out.print(myMethod.getTotal(number));
	}
}