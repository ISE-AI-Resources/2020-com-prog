
public class ArrayUtilityTest {
	public static void main(String[] args) {
		testMerge();
		testSplit();
	}
	
	public static void myTestSplit() {
		// add your code and some testcases the test split() similar to testSplit()
	}

	public static void myTestMerge() {
		// add your code and some testcases the test merge() similar to testMerge()
	}

	// do no modify this method
	private static void testSplit() {
		int[] c = { 1, 2, 3, 4, 5, 6 };
		ArrayUtility.show(ArrayUtility.split(c, 1));
		System.out.println("Expected:\n[1, 2, 3, 4, 5, 6]\n----------");
		ArrayUtility.show(ArrayUtility.split(c, 2));
		System.out.println("Expected:\n[1, 2, 3]\n[4, 5, 6]\n----------");
		ArrayUtility.show(ArrayUtility.split(c, 3));
		System.out.println("Expected:\n[1, 2]\n[3, 4]\n[5, 6]\n----------");
		ArrayUtility.show(ArrayUtility.split(c, 4));
		System.out.println("Expected: Array size 6 cannot be splitted into 4 parts\n----------");
		ArrayUtility.show(ArrayUtility.split(c, 5));
		System.out.println("Expected: Array size 6 cannot be splitted into 5 parts\n----------");
		ArrayUtility.show(ArrayUtility.split(c, 6));
		System.out.println("Expected:\n[1]\n[2]\n[3]\n[4]\n[5]\n[6]\n----------");
		ArrayUtility.show(ArrayUtility.split(c, 0));
		System.out.println("Expected: n must be >= 0\n----------");
		ArrayUtility.show(ArrayUtility.split(c, -1));
		System.out.println("Expected: n must be >= 0\n----------");
		ArrayUtility.show(ArrayUtility.split(c, 7));
		System.out.println("Expected: n cannot be greater than array's size, 6\n----------");
	}

	// do not modify this method
	private static void testMerge() {
		int[][] a = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8, 9 }, { 10 } };
		ArrayUtility.show(ArrayUtility.merge(a));
		System.out.println("[1, 2, 3, 4, 5, 6, 7, 8, 9, 10] - Expected");
		int[][] b = { { 1, 2, 3, 4 }, { 4, 5, 6, 7 }, { 7, 8, 9, 10 }, { 10, 11, 12, 13 } };
		ArrayUtility.show(ArrayUtility.merge(b));
		System.out.println("[1, 2, 3, 4, 4, 5, 6, 7, 7, 8, 9, 10, 10, 11, 12, 13] - Expected");
	}

}
