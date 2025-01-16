public class Factors {

	public static int factor(int number) {
		int result = 0;
		for(int index = 1; index <= number; index++) {
		if(number % index == 0) {
			result++;
	}}
		return result;
	}

	public static void main(String... args) {
System.out.println(factor(10));


}
}