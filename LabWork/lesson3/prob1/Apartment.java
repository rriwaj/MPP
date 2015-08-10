package week1.day3.prob1;

public class Apartment {

	private double rent;
	private Building building;

	public Apartment(Building building, double rent) {
		this.building = building;
		this.rent = rent;
	}

	public void setBuilding(Building value) {
		this.building = value;
	}

	public Building getBuilding() {
		return this.building;
	}

	public void setRent(double value) {
		this.rent = value;
	}

	public double getRent() {
		return this.rent;
	}

}
