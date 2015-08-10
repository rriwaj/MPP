package week1.day2.prob2.b;

import java.util.ArrayList;
import java.util.List;

public class Runner {
	public static void main(String[] args) {
		Order order = new Order();
		order.setOrderNum(1001);
		List<OrderLine> orderLinesList = new ArrayList<OrderLine>();
		orderLinesList.add(new OrderLine());
		orderLinesList.add(new OrderLine());
		orderLinesList.add(new OrderLine());
		order.setOrderLines(orderLinesList);
	}
}
