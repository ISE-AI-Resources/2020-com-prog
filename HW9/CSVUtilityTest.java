import java.io.FileNotFoundException;

public class CSVUtilityTest {
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Expected:");
		ArrayUtility.show(CSVUtilityGiven.readFile("data.txt"));
		System.out.println("Your result:");
		//ArrayUtility.show(CSVUtility.readFile("data.txt"));
		System.out.println("----------------------------------------");
		System.out.println("Expected:");
		ArrayUtility.show(CSVUtilityGiven.readCSV("data.txt", false));
		System.out.println("Your result:");
		//ArrayUtility.show(CSVUtility.readCSV("data.txt", false));
		System.out.println("----------------------------------------");
		System.out.println("Expected:");
		ArrayUtility.show(CSVUtilityGiven.readCSV("data.txt", true));
		System.out.println("Your result:");
		//ArrayUtility.show(CSVUtility.readCSV("data.txt", true));
		System.out.println("----------------------------------------");
		System.out.println("Expected:");
		ArrayUtility.show(CSVUtilityGiven.readCSV("course-db.csv", false));
		System.out.println("Your result:");
		//ArrayUtility.show(CSVUtility.readCSV("course-db.csv", false));
		System.out.println("----------------------------------------");
		System.out.println("Expected:");
		ArrayUtility.show(CSVUtilityGiven.readCSV("course-db.csv", true));
		System.out.println("Your result:");
		//ArrayUtility.show(CSVUtility.readCSV("course-db.csv", true));
	}
	
}
