package service;

import java.util.ArrayList;
import java.util.Arrays;

import model.Course;
import model.Grade;
import model.Person;
import model.Professor;
import model.Student;
import model.enums.ProfDegree;

public class MainService {
	
	private static ArrayList<Person> allPerson = new ArrayList<Person>(); //var glabat personas,studentus un profesorus
	private static ArrayList<Course> allCourses = new ArrayList<Course>();
	private static ArrayList<Grade> allGrades = new ArrayList<Grade>();
	

	public static void main(String[] args) {
		//datu tips, nosaukums, new un tad konstruktors
		System.out.println("--------------- Studenti: ------------------");
		System.out.println();
		Student stud1 = new Student();
		Student stud2 = new Student("Guntis","Eglitis","785412-96541");
		Student stud3 = new Student("Kristaps","Abols","123456-78541");
		allPerson.add(stud1);
		allPerson.add(stud2);
		allPerson.add(stud3);

		Professor prof1 = new Professor();
		Professor prof2 = new Professor("Agris","Ziemelis","125874-98745",ProfDegree.barchelor);
		Professor prof3 = new Professor("Andris","Gobzems","125784-98745",ProfDegree.phd);
		allPerson.addAll(Arrays.asList(prof1,prof2,prof3));

		System.out.println("Visas personas" + allPerson);
		for(Person tempP : allPerson) {
			if(tempP instanceof Student) { //parbauda, vai persona ir students
				System.out.println(tempP);
			}
		}
		
		System.out.println();
		System.out.println("--------------- Profesori: ------------------");
		System.out.println();		

		for(Person tempP : allPerson) {
			if(tempP instanceof Professor) { //parbauda, vai persona ir profesors
				System.out.println(tempP);
			}
		}
		
		System.out.println();
		System.out.println("--------------- Kursi: ------------------");
		System.out.println();
		Course course1 = new Course();
		Course course2 = new Course("Augstaka matematika",(byte)32,prof3);
		Course course3 = new Course("Ekonomika",(byte)16,prof2);
		allCourses.addAll(Arrays.asList(course1,course2,course3));
		
		for (Course tempC : allCourses) {
			System.out.println(tempC);
		}
		
		System.out.println();
		System.out.println("--------------- Atzimes: ------------------");
		System.out.println();
		Grade grade1 = new Grade();
		Grade grade2 = new Grade((byte)8,stud2,course2);
		Grade grade3 = new Grade((byte)7,stud2,course3);
		allGrades.addAll(Arrays.asList(grade1,grade2,grade3));

		for (Grade tempG : allGrades) {
			System.out.println(tempG);
		}

		System.out.println();
		System.out.println("--------------- CRUD testesana: ------------------");
		System.out.println();
		try {
			createStudent("Imants", "Zarins", "258740-96523");

			for(Person tempP : allPerson) {
				if(tempP instanceof Student) { //parbauda, vai persona ir students
					System.out.println(tempP);
				}
			}
			System.out.println(getStudentById(4));
			System.out.println(updateById(0, "Guntitis", "Ziepitis"));

			for(Person tempP : allPerson) {
				if(tempP instanceof Student) { //parbauda, vai persona ir students
					System.out.println(tempP);
				}
			}
			deleteById(4);

			for(Person tempP : allPerson) {
				if(tempP instanceof Student) { //parbauda, vai persona ir students
					System.out.println(tempP);
				}
			}
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}

		System.out.println();
		System.out.println("--------------- Filtra testesana: ------------------");
		System.out.println();
		try {
			System.out.println(filterProfessorByDegree(ProfDegree.barchelor));
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}

		
		System.out.println();
		System.out.println("--------------- Videja atzime testesana: ------------------");
		System.out.println();
		try {
			System.out.println(stud2.getName() + " videja atzime " + calculateAverageGradeForStudent("785412-96541"));
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}

	}
	
	//CRUD - create, retrieve, update, delete
	
	//Create student
	public static void createStudent(String inputName, String inputSurname, String inputPersoncode) throws Exception{
		//TO DO parbaudit ienakosos parametrus
		for(Person temps : allPerson) {
			if(temps instanceof Student && temps.getPersonCode().equals(inputPersoncode)) {
				throw new Exception("Tads students jau eksiste!");
			}
		}
		Student newStudent = new Student(inputName, inputSurname, inputPersoncode);
		allPerson.add(newStudent);
	}

	//Retrieve by ID student
	public static Student getStudentById(long id) throws Exception {
		if(id < 0) {
			throw new Exception("ID nevar but negativs!");
		}
		for(Person tempS : allPerson) {
			if(tempS instanceof Student) {
				Student stud = (Student) tempS;//parveido atrasto personu uz studentu
				if (stud.getStudID() == id) {
					return stud;	
				}
			}
		}		
		throw new Exception("Students ar ID " + id + " neeksiste!"); 
	}
	
	//Update students name and/or surname
	public static Student updateById(long id, String inputName, String inputSurname) throws Exception{
		Student studentForUpdating = getStudentById(id);
		
		//TO DO parbaudit ienakosos parametrus
		if(!studentForUpdating.getName().equals(inputName)) {
			studentForUpdating.setName(inputName);
		}
		if(!studentForUpdating.getSurname().equals(inputSurname)) {
			studentForUpdating.setSurname(inputSurname);
		}
		
		return studentForUpdating;
	}
	
	//Delete student by ID
	public static void deleteById (long id) throws Exception{
		Student studentForDeleting = getStudentById(id);
		allPerson.remove(studentForDeleting);
	}
	
	//Izfiltret un atgriezt visus profesorus, kuru degree ir master
	public static ArrayList<Professor> filterProfessorByDegree(ProfDegree inputDegree) throws Exception{
		if(inputDegree == null) {
			throw new Exception("Neeksistejos grads");
		}
		
		ArrayList<Professor> filteredProfessors = new ArrayList<Professor>();
		
		for(Person tempP : allPerson) {
			if(tempP instanceof Professor) {
				Professor prof = (Professor) tempP;
				if(prof.getDegree().equals(inputDegree)) {
					filteredProfessors.add(prof);
				}
			}
		}
		if(filteredProfessors.isEmpty()) {
			throw new Exception("Sistema nav profesoru ar " + inputDegree + " gradu!");
		}
		else {
			return filteredProfessors;
		}
	}
	
	//calculates average grade for each student
	public static float calculateAverageGradeForStudent(String inputPersoncode) throws Exception{
		if ((inputPersoncode == null) || (inputPersoncode.isEmpty()) || (!inputPersoncode.matches("[0-9]{6}[-]{1}[0-9]{5}")) ) {
			throw new Exception("Nepareizi ievades dati!");
		}
		int count = 0;
		float sum = 0;
		for(Grade tempG : allGrades) {
			if(tempG.getStudent().getPersonCode().equals(inputPersoncode)) {
				count++;
				sum = sum + tempG.getGradeValue();
			}
		}
		if(count == 0) {
			throw new Exception("Studentam ar perosnas kodu" + inputPersoncode + " nav atzimju!");
		}
		else {
			return (sum/count);
		}
		
	}
	
	
	
	

}
