package model;

//Modelu klase
public class Grade {
	//Mainigie
	private long gradeId;
	private byte gradeValue;
	private Student student;
	private Course course;
	
	//Paligmainigais bez setera/getera
	private static long counter = 0;
	
	//Geteri 	
	public long getgradeId() {
		return gradeId;
	}
	public byte getGradeValue() {
		return gradeValue;
	}
	public Student getStudent() {
		return student;
	}
	public Course getCourse() {
		return course;
	}
	
	//Seteri
	public void setGradeId() {
		gradeId = counter;
		counter++;
	}
	public void setGradeValue(byte inputGradeValue) {
		if((inputGradeValue >= 1) && (inputGradeValue <= 10)) {
			gradeValue = inputGradeValue;
		}
		else{
			gradeValue = 1;
		}
	}
	public void setStudent(Student inputStudent) {
		if(inputStudent != null) {
			student = inputStudent;
		}
		else{
			student = new Student();
		}
	}
	public void setCourse(Course inputCourse) {
		if(inputCourse != null) {
			course = inputCourse;
		}
		else{
			course = new Course();
		}
	}
	
	//Bezargumenta konstruktors
	public Grade() {
		setGradeId();
		setGradeValue((byte)4);
		setStudent(new Student());
		setCourse(new Course());
	}
	
	//Argumenta konstruktors
	public Grade(byte inputValue, Student inputStudent, Course inputCourse) {
		setGradeId();
		setGradeValue(inputValue);
		setStudent(inputStudent);
		setCourse(inputCourse);
	}
	
	//toString funkcija
	@Override //var nerakstit
	public String toString() {
		String result = gradeId + ": " + gradeValue + " " + student + course;
		return result;
	}
	
	//Parejas funkcijas
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
