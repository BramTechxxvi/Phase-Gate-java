// prompt user to take two integer inputs
// collect and store integers
// compare to find largest
// loop through largest
// 


public class CommonDivisor {

	public static int divisor(int userInput1, int userInput2) {
		int save = 0; int largest;
		if (userInput1 > userInput2){
			largest = userInput1;
		} else {
			largest = userInput2;
		}
	for (int count = 1; count < largest; count++) {
		if (userInput1 % count == 0 && userInput2 % count == 0) {
			save = count;
		}
	}
		return save;			
	}

	public static void main(String... Tope) {
		int input1 = 1; int input2 = 0;
		System.out.println(divisor(input1, input2));

		int input3 = 16; int input4 = 24;
		System.out.println(divisor(input3, input4));

		int input5 = 125; int input6 = 2525;
		System.out.println(divisor(input5, input6));


	}
}