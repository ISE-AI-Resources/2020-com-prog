// import as needed
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;


public class MultipleChoiceApp {
	public static void main(String[] args) {
		String file = args[0];
		ArrayList<String> line = readFromFile(file);
		String expected = "";
		boolean first = true, exp = true;
		for(String s: line){
			if(first) {
				expected = s;
				first = false;
			}
			else{
				String[] set = s.split("\\s+");
				String res = "";
				int max = 0;
				int cnt = 0;
				for(int i = 0; i < set[1].length(); i++){
					if(set[1].charAt(i) == expected.charAt(i)){
						res += expected.charAt(i);
						cnt++;
					}
					else{
						res += "-";
					}
					max++;
				}
				if(exp){
					System.out.println("\t\t" + "[" + max + "]" + "\t\t" + "{" + expected + "}");
					exp = false;
				}
				System.out.println(set[0] + "\t\t" + "[" + cnt +"]" + "\t\t" + "{" + res + "}");
			}
		}
	}
	static ArrayList<String> readFromFile(String filename) {
		ArrayList<String> result = new ArrayList<String>();
		try {
			Scanner fin = new Scanner(new File(filename));
			while (fin.hasNext()) {
				result.add(fin.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + filename);
		}
		return result;
	}
}