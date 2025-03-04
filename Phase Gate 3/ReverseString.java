public class ReverseString {

	public static String reverseString(String reversal) {
		String result = "";
		int len = reversal.length() -1;
	for(int count = 0; count < reversal.length(); count++) {
		result+=reversal.charAt(len);
		len--;
	}
		return result;
}



	public static void main(String... args) {
		String bro = "ABCD";
		System.out.print(reverseString(bro));


	}



}