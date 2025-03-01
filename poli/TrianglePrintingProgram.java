public class TrianglePrintingProgram {

	public static void main(String... trangle) {
		int starCount = 10;
	System.out.print("(a)\t\t(b)\t\t(c)\t\t(d)");
	for (int count = 1; count <= starCount; count++ ) {
		System.out.println();
		for(int counter = 0; counter < count; counter++) {		
			System.out.print("*");

	}
			System.out.print("             ");
	}
	
			System.out.println("\n");

	for (int count2 = starCount; count2 >= 1; count2--) {
		for(int counter2 = 0; counter2 < count2; counter2++) {
		System.out.print("*");

	}
			System.out.println();
	}
			System.out.println();

	for (int count2 = 8; count2 <= starCount; count2++) {
		for(int counter2 = 0; counter2 < count2; counter2++) {
		System.out.print(" ");

	}
			System.out.println("*");
	}










	}
} 