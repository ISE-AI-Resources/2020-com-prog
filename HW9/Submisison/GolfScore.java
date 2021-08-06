
//package solution;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class GolfScore {
	public static void main(String[] args) throws FileNotFoundException {

		// uncomment each testXXX() method to test that the corresponding method works properly
		// when finish uncomment run()

		//testGetGolfers();

		//testGetScores();

		//testGetCourseName();

		//testGetCoursePar();

		//testCalculateScore();

		//testCalculateHandicap();

		String filename = args.length == 0? "golf-score-2.csv" : args[0];
		run(filename);
	}

	public static void run(String scoreFile) throws FileNotFoundException {
		// 1. get golfer's names from golf-score-1.csv
		String[] golfers = getGolfers(scoreFile);

		// 2. get golfer's scores from golf-score-1.csv
		int[][] golfScoreList = getScores(scoreFile);

		// 3. get course name from golf-score-1.csv
		String courseName = getCourseName(scoreFile);

		// 4. get course par from course-db.csv
		int[] coursePar = getCoursePar("course-db.csv", courseName);

		// 5. calculate out, in, and total for each golfer
		int[][] scores = calculateScore(golfScoreList);

		// 6. calculate handicap for each golfer
		int[] hc = calculateHandicap(golfScoreList, coursePar);

		// 7. print the result: golfer's name, out, in, total, hc
		printResult(golfers, scores, hc);

	}

	/**
	 * get golfers name from given CSV file using provided CSVUtility class golfer's
	 * name are the first elements in each sub array
	 * 
	 * Each line of CSV file is in format: golfer's
	 * name,h1,h2,h3,h4,h5,h6,h7,h8,h9,h10,h11,h12,h13,h14,h15,h16,h17,h18
	 * 
	 * @param csvFilename csv file that contain golfers and their scores
	 * @return all golfer's names in array of String
	 * @throws FileNotFoundException 
	 */
	public static String[] getGolfers(String csvFilename) throws FileNotFoundException {
		String[][] csv = CSVUtility.readCSV(csvFilename,true);
		String[] name = new String[csv.length];
		for(int i = 0; i < name.length; i++) {
			name[i] = csv[i][0];
		}
		return name;
		
	}

	/**
	 * get all score from CSV file
	 * 
	 * @param csvFilename csv file that contains golfers and their scores
	 * @return 2D array of int that each element contains scores of each golfer
	 */
	public static int[][] getScores(String csvFilename) throws FileNotFoundException {
		String[][] csv = CSVUtility.readCSV(csvFilename,true);
		int[][] scores = new int[csv.length][csv[0].length - 1];
		for(int i = 0; i < csv.length; i++) {
			for(int j = 0; j < csv[i].length - 1; j++) {
				scores[i][j] = Integer.parseInt(csv[i][j+1]);
			}
		}
 		return scores;
	}

	/**
	 * gets course name for csv file. Course name is the first line.
	 * 
	 * @param csvFilename
	 * @return
	 */
	public static String getCourseName(String csvFilename) throws FileNotFoundException{
		String[][] csv = CSVUtility.readCSV(csvFilename,false);
		return csv[0][0];

	}

	/**
	 * gets course 18-hole par for given course name extracted from csv file
	 * 
	 * @param csvFilename
	 * @param courseName
	 * @return
	 * @throws FileNotFoundException 
	 */
	public static int[] getCoursePar(String csvFilename, String courseName) throws FileNotFoundException {
		String[][] csv = CSVUtility.readCSV(csvFilename,false);
		int[] course = new int[csv[0].length-1];
		for(int i = 0; i < csv.length; i++) {
			if(courseName.equals(csv[i][0])) {
				for(int j = 0; j < csv[i].length-1; j++) {
					course[j] = Integer.parseInt(csv[i][j+1]);
				}
			}
		}
		return course;
	}

	/**
	 * calculate handicap using System-36
	 * 
	 * @param scores
	 * @param par
	 * @return handicap of all golfers
	 */
	public static int[] calculateHandicap(int[][] scores, int[] par) {
		int[] playerScores = new int[scores.length];
		//iterating through each player
		for(int i = 0; i < scores.length; i++) {
			int cnt = 0;
			for(int j = 0; j < scores[i].length; j++) {
				cnt += calculateHoleHandicap(par[j],scores[i][j]);
			}
			playerScores[i] = cnt;
		}
		return playerScores;
	}

	/**
	 * calculate handicap for a hole from par and player's score
	 * 
	 * @param par   hole's par number (3, 4, or 5)
	 * @param score player's score
	 * 
	 * @return calculated handicap, 0 if score - par is 0, 1 if score - par is equal
	 *         to 1 and 2 otherwise
	 */
	public static int calculateHoleHandicap(int par, int score) {
		if(score - par <= 0) {
			return 0;
		}
		else if(score - par == 1) {
			return 1;
		}
		return 2;
	}

	/**
	 * calculates: sum(hole1 to hole9) -> out sum(hole10 to hole18) -> in out + in
	 * -> total
	 * 
	 * @param golfScoreList
	 * @return out, in, total for all players
	 */
	public static int[][] calculateScore(int[][] golfScoreList) {
		int[][] golfScore = new int[golfScoreList.length][3];
		for(int i = 0; i < golfScoreList.length; i++) {
			int in = 0, out = 0;
			for(int j = 0; j < golfScoreList[i].length; j++) {
				if(j < 9) {
					in += golfScoreList[i][j];
				}
				else {
					out += golfScoreList[i][j];
				}
			}
			golfScore[i][0] = in;
			golfScore[i][1] = out;
			golfScore[i][2] = in+out;
		}
		return golfScore;
	}

	public static void printResult(String[] golfers, int[][] scores, int[] hc) {
		System.out.println("    Name:\tOUT\tIN\tTOTAL\tHC");
		System.out.println("------------------------------------------");
		for (int i = 0; i < golfers.length; i++) {
			int out = scores[i][0];
			int in = scores[i][1];
			int total = scores[i][2];
			System.out.format("%s:\t%d\t%d\t%d\t%d\n", golfers[i], out, in, total, hc[i]);
		}
	}

	// test methods

	private static void testGetGolfers() throws FileNotFoundException {
		String[] golfers = getGolfers("golf-score-1.csv");
		System.out.println("Expected:");
		System.out.println("[Player01, Player02, Player03, Player04, Player05, "
				+ "Player06, Player07, Player08, Player09, Player10]");
		ArrayUtility.show(golfers);
	}

	private static void testGetScores() throws FileNotFoundException {
		int[][] scores = getScores("golf-score-1.csv");
		int[][] expected = { { 4, 4, 6, 3, 4, 5, 4, 6, 6, 6, 3, 5, 4, 6, 4, 4, 3, 6 },
				{ 4, 5, 6, 4, 5, 4, 5, 4, 8, 9, 4, 5, 5, 6, 5, 4, 4, 5 },
				{ 4, 5, 5, 4, 6, 5, 5, 5, 7, 6, 3, 6, 4, 6, 5, 5, 4, 5 },
				{ 5, 6, 4, 3, 5, 4, 4, 4, 6, 5, 2, 7, 4, 7, 5, 7, 4, 6 },
				{ 4, 3, 4, 4, 4, 5, 4, 4, 5, 5, 4, 5, 5, 5, 5, 4, 5, 4 },
				{ 3, 4, 4, 3, 3, 4, 4, 4, 5, 5, 4, 5, 3, 5, 3, 4, 3, 6 },
				{ 6, 4, 6, 4, 5, 5, 5, 3, 6, 4, 4, 5, 4, 5, 5, 5, 3, 4 },
				{ 4, 6, 5, 3, 4, 6, 4, 3, 4, 4, 2, 5, 4, 5, 4, 4, 3, 4 },
				{ 5, 5, 8, 4, 5, 4, 4, 3, 5, 5, 4, 5, 3, 6, 6, 5, 4, 5 },
				{ 5, 4, 5, 3, 4, 4, 4, 2, 5, 5, 3, 6, 4, 5, 4, 6, 5, 5 } };
		ArrayUtility.show(scores);
		System.out.println("Comparing with Expected:");
		for (int i = 0; i < expected.length; i++) {
			System.out.print(Arrays.compare(expected[i], scores[i]) + " ");
		}
		System.out.println();
		System.out.println("0 0 0 0 0 0 0 0 0 0 - expected compare result");
	}

	private static void testGetCourseName() throws FileNotFoundException {
		String courseName = getCourseName("golf-score-1.csv");
		System.out.println("Expected: course-02");
		System.out.println(courseName);
	}

	private static void testGetCoursePar() throws FileNotFoundException {
		int[] coursePar = getCoursePar("course-db.csv", "course-02");
		System.out.println("[4, 4, 3, 4, 5, 3, 5, 4, 4, 4, 5, 3, 5, 4, 4, 3, 4, 4] - expected");
		ArrayUtility.show(coursePar);
	}

	private static void testCalculateScore() throws FileNotFoundException {
		int[][] golfScoreList = getScores("golf-score-1.csv");
		int[][] scores = calculateScore(golfScoreList);
		int[][] expected = {{42, 41, 83}, {45, 47, 92}, 
							{46, 44, 90}, {41, 47, 88},
							{37, 42, 79}, {34, 38, 72},
							{44, 39, 83}, {39, 35, 74},
							{43, 43, 86}, {36, 43, 79}
							};
		ArrayUtility.show(expected);
		System.out.println("---");
		ArrayUtility.show(scores);
	}

	private static void testCalculateHandicap() {
		int[][] scores = { { 4, 4, 6, 3, 4, 5, 4, 6, 6, 6, 3, 5, 4, 6, 4, 4, 3, 6 },
				{ 4, 5, 6, 4, 5, 4, 5, 4, 8, 9, 4, 5, 5, 6, 5, 4, 4, 5 },
				{ 4, 5, 5, 4, 6, 5, 5, 5, 7, 6, 3, 6, 4, 6, 5, 5, 4, 5 } };
		int[] par = { 4, 4, 3, 4, 5, 3, 5, 4, 4, 4, 5, 3, 5, 4, 4, 3, 4, 4 };
		System.out.println("[17, 15, 19] - expected");
		ArrayUtility.show(calculateHandicap(scores, par));
	}
}
