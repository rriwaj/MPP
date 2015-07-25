package week1.day2.prob2.c;

import java.util.ArrayList;
import java.util.List;

public class Runner {
	public static void main(String[] args) {
		Section section = new Section();
		section.sectionNum = 29;
		List<Student> studentsList = new ArrayList<Student>();
		Student student1 = new Student();
		student1.name = "Abdallah";
		studentsList.add(student1);
		Student student2 = new Student();
		student2.name = "Sami";
		studentsList.add(student2);
		Student student3 = new Student();
		student3.name = "Mahmoud";
		studentsList.add(student3);
		Student student4 = new Student();
		student4.name = "Asem";
		studentsList.add(student4);
	}
}
