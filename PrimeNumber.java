public class PrimeNumber {


	public static boolean isPrime(int number) {
		if (number < 1 ) {
			return false;
		} else if (number % 2 == 0){
			return false;
		} else if (number % 3 == 0){
			return false;
		} else {
			return true;
		}
	}








	public static void main(String... args) {
		System.out.println(isPrime(7));

	}




}