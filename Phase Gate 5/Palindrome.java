public class Palindrome {

	public static boolean isPalindrome(int number) {
		int result = 0;
		int temp = number;
	while(temp != 0) {
		result = (result * 10) + (temp % 10);
		temp = temp / 10;
	}
		return (result == temp);
	}


	public static void main(String... Bram) {
		int digit = 11211;
	System.out.print(isPalindrome(digit));

	}
}