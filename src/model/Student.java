package model;

//Modelu klase
public class Student {
	//Mainigie
	private long studId;
	private String name;
	private String surname;
	private String personCode;
	
	//Paligmainigais bez setera/getera
	private static long counter = 0;
	
	//Geteri 
	public long getStudID() {
		return studId;
	}
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
	public void setStudID() {
		studId = counter;
		counter++;
	}
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
		//TODO regex maska dienam un menesiem
		if ((inputPersoncode != null) && (!inputPersoncode.isEmpty()) && (inputPersoncode.matches("[0-9]{6}[-]{1}[0-9]{5}")) ) {
			personCode = inputPersoncode;
		}
		else {
			personCode = "Unknown";
		}
		
	}
	
	
	//Bezargumenta knstruktors
	
	//Argumenta konstruktors
	
	
	//toString funkcijas
	
	
	//Parejas funkcijas
	
}
