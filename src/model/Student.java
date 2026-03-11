package model;

//Modelu klase
public class Student extends Person {
	//Mainigie
	private long studId;
	
	//Paligmainigais bez setera/getera
	private static long counter = 0;
	
	//Geteri 
	public long getStudID() {
		return studId;
	}
	
	//Seteri
	public void setStudID() {
		studId = counter;
		counter++;
	}

	//Bezargumenta konstruktors
	public Student() {
		super(); // Izsaucas automatiski Person konstruktors, JABUT KODA 1. RINDA!!!!
		setStudID();
	}
	
	//Argumenta konstruktors
	public Student(String inputName, String inputSurname, String inputPersonCode) {
		super(inputName,inputSurname,inputPersonCode); // Izsaucas automatiski Person konstruktors, JABUT KODA 1. RINDA!!!!
		setStudID();
	}
	
	//toString funkcija
	@Override //var nerakstit
	public String toString() {
		String result = studId + ": " + name + " " + surname + " (" + personCode + ")";
		return result;
	}
	
	//Parejas funkcijas
	
}
