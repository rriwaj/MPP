package week1.day4.prob3;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class Runner {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		Hourly hourly = new Hourly(1013, 45, 48);
		Salaried salaried = new Salaried(1234, 6800);
		List<Order> ordersList = new ArrayList<Order>();
		try {
			ordersList.add(new Order(1, DateFormat.getDateInstance().parse("Feb 03, 2002"), 150));
			ordersList.add(new Order(1, DateFormat.getDateInstance().parse("Feb 04, 2002"), 230));
			ordersList.add(new Order(1, DateFormat.getDateInstance().parse("Feb 05, 2002"), 150));
			ordersList.add(new Order(1, DateFormat.getDateInstance().parse("Feb 15, 2002"), 150));
			ordersList.add(new Order(1, DateFormat.getDateInstance().parse("Feb 16, 2002"), 399));
			ordersList.add(new Order(1, DateFormat.getDateInstance().parse("Feb 17, 2002"), 550));
			ordersList.add(new Order(1, DateFormat.getDateInstance().parse("Feb 20, 2002"), 99));
			ordersList.add(new Order(1, DateFormat.getDateInstance().parse("Feb 22, 2002"), 149));
			ordersList.add(new Order(1, DateFormat.getDateInstance().parse("Feb 25, 2002"), 199));
			ordersList.add(new Order(1, DateFormat.getDateInstance().parse("Feb 27, 2002"), 429));
			ordersList.add(new Order(1, DateFormat.getDateInstance().parse("Mar 02, 2002"), 150));
			ordersList.add(new Order(1, DateFormat.getDateInstance().parse("Mar 04, 2002"), 129));
			ordersList.add(new Order(1, DateFormat.getDateInstance().parse("Mar 05, 2002"), 309));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Commissioned commissioned = new Commissioned(1331, 0.1, 5700, ordersList);

		employees.add(hourly);
		employees.add(salaried);
		employees.add(commissioned);

		for (Employee employee : employees) {
			Paycheck paycheck = employee.calcCompensation(3, 2002);
			System.out.print("Employee ID#: " + employee.getEmpId() + " net pay is: ");
			paycheck.print();
		}

	}
}
