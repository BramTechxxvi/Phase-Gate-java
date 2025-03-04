public class PrimeNumbers {

	public static int primeNumber(int number) {
			int total = 0;
		for(int index = 1; index < number; index++){
		if (index % 2 != 0 && index % 3 != 0) {
			total++;	

		}
		}

		return total;



}

	public static void main(String... args) {
	System.out.print(primeNumber(10));




}


}