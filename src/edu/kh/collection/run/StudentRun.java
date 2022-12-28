package edu.kh.collection.run;

import edu.kh.collection.model.service.StudentService;

public class StudentRun {

	public static void main(String[] args) {
		StudentService student = new StudentService();

		//student.ex();
		student.displayMenu();
	}
}
