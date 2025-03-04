public class HighestIndex {

	public static int highest(int[] input1, int[] input2) {
		int[] concat = new int[input1.length + input2.length];
        
	for (int index = 0; index < input1.length; index++) {
		concat[index] = input1[index];
	}
	for (int counter = 0; counter < input2.length; counter++) {
		concat[input1.length + counter] = input2[counter];
	}
	
		int user = concat.length;
	for (int count = 0; count < user - 1; count++) {
	for (int countt = 0; countt < user - 1 - count; countt++) {
		if (concat[countt] < concat[countt + 1]) {
			int temp = concat[countt];
			concat[countt] = concat[countt + 1];
			concat[countt + 1] = temp;
		}
		
	}

	}

	for (int countte = 0; countte < concat.length; countte++) {
	}
	
	}

	public static void main(String[] args) {
		int[] input1 = {3, 2, 5};
		int[] input2 = {6, 9, 8};
	System.out.println(highest())