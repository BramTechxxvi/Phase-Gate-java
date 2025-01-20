public class Palindrome {

	public static Boolean isPalindrome(int number) {
		int reverse = 0;
		int temp = number;
	while(temp != 0) {
	reverse = (reverse * 10) + (temp % 10);
	temp = temp / 10;
	}
		return (reverse == temp);

}



	public static void main(String...args) {
	System.out.println(isPalindrome(11111));




	}



}