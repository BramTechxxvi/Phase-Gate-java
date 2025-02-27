public class GreatestCommonDivisor {

	public int findGreatestDivisor(int firstNumber, int secondNumber) {
		int store = 0; int largest = 0;
		if (firstNumber > secondNumber) {
			largest = firstNumber;
		} else{
			largest = secondNumber;
		}
	for (int count = 1; count < largest; count++) {
		if (firstNumber % count ==0 && secondNumber % count == 0) {
			store = count;
	}
	}
		return store;
	}

	public static void main(String... args) {
	GreatestCommonDivisor myMethod = new GreatestCommonDivisor();
		int input1 = 16; int input2 = 24;
	System.out.println("Result is: " + myMethod.findGreatestDivisor(input1, input2));
		int num1 = 75; int num2 = 30;
	System.out.print("Result is: " + myMethod.findGreatestDivisor(num1, num2));


	
	}




}