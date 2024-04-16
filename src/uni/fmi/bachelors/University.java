package uni.fmi.bachelors;

import java.util.ArrayList;

public class University {
	private String Name;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	static ArrayList<Person> MainList = new ArrayList<>();

	public ArrayList<Person> getMainList() {
		return MainList;
	}

	public void setMainList(ArrayList<Person> mainList) {
		MainList = mainList;
	}

	Student highestStudent = null;

	public void HighestGrade() {
		double sum = 0;
		int counter = 0;

		for (Person student : MainList) {
			if (student instanceof Student) {
				Student studentTemp = (Student) student;
				if (studentTemp.getGender().equals("female") || studentTemp.getGender().equals("Female")) {
					if (highestStudent == null || highestStudent.getAverageGrade() < studentTemp.getAverageGrade()) {
						highestStudent = studentTemp;
					}
				}
			}

		}
		if (highestStudent != null) {
			System.out.println("The highest graded of the female students is: " + highestStudent.getName() + " | " + highestStudent.getAverageGrade());
		}
	}

	public double AverageSalary() {
		double sum = 0;
		int Teachercounter = 0;
		for (Person teacher : MainList) {
			if (teacher instanceof Teacher) {
				Teacher teacherTemp = (Teacher) teacher;
				sum += teacherTemp.getSalary();
				Teachercounter++;
			}
		}

		double average = sum / Teachercounter;
		System.out.println("Average: " + average);
		return average;
	}
}