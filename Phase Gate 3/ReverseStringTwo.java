public class ReverseStringTwo {

	public static String reverse(String reversed) {
		String result = "";
		
		int length = reversed.length() -1;
	for(int count = 0; count < reversed.length(); count++) {
		result+=reversed.charAt(length);
		length--;
	}
		return result;
		
	}



public static void main (String... args) {
String reversed = "How are you";
System.out.print(reverse(reversed));


}










}