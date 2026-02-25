package model;

public class Professor {
	//Mainigie
	private long profId;
	private String name;
	private String surname;
	private String personCode;
	private String degree;

	//Paligmainigais bez setera/getera
	private static long counter = 0;
	
	//Geteri 
	public long getProfID() {
		return profId;
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
	public String getDegree() {
		return degree;
	}
	
	//Seteri
	public void setStudID() {
		profId = counter;
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
	public void setDegree(String inputDegree) {
		if((inputDegree != null) && (!inputDegree.isEmpty()) && (inputDegree.matches("[A-Z]{1}[a-z]{2,30}")) ) {
			degree = inputDegree;
		}
		else{
			degree = "Unknown";
		}
	}
	
	//Bezargumenta knstruktors
	public Professor() {
		setStudID();
		setName("Janis");
		setSurname("Kalnins");
		setPersonCode("123456-12345");
	}
	
	//Argumenta konstruktors
	public Professor(String inputName, String inputSurname, String inputPersonCode, String inputDegree) {
		setStudID();
		setName(inputName);
		setSurname(inputSurname);
		setPersonCode(inputPersonCode);
		setDegree(inputDegree);
	}
	
	//toString funkcija
	@Override //var nerakstit
	public String toString() {
		String result = profId + ": " + name + " " + surname + " (" + personCode + ")";
		return result;
	}
	
	//Parejas funkcijas
	
	
}
