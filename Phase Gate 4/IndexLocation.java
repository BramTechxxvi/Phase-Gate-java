public class IndexLocation {

	public static int police(int number, int[][] array,) {
			int total = 0;
		for (int row = 0; row < array.length; row++) {
		for (int col = row+ 1; col < array[row][col].length; col++) {
			if(number == array[row][col]) {
				total = array[row][col];
			}
		}
		}

}
	
	public static viod 
	