
public class Students extends Student {
	private String name;
	private double[] grades = new double[3];
	private int numberOfStudents;
	private double averageGrade;
	
	public Students() {
		
		}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setGrades(double[] grades) {
		this.grades = grades;
		
	}
	public double[] getGrades() {
		return grades;
	}
	public int getNumberOfStudents() {
		return numberOfStudents+1;
		
	}
	/*public void setAverageGrade(double grade) {
		this.averageGrade = averageGrade;
	}*/
	public double getAverageGrade() {
		return averageGrade;
	}

}
