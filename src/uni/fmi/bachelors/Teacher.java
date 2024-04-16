package uni.fmi.bachelors;

public class Teacher extends Person {
	private int Salary;

	public Teacher(String name, String gender, String eGN, int Salary) {
		super(name, gender, eGN);
		this.Salary = Salary;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

}
