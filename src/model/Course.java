package model;

//Modelu klase
public class Course {
	//Mainigie
	private long courseId;
	private String title;
	private byte creditPoints;
	private Professor professor;//TO DO izveidot iespeju, ka vairaki pasniedzeji pasniedz vienu kursu
	
	//Paligmainigais bez setera/getera
	private static long counter = 20000;
	
	//Geteri 	
	public long getcourseId() {
		return courseId;
	}
	public String getTitle() {
		return title;
	}
	public byte getCreditPoints() {
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
		if((inputTitle != null) && (inputTitle.matches("[A-Z]{1}[A-Za-z0-9 ]{1,50}")) ) {
			title = inputTitle;
		}
		else{
			title = "Unknown";
		}
	}
	public void setCreditPoints(int inputCreditPoints) {
		if((inputCreditPoints >= 1) && (inputCreditPoints <= 30 )) {
			creditPoints = (byte)inputCreditPoints;
		}
		else{
			creditPoints = 1;
		}
	}
	public void setProfessor(Professor inputProfessor) {
		if (inputProfessor != null) {
			professor = inputProfessor;
		}
		else {
			professor = new Professor();
		}
	}
	
	//Bezargumenta konstruktors
	public Course() {
		setCourseId();
		setTitle("Logika");
		setCreditPoints((byte)15);
		setProfessor(new Professor());
	}
	
	//Argumenta konstruktors
	public Course(String inputTitle, byte inputCreditPoints, Professor inputProfessor) {
		setCourseId();
		setTitle(inputTitle);
		setCreditPoints(inputCreditPoints);
		setProfessor(inputProfessor);
	}
	
	//toString funkcija
	@Override //var nerakstit
	public String toString() {
		String result = courseId + ": " + title + " (" + creditPoints + ")KP " + professor.getName().charAt(0) + ". " + professor.getSurname();
		return result;
	}
	
	//Parejas funkcijas
	
}
