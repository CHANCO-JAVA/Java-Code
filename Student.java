import java.util.Scanner;
public class Student {
		public static void main(String[] args) {
		int grade = 0;
		String name,courseName = " ";
		int yearOfStudy,GPA = 0;
		int TotalGPA = 0,numCourses = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name");
		name = input.nextLine();
		
		System.out.println("Enter your year of study");
		yearOfStudy = input.nextInt();
		
		if(yearOfStudy == 1 || yearOfStudy == 2) {
			System.out.println("You are supposed to enter grades for 3 courses");
			for(int i=1; i<4; i++) {
				System.out.println("Enter Course "+i);
				courseName = input.next();
				
				System.out.println("Enter your grade");
				grade = input.nextInt();
			}
		}else if(yearOfStudy == 3 || yearOfStudy == 4) {
			System.out.println("You are supposed to enter grades for  2 courses  ");
			for(int k = 1; k < 3; k++) {
				System.out.println("Enter Course "+k);
				courseName = input.next();
				
				System.out.println("Enter your grade");
				grade = input.nextInt();
			}
		}else{System.out.println("You are not eligible!!");}
		
		if(grade == 0 || grade < 50) {
			GPA = 0;
		}
		else if(grade==50 || grade <= 60) {
			GPA = 2;
		}
		else if(grade==61 || grade <= 70) {
			GPA = 3;
		}
		else if(grade==71 || grade <= 80) {
			GPA = 4;
		}
		else if (grade ==81|| grade <= 100) {
			GPA = 5;
		}
		else {
			System.out.println("Value out of range!!");
		}
		
//printing all the contents to the user	
System.out.println(name + " "+"Year of study " + yearOfStudy + " " + courseName + " " + grade + " "+"Your GPA is " + GPA);	
	}
		
//method for getting the average GPA
public int avgGPA(int GPA) {
	int avgGPA = 0;
	int totalGPA = 0;
	 totalGPA+=GPA;
	 int numCourses = 0;
	return totalGPA/numCourses;
	
 }	
}
