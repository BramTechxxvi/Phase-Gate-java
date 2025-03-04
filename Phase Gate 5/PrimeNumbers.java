public class PrimeNumbers {
	
	public static int prime(int number) {
		int total = 0;
	for (int count = 1; count < number; count++) {
		if (count % 2 != 0 && count % 3 != 0) {
			total++;
		}
	}
		return total;
	}

	public static void main(String... Bram) {
	System.out.println(prime());

	}

}