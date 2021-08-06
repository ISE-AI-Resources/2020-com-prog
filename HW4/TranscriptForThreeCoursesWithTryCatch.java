import java.util.Scanner;

public class TranscriptForThreeCoursesWithTryCatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter student id: ");
		String studentID = sc.nextLine();

		StudentGPAX s0 = new StudentGPAX(studentID);

		try {

			System.out.print("Enter course1's id: ");
			String course1ID = sc.nextLine();

			System.out.print("Enter course1's credit: ");
			int course1Credit = sc.nextInt();
			sc.nextLine();

			System.out.print("Enter course1's grade: ");
			int course1Grade = sc.nextInt();
			sc.nextLine();

			System.out.println();

			System.out.print("Enter course2's id: ");
			String course2ID = sc.nextLine();

			System.out.print("Enter course2's credit: ");
			int course2Credit = sc.nextInt();
			sc.nextLine();

			System.out.print("Enter course2's grade: ");
			int course2Grade = sc.nextInt();
			sc.nextLine();

			System.out.println();

			System.out.print("Enter course3's id: ");
			String course3ID = sc.nextLine();

			System.out.print("Enter course3's credit: ");
			int course3Credit = sc.nextInt();
			sc.nextLine();

			System.out.print("Enter course3's grade: ");
			int course3Grade = sc.nextInt();
			sc.nextLine();

			System.out.println();

			s0.addCourseGrade(course1ID, course1Credit, course1Grade);
			s0.addCourseGrade(course2ID, course2Credit, course2Grade);
			s0.addCourseGrade(course3ID, course3Credit, course3Grade);
			s0.computeGPAX();
			
		} catch (ArithmeticException e) {
			System.out.println("credit must be greater than 0!");
			System.exit(0);
		} catch (Exception e) {
			System.out.println("credit & grade must be numeric!");
			System.exit(0);
		}
		
		System.out.format("GPAX of %s is %.2f (%d/%d)\n", s0.studentID, s0.gpax, s0.totalGradePoint, s0.totalCredit);

		System.out.println("Finish the program: " + ((s0.totalCredit >= StudentGPAX.MIN_CREDIT)&&(s0.gpax >= StudentGPAX.MIN_GPAX)));

	}
}