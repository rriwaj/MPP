package week1.day4.prob3;

import java.util.Date;

public class Order {
	private int orderNo;
	private Date orderDate;
	private double orderAmount;

	public Order(int orderNo, Date orderDate, double orderAmount) {
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
	}

	public double getOrderAmount() {
		return orderAmount;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
}
