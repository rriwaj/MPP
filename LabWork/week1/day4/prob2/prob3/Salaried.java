package week1.day4.prob3;

public class Salaried extends Employee {
	private double salary;

	public Salaried(long empId, double salary) {
		super(empId);
		this.salary = salary;
	}

	@Override
	public double calcGrossPay(int month, int year) {
		return salary; // monthly
	}
}
