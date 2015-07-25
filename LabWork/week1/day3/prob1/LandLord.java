package week1.day3.prob1;

import java.util.ArrayList;
import java.util.List;

public class LandLord {

	private String name;
	private List<Building> buildings;

	public LandLord(String name) {
		this.name = name;
	}

	public List<Building> getBuilding() {
		if (this.buildings == null) {
			this.buildings = new ArrayList<Building>();
		}
		return this.buildings;
	}

	public void setBuilding(List<Building> buildings) {
		this.buildings = buildings;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
