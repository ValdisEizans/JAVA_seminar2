package model;

//Modelu klase
public class Grade {
	//Mainigie
	private long gradeId;
	private int value;
	private Student student;
	private Course course;
	
	//Paligmainigais bez setera/getera
	private static long counter = 0;
	
	//Geteri 	
	public long getgradeId() {
		return gradeId;
	}
	public int getValue() {
		return value;
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
	public void setValue(int inputValue) {
		if((inputValue > 0) && (inputValue < 10)) {
			value = inputValue;
		}
		else{
			value = 0;
		}
	}
	public void setStudent(Student inputStudent) {
		if(inputStudent != null) {
			student = inputStudent;
		}
		else{
			student = null;
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
		setValue(0);
		setStudent(student);
		setCourse(course);
	}
	
	//Argumenta konstruktors
	public Grade(int inputValue, Student inputStudent, Course inputCourse) {
		setGradeId();
		setValue(inputValue);
		setStudent(inputStudent);
		setCourse(inputCourse);
	}
	
	//toString funkcija
	@Override //var nerakstit
	public String toString() {
		String result = gradeId + ": " + value + " " + student + course;
		return result;
	}
	
	//Parejas funkcijas
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
