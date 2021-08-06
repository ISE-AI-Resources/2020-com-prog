
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CSVUtility {
	
	/**
	 * reads all lines in given filename into an array of String
	 * @param filename
	 * @return array of String, each element in array is each line in file
	 * @throws FileNotFoundException
	 */
	public static String[] readFile(String filename) throws FileNotFoundException {
		Scanner dummy = new Scanner(new File(filename));
		Scanner file = new Scanner(new File(filename));
		int cnt = 0;
		while(dummy.hasNextLine()) {
			dummy.nextLine();
			cnt++;
		}
		String[] fileS = new String[cnt];
		for(int i = 0; i < cnt; i++) fileS[i] = file.nextLine();
		return fileS;

	}

	/**
	 * read given CSV file into 2D array of String
	 * @param filename CSV file
	 * @param header true if CSV file has a header line.  The first line is header. The data start from second line.
	 * @return
	 * @throws FileNotFoundException
	 */
	public static String[][] readCSV(String filename, boolean header) throws FileNotFoundException {
		String[] file = readFile(filename);
		int max = 0;
		int head = header?1:0;
		for(int i = 0; i < file.length; i++) {
			max = Math.max(file[i].split(",").length, max);
		}
		String[][] csv = new String[file.length-head][max];
		for(int i = head; i < file.length; i++) {
			csv[i-head] = file[i].split(",");
		}
		return csv;
	}


	
}
