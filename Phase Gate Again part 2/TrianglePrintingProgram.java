public class TrianglePrintingProgram {

	public static void main(String... trangle) {
		int starCount = 10;
	System.out.print("(a)\t\t(b)\t  (c)\t\t(d)");
	for (int count = 1; count <= starCount; count++ ) {
		System.out.println();
	for(int counter = 0; counter < count; counter++) {		
			System.out.print("*");
	}
	for (int counter = starCount; counter >= count; counter--) {
			System.out.print(" ");
	}
		
			System.out.print("  ");
	for (int counter = starCount; counter >= count; counter--) {		
			System.out.print("*");
	}
	for (int counter = 0; counter < count; counter++) {
			System.out.print(" ");
	}

			System.out.print("  ");
	for(int counter = 0; counter < count; counter++) {		
			System.out.print(" ");
	}
	for (int counter = starCount; counter >= count; counter--) {
			System.out.print("*");
	}

			System.out.print("   ");
	for (int counter = starCount; counter >= count; counter--) {
			System.out.print(" ");
	}
	for(int counter = 0; counter < count; counter++) {		
			System.out.print("*");
	}





	}









	}
} 