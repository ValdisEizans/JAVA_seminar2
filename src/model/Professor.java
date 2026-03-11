package model;

import model.enums.ProfDegree;

public class Professor extends Person{
	//Mainigie
	private long profId;
	private ProfDegree degree;

	//Paligmainigais bez setera/getera
	private static long counter = 10000;
	
	//Geteri 
	public long getProfID() {
		return profId;
	}
	public ProfDegree getDegree() {
		return degree;
	}
	
	//Seteri
	public void setProfID() {
		profId = counter;
		counter++;
	}
	public void setDegree(ProfDegree inputDegree) {
		if(inputDegree != null) {
			degree = inputDegree;
		}
		else {
			degree = ProfDegree.unknown;
		}
	}
	
	//Bezargumenta konstruktors
	public Professor() {
		super(); // Izsaucas automatiski Person konstruktors, JABUT KODA 1. RINDA!!!!
		setProfID();
		setDegree(ProfDegree.master);
	}
	
	//Argumenta konstruktors
	public Professor(String inputName, String inputSurname, String inputPersonCode, ProfDegree inputDegree) {
		super(inputName,inputSurname,inputPersonCode); // Izsaucas automatiski Person konstruktors, JABUT KODA 1. RINDA!!!!
		setProfID();
		setDegree(inputDegree);
	}
	
	//toString funkcija
	@Override //var nerakstit
	public String toString() {
		String result = profId + ": " + name + " " + surname + " (" + personCode + ") " + degree;
		return result;
	}
	
	//Parejas funkcijas
	
	
}
