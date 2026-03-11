package model;

public class Person {
	//Mainigie
	protected String name;
	protected String surname;
	protected String personCode;
	
	//Geteri 
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public String getPersonCode() {
		return personCode;
	}
	
	//Seteri
	public void setName(String inputName) {
		if((inputName != null) && (!inputName.isEmpty()) && (inputName.matches("[A-Z]{1}[a-z]{2,15}([*]{1}[A-Z]{1}[a-z]{2,15})?")) ) {
			name = inputName;
		}
		else{
			name = "Unknown";
		}
	}
	public void setSurname(String inputSurname) {
		if((inputSurname != null) && (!inputSurname.isEmpty()) && (inputSurname.matches("[A-Z]{1}[a-z]{2,25}([-]{1}[A-Z]{1}[a-z]{2,25})?")) ) {
			surname = inputSurname;
		}
		else{
			surname = "Unknown";
		}
	}
	public void setPersonCode(String inputPersoncode) {
		if ((inputPersoncode != null) && (!inputPersoncode.isEmpty()) && (inputPersoncode.matches("[0-9]{6}[-]{1}[0-9]{5}")) ) {
			personCode = inputPersoncode;
		}
		else {
			personCode = "Unknown";
		}
	}

	//Bezargumenta konstruktors
	public Person() {
		setName("Guntis");
		setSurname("Priede");
		setPersonCode("123456-78541");
	}
	
	//Argumenta konstruktors
	public Person(String inputName, String inputSurname, String inputPersonCode) {
		setName(inputName);
		setSurname(inputSurname);
		setPersonCode(inputPersonCode);
	}
	
	//toString funkcija
	@Override //var nerakstit
	public String toString() {
		String result = name + " " + surname + " (" + personCode + ")";
		return result;
	}
}
