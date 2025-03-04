public class ReverseString {

	public static String reverse(String wordReverse) {
		String temp = "";
		int kuta = wordReverse.length() -1;
	for (int count = 0; count < wordReverse.length(); count++) {
		temp+= wordReverse.charAt(kuta);
		kuta--;
	}
		return temp;
	}

	public static void main(String... Bram) {
		String word = "How are you";
		System.out.println(reverse(word));
	}
}
