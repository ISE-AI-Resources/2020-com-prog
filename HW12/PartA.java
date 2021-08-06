
public class PartA {
	public static void main(String[] args) {
		testConstructor();
		A a = new A(2);
		A b = new B(3, 4);
		A c = new C(5, 6, 7);
		testF(a, b, c);
		testG(a, b, c);
//		testA();
//		testB();
//		testC();
	}
	private static void testF(A a, A b, A c) {
		System.out.println("--- Test f() of A, B, C ---");
		a.f();
		System.out.println("------------------------------");
		b.f();
		System.out.println("------------------------------");
		c.f();
		System.out.println("------------------------------");
	}
	private static void testG(A a, A b, A c) {
		System.out.println("--- Test g() of A, B, C ------");
		System.out.println(a.getClass() + ": " + a.g());
		System.out.println("------------------------------");
		System.out.println(b.getClass() + ": " + b.g());
		System.out.println("------------------------------");
		System.out.println(c.getClass() + ": " + c.g());
		System.out.println("------------------------------");
	}
	public static void testConstructor() {
		A.debug = true;
		A a = new A(2);
		System.out.println("------------------------------");
		A b = new B(3, 4);
		System.out.println("------------------------------");
		A c = new C(5, 6, 7);
		System.out.println("------------------------------");
		A.debug = false;
	}
	
	public static void testA() {
		System.out.format("new A(2).g() -> %d, [expected] -> %d\n", new A(2).g(), 3);
		System.out.format("new A(-1).g() -> %d, [expected] -> %d\n", new A(-1).g(), 0);
		System.out.format("new A(-10).g() -> %d, [expected] -> %d\n", new A(-10).g(), -9);
		System.out.format("new A(0).g() -> %d, [expected] -> %d\n", new A(0).g(), 1);
	}
	
	public static void testB() {
		System.out.format("new B(0, 0).g() -> %d, [expected] -> %d\n", new B(0, 0).g(), 2);	
		System.out.format("new B(-2, 3).g() -> %d, [expected] -> %d\n", new B(-2, 3).g(), 1);	
		System.out.format("new B(2, -3).g() -> %d, [expected] -> %d\n", new B(2, -3).g(), 3);	
		System.out.format("new B(4, 5).g() -> %d, [expected] -> %d\n", new B(4, 6).g(), 16);	
	}
	
	public static void testC() {
		System.out.format("new C(0, 0, 0).g() -> %d, [expected] -> %d\n", new C(0, 0, 0).g(), -8);	
		System.out.format("new C(2, 4, 3).g() -> %d, [expected] -> %d\n", new C(2, 4, 3).g(), 9);	
		System.out.format("new C(-1, -3, -5).g() -> %d, [expected] -> %d\n", new C(-1, -3, 5).g(), 2);	
		System.out.format("new C(5, 2, 10).g() -> %d, [expected] -> %d\n", new C(5, 2, 10).g(), 34);			
	}
}
