package week1.day2.prob2.c;

import java.util.ArrayList;
import java.util.List;

public class Section {
	public int sectionNum;
	private List<Student> students;

	public List<Student> getStudents() {
		if (this.students == null) {
			this.students = new ArrayList<Student>();
		}
		return this.students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
}
