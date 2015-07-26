package week1.day4.prob3;

public class Hourly extends Employee {
	private double hourlyWage;
	private double hoursPerWeek;

	public Hourly(long empId, double hourlyWage, double hoursPerWeek) {
		super(empId);
		this.hourlyWage = hourlyWage;
		this.hoursPerWeek = hoursPerWeek;
	}

	@Override
	public double calcGrossPay(int month, int year) {
		return hourlyWage * hoursPerWeek * 4; // monthly paid;
	}
}
