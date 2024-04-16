package uni.fmi.bachelors;

public class Person {
private String Name;
private String Gender;
private String EGN;

public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getGender() {
	return Gender;
}
public void setGender(String gender) {
	Gender = gender;
}
public String getEGN() {
	return EGN;
}
public void setEGN(String eGN) {
	EGN = eGN;
}

public Person(String name, String gender, String eGN) {
	super();
	Name = name;
	Gender = gender;
	EGN = eGN;
}

}
