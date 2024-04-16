package uni.fmi.bachelors;

import java.util.ArrayList;

public class MainClass extends University {

	public static void main(String[] args) {

		MainList.add(new Teacher("Eva", "female", "32311241", 3330));
		MainList.add(new Teacher("Peter", "male", "32311241", 3330));
		MainList.add(new Student("Mariette", "Female", "13123123234", 5.4));
		MainList.add(new Student("Kim", "female", "555", 5.1));

		University uniTest = new University();
		uniTest.AverageSalary();
		uniTest.HighestGrade();
	}

}
