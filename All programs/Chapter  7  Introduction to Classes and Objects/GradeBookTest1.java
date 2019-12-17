// Fig. 7.17: GradeBookTest1.java
// GradeBookTest1 creates GradeBook object using a two-dimensional array
// of grades, then invokes method processGrades to analyze them.

public class GradeBookTest1 {
	// main method begins program execution
	public static void main(String[] args) {
		// two-dimensional array of student grades
		int[][] gradesArray = {{87, 96, 70},
							   {68, 87, 90},
							   {94, 100, 90},
							   {100, 81, 82},
							   {83, 65, 85},
							   {78, 87, 65},
							   {85, 75, 83},
							   {91, 94, 100},
							   {76, 72, 84},
							   {87, 93, 73}};
		
		GradeBook1 myGradeBook = new GradeBook1(
				"CS101 Introduction to Java Programming", gradesArray);
		System.out.printf("Welcome to the grade book for%n%s%n%n",
				myGradeBook.getCourseName());
		myGradeBook.processGrades();
	}
}
