import java.util.Scanner;
import java.util.InputMismatchException;
public class TranscriptForThreeCourses
{	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		String course = "";
		double credit = 0,grade = 0;

		System.out.print("Enter student id: ");
		StudentGPAX student = new StudentGPAX(sc.nextLine());
		try
		{
			System.out.print("Enter course1's course id: ");
			course = sc.nextLine();
			System.out.print("Enter course1's credit: ");
			credit = sc.nextDouble();
			System.out.print("Enter course1's grade: ");
			grade = sc.nextDouble();
			sc.nextLine();

			student.addCourseGrade(course,credit,grade);

			System.out.print("\nEnter course2's course id: ");
			course = sc.nextLine();
			System.out.print("Enter course2's credit: ");
			credit = sc.nextDouble();
			System.out.print("Enter course2's grade: ");
			grade = sc.nextDouble();
			sc.nextLine();
			
			student.addCourseGrade(course,credit,grade);

			System.out.print("\nEnter course3's course id: ");
			course = sc.nextLine();
			System.out.print("Enter course3's credit: ");
			credit = sc.nextDouble();
			System.out.print("Enter course3's grade: ");
			grade = sc.nextDouble();
			sc.nextLine();
			
			student.addCourseGrade(course,credit,grade);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Error: grade and credit must be a number!");
			System.exit(0);
		}
		student.computeGPAX();
		System.out.format("GPAX of %s is %.2f (%.2f/%.2f)\n",student.studentID,student.gpax,student.totalGradePoint,student.totalCredit);
		System.out.println("Finish program: " + (student.totalCredit >= StudentGPAX.MIN_CREDIT && student.gpax >= StudentGPAX.MIN_GPAX));

	}
	
}