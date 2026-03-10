package model;

//Modelu klase
public class Course {
	//Mainigie
	private long courseId;
	private String title;
	private int creditPoints;
	private Professor professor;
	
	//Paligmainigais bez setera/getera
	private static long counter = 0;
	
	//Geteri 	
	public long getcourseId() {
		return courseId;
	}
	public String getTitle() {
		return title;
	}
	public int getCreditPoints() {
		return creditPoints;
	}
	public Professor getProfessor() {
		return professor;
	}
	
	//Seteri
	public void setCourseId() {
		courseId = counter;
		counter++;
	}
	public void setTitle(String inputTitle) {
		if((inputTitle != null) && (!inputTitle.isEmpty()) && (inputTitle.matches("[A-Z]{1}[a-z]{2,30}[ ]{1}[a-z]{2,30}[ ]{1}[a-z]{2,30}[ ]{1}[a-z]{2,30}")) ) {
			title = inputTitle;
		}
		else{
			title = "Unknown";
		}
	}
	public void setCreditPoints(int inputCreditPoints) {
		if((inputCreditPoints != 0) && (inputCreditPoints <= 240 )) {
			creditPoints = inputCreditPoints;
		}
		else{
			creditPoints = 0;
		}
	}
	public void setProfessor(Professor inputProfessor) {
		if (inputProfessor != null) {
			professor = inputProfessor;
		}
		else {
			professor = null;
		}
		
	}
	
	//Bezargumenta konstruktors
	public Course() {
		setCourseId();
		setTitle("Augstaka matematika");
		setCreditPoints(15);
		setProfessor(professor);
	}
	
	//Argumenta konstruktors
	public Course(String inputTitle, int inputCreditPoints, Professor inputProfessor) {
		setCourseId();
		setTitle(inputTitle);
		setCreditPoints(inputCreditPoints);
		setProfessor(inputProfessor);
	}
	
	//toString funkcija
	@Override //var nerakstit
	public String toString() {
		String result = courseId + ": " + title + " " + creditPoints + professor;
		return result;
	}
	
	//Parejas funkcijas
	
}
