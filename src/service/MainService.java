package service;

import model.Course;
import model.Grade;
import model.Professor;
import model.Student;
import model.enums.ProfDegree;

public class MainService {

	public static void main(String[] args) {
		//datu tips, nosaukums, new un tad konstruktors
		System.out.println("--------------- Studenti: ------------------");
		Student stud1 = new Student();
		System.out.println(stud1);
		
		Student stud2 = new Student("Guntis","Eglitis","785412-96541");
		System.out.println(stud2);
		
		Student stud3 = new Student("Gunt1s","egltis",null);
		System.out.println(stud3);
		
		System.out.println("--------------- Profesori: ------------------");
		
		Professor prof1 = new Professor();
		System.out.println(prof1);

		Professor prof2 = new Professor("Agris","Ziemelis","125874-98745",ProfDegree.barchelor);
		System.out.println(prof2);

		Professor prof3 = new Professor("Andris","Gobzems","125784-98745",ProfDegree.phd);
		System.out.println(prof3);
		
		System.out.println("--------------- Kursi: ------------------");

		Course course1 = new Course("Fizika",16,prof1);
		System.out.println(course1);
		Course course2 = new Course("Augstaka matematika",32,prof3);
		System.out.println(course2);
		Course course3 = new Course("Ekonomika",16,prof2);
		System.out.println(course3);
		
		//System.out.println(grade1);

	}

}
