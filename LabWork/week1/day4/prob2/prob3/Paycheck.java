package week1.day4.prob3;

public class Paycheck {
	private double grossPay;
	private double fica;
	private double state;
	private double local;
	private double medicare;
	private double socialSecurity;

	Paycheck(double grossPay) {
		this.grossPay = grossPay;
		fica = (23.0 / 100) * this.grossPay;
		state = (5.0 / 100) * this.grossPay;
		local = (1.0 / 100) * this.grossPay;
		medicare = (3.0 / 100) * this.grossPay;
		socialSecurity = (7.5 / 100) * this.grossPay;
	}

	public void print() {
		System.out.printf("%,.2f\n", getNetPay());
	}

	public double getNetPay() {
		return grossPay - (fica + state + local + medicare + socialSecurity);
	}
}
