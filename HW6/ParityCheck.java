import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class ParityCheck {
	// DO NOT MIDIFY THE MAIN METHOD
	public static void main(String[] args) {
		String filename = args[0];
		ArrayList<Integer> data = readFromFile(filename);
		System.out.println("Data read from: " + filename);
		for (int number: data) {
			String bin = Integer.toBinaryString(number);
			int ones = countOnes(bin);
			String parityText = parity(bin);
			System.out.println(number + ":");
			System.out.println("\tBinary:\t" + bin);
			System.out.println("\t# of 1's = " + ones);
			System.out.println("\tparity: " + parityText);
		}
	}

	/**
	 * Counts the number of 1's in a binary string
	 * @param binaryString binary number to be counted
	 * @return the total number of 1's in binaryString
	 */
	public static int countOnes(String binaryString) {
		for(int i = 0; i < binaryString.length(); i++) {
			if(binaryString.charAt(i) == '1') n++;
		}
		return n;
	}

	/**
	 * Determines if the given binary string is ODD or EVEN
	 * @param binaryString the binary string to find parity
	 * @return "ODD" if the binary string is ODD and "even" otherwise
	 */
	public static String parity(String binaryString) {
		if(countOnes(binaryString)%2 == 0) return "EVEN";
		return "ODD";
	}

	// DO NOT MODIFY THIS METHOD
	private static ArrayList<Integer> readFromFile(String filename) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		try {
			Scanner fin = new Scanner(new File(filename));
			while (fin.hasNext()) {
				result.add(Integer.parseInt(fin.nextLine()));
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + filename);
		}
		return result;
	}

}