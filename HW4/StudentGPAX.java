
public class StudentGPAX {
	static double MIN_CREDIT = 3;
	static double MIN_GPAX = 2;

	String studentID;
	int totalCredit = 0;
	int totalGradePoint = 0;
	int totalCourse = 0;
	double gpax = 0;

	public StudentGPAX(String studentID) {
		this.studentID = studentID;
	}

	public void addCourseGrade(String courseID, int credit, int grade) {
		this.totalCredit += credit;
		this.totalGradePoint += (grade * credit);
		++this.totalCourse;
	}
	
	public void computeGPAX() {
   		int tmp = this.totalGradePoint / this.totalCredit;
   		this.gpax = (double) this.totalGradePoint / this.totalCredit;
   		
	}
}

