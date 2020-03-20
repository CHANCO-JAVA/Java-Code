import java.util.Scanner;
public class Student {
	double totalGrade = 0.0;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = input.nextLine();
		for(int i = 1; i < 4; i++) {
			System.out.println("Enter grade" + i);
			double grades = input.nextDouble();
		}
		
Students student = new Students();
System.out.println("Student name is "+name+ " average grade is "+student.getAverageGrade());
System.out.println(" and curent number of students is "+ student.getNumberOfStudents());	
	}
	//method for finding total grade
		public double averageGrade(double grades){
			double totalGrade = 0.0;
			totalGrade += grades;
			return totalGrade/3;
			}

	

}
