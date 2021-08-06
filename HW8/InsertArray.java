package hw8;
public class InsertArray {

	public static int[] insert(int[] a, int[] b, int pos) {
		//fill code

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3, 4};
		int[] b = { 5, 6, 7};
		int[] c = { 8, 9, 10, 11, 12}; 

		System.out.print("Printing array a: ");  Replace.printArray(a);
		System.out.print("Printing array b: ");  Replace.printArray(b);
		System.out.print("Printing array c: ");  Replace.printArray(c);

		System.out.println("Now calling inserts!");
		System.out.println("------------------------");
		int[] d = insert(a,b,1); 
		int[] e = insert(a,b,4);
		int[] f = insert(b,a,0);
		int[] g = insert(c,a,3);
		int[] h = insert(c,a,-1);
		int[] i = insert(c,a,7); 

		System.out.print("Printing array a, expecting {1,2,3,4} : ");  Replace.printArray(a);
		System.out.print("Printing array b, expecting {5,6,7} : ");  Replace.printArray(b);
		System.out.print("Printing array c, expecting {8,9,10,11,12} : ");  Replace.printArray(c);
		System.out.print("Printing array d, expecting {1,5,6,7,2,3,4} : ");  Replace.printArray(d);
		System.out.print("Printing array e, expecting {1,2,3,4,5,6,7} : ");  Replace.printArray(e);
		System.out.print("Printing array f, expecting {1,2,3,4,5,6,7}: ");  Replace.printArray(f);
		System.out.print("Printing array g, expecting {8,9,10,1,2,3,4,11,12} : ");  Replace.printArray(g);
		System.out.print("Printing array h, expecting {1,2,3,4,8,9,10,11,12} : ");  Replace.printArray(h);
		System.out.print("Printing array i, expecting {8,9,10,11,12,1,2,3,4} : ");  Replace.printArray(i);

	}

}
