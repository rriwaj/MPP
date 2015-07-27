package week1.day4.prob3;

public abstract class Employee {
	private long empId;

	public Employee(long empId) {
		this.empId = empId;
	}

	public void print() {
	}

	public Paycheck calcCompensation(int month, int year) {
		double grossPay = calcGrossPay(month, year);
		return new Paycheck(grossPay);
	}

	public abstract double calcGrossPay(int month, int year);

	public long getEmpId() {
		return empId;
	}

}
