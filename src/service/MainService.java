package service;

import java.util.ArrayList;
import java.util.Arrays;

import model.Course;
import model.Grade;
import model.Professor;
import model.Student;
import model.enums.ProfDegree;

public class MainService {
	
	private static ArrayList<Student> allStudents = new ArrayList<Student>();
	private static ArrayList<Professor> allProfessors = new ArrayList<Professor>();
	private static ArrayList<Course> allCourses = new ArrayList<Course>();
	private static ArrayList<Grade> allGrades = new ArrayList<Grade>();
	

	public static void main(String[] args) {
		//datu tips, nosaukums, new un tad konstruktors
		System.out.println("--------------- Studenti: ------------------");
		System.out.println();
		Student stud1 = new Student();
		Student stud2 = new Student("Guntis","Eglitis","785412-96541");
		Student stud3 = new Student("Kristaps","Abols","123456-78541");
		allStudents.add(stud1);
		allStudents.add(stud2);
		allStudents.add(stud3);
		
		for (Student tempS : allStudents) {
			System.out.println(tempS);
		}

		System.out.println();
		System.out.println("--------------- Profesori: ------------------");
		System.out.println();
		Professor prof1 = new Professor();
		Professor prof2 = new Professor("Agris","Ziemelis","125874-98745",ProfDegree.barchelor);
		Professor prof3 = new Professor("Andris","Gobzems","125784-98745",ProfDegree.phd);
		allProfessors.addAll(Arrays.asList(prof1,prof2,prof3));

		
		for (Professor tempP : allProfessors) {
			System.out.println(tempP);
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
}

}
