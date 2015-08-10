package week1.day3.prob1;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		LandLord landLord = new LandLord("Tom Senatra");

		List<Building> buildingsList = new ArrayList<Building>();

		Building building1 = new Building(landLord, 675);
		List<Apartment> apartmentsList1 = new ArrayList<Apartment>();
		Apartment apartment1 = new Apartment(building1, 750);
		apartmentsList1.add(apartment1);
		Apartment apartment2 = new Apartment(building1, 850);
		apartmentsList1.add(apartment2);
		Apartment apartment3 = new Apartment(building1, 650);
		apartmentsList1.add(apartment3);
		building1.setApartment(apartmentsList1);
		buildingsList.add(building1);

		Building building2 = new Building(landLord, 600);
		List<Apartment> apartmentsList2 = new ArrayList<Apartment>();
		Apartment apartment4 = new Apartment(building2, 900);
		apartmentsList2.add(apartment4);
		Apartment apartment5 = new Apartment(building2, 950);
		apartmentsList2.add(apartment5);
		building2.setApartment(apartmentsList2);
		buildingsList.add(building2);

		Building building3 = new Building(landLord, 1125);
		List<Apartment> apartmentsList3 = new ArrayList<Apartment>();
		Apartment apartment6 = new Apartment(building3, 1225);
		apartmentsList3.add(apartment6);
		Apartment apartment7 = new Apartment(building3, 1150);
		apartmentsList3.add(apartment7);
		Apartment apartment8 = new Apartment(building3, 1075);
		apartmentsList3.add(apartment8);
		building3.setApartment(apartmentsList3);
		buildingsList.add(building3);

		landLord.setBuilding(buildingsList);

		double totalProfits = 0;
		for (Building building : landLord.getBuilding()) {
			totalProfits += building.getProfit();
		}

		System.out.println("Landlord \"" + landLord.getName()
				+ "\" total profits are: " + totalProfits);
	}

}
