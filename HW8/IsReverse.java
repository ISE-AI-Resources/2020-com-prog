package hw8;
public class IsReverse {

	public static boolean isReverse(int[] a, int[] b) {
		//fill code
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 2, 3, 4, 5 };
		int[] b = { 5, 4, 3, 2, 2, 1 };
		int[] c = { 1, 2, 0, 3, 4, 5 };
		int[] d = { 1, 2, 2, 3, 4, 5, 0 };
		int[] e = { 0, 5, 4, 3, 2, 2, 1 };
		int[] f = null;
		int[] g = null;

		System.out.println("isReverse(a,b): "+ isReverse(a,b) + ", expected to be true");

		System.out.println("isReverse(b,c):" +isReverse(b,c) + ", expected to be false");
		System.out.println("isReverse(a,c):" +isReverse(a,c) + ", expected to be false");
		System.out.println("isReverse(d,e):" +isReverse(d,e) + ", expected to be true");
		System.out.println("isReverse(e,d):" +isReverse(e,d) + ", expected to be true");
		System.out.println("isReverse(d,b):" +isReverse(b,d) + ", expected to be false");
		System.out.println("isReverse(f,g):" +isReverse(f,g) + ", expected to be true");
		System.out.println("isReverse(f,a):" +isReverse(f,a) + ", expected to be false");
		System.out.println("isReverse(a,f):" +isReverse(a,f) + ", expected to be false");

	}

}
