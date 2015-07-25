package week1.day3.prob1;

import java.util.ArrayList;
import java.util.List;

public class Building {

	private double maintenanceCost;
	private LandLord landLord;
	private List<Apartment> apartments;

	public Building(LandLord landLord, double maintenanceCost) {
		this.landLord = landLord;
		this.maintenanceCost = maintenanceCost;
	}

	public double getProfit() {
		double sumRents = 0;
		for (Apartment apartment : apartments) {
			sumRents += apartment.getRent();
		}
		return sumRents - maintenanceCost;
	}

	public void setMaintenanceCost(double value) {
		this.maintenanceCost = value;
	}

	public double getMaintenanceCost() {
		return this.maintenanceCost;
	}

	public List<Apartment> getApartment() {
		if (this.apartments == null) {
			this.apartments = new ArrayList<Apartment>();
		}
		return this.apartments;
	}

	public void setApartment(List<Apartment> apartments) {
		this.apartments = apartments;
	}

	public LandLord getLandLord() {
		return this.landLord;
	}

}
