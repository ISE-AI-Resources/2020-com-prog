import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Bisection {
	// DO NOT MODIFY THE MAIN METHOD
	public static void main(String[] args) {
		double[] data = readFromFile("bisection.in");
		double[] expected = readFromFile("bisection.out");
		for (int i = 0; i < data.length; i++) {
			System.out.format("Square root of %g is %.16f, expected: %.16f%n", data[i], bisection(data[i]), expected[i]);
		}
	}

	public static double bisection(double a) {
		double x = 0, l = 0, u = a;
		while(Math.abs(a - x*x) >= Math.pow(10,-10) * Math.max(a,x*x)){
			x = (l+u)/2;
			if(x*x > a) u = x;
			else l = x;
		}
		return x;  // do not modify this
	}

	// DO NOT MODIFY THIS METHOD
	private static double[] readFromFile(String filename) {
		try {
			Scanner f = new Scanner(new File(filename));

			// to find how many lines in the file
			int lines = 0;
			while (f.hasNext()) {
				f.nextLine();
				lines++;
			}
			
			double[] data = new double[lines];
			f = new Scanner(new File(filename));
			for (int i = 0; i < lines; i++) {
				data[i] = f.nextDouble();
			}
			return data;
		} catch (FileNotFoundException e) {
			System.err.println("File not found: " + filename);
			System.exit(-1);
		}
		return null;
	}
}