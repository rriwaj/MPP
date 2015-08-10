package week1.day2.prob2.b;

import java.util.ArrayList;
import java.util.List;

public class Order {

	private int orderNum;
	private List<OrderLine> orderLines;

	public void setOrderNum(int value) {
		this.orderNum = value;
	}

	public int getOrderNum() {
		return this.orderNum;
	}

	public void setOrderLines(List<OrderLine> orderLines) {
		this.orderLines = orderLines;
	}

	public List<OrderLine> getOrderLines() {
		if (this.orderLines == null) {
			this.orderLines = new ArrayList<OrderLine>();
		}
		return this.orderLines;
	}

}
