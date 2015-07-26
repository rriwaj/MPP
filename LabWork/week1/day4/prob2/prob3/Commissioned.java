package week1.day4.prob3;

import java.util.Calendar;
import java.util.List;

public class Commissioned extends Employee {
	private double commission;
	private double baseSalary;
	private List<Order> ordersList;

	public Commissioned(long empId, double commission, double baseSalary, List<Order> ordersList) {
		super(empId);
		this.commission = commission;
		this.baseSalary = baseSalary;
		this.ordersList = ordersList;
	}

	@Override
	public double calcGrossPay(int month, int year) {
		double sumOrdersAmount = 0;
		for (Order order : ordersList) {
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(order.getOrderDate());
			if (calendar.get(Calendar.YEAR) == year && calendar.get(Calendar.MONTH) + 1 == month - 1) { // Calendar.MONTH) + 1: as it starts from 0
																										// month - 1: previous month
				sumOrdersAmount += order.getOrderAmount();
			}
		}
		return baseSalary + (commission * sumOrdersAmount);
	}
}
