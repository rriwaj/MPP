package week1.day2.prob2.c;

import java.util.ArrayList;
import java.util.List;

public class Student {
	public String name;
	private List<Section> sections;

	public List<Section> getSections() {
		if (this.sections == null) {
			this.sections = new ArrayList<Section>();
		}
		return this.sections;
	}

	public void setSections(List<Section> sections) {
		this.sections = sections;
	}

}
