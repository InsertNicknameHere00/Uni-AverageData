package uni.fmi.bachelors;

public class Student extends Person {
	private double AverageGrade;

	public Student(String name, String gender, String eGN, double AverageGrade) {
		super(name, gender, eGN);
		this.AverageGrade = AverageGrade;
	}

	public double getAverageGrade() {
		return AverageGrade;
	}

	public void setAverageGrade(double avgGrade) {
		AverageGrade = avgGrade;
	}

}
