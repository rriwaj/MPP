package week1.day1.prob1.com.mum.projectmanagement;

import java.util.Date;

public class Developer {
private String ssn;
   
   public void setSsn(String value) {
      this.ssn = value;
   }
   
   public String getSsn() {
      return this.ssn;
   }
   
	private int id;
	private String firstName;
	private String lastName;
	private double salary;
	private Date hireDate;

	public void setId(int value) {
		this.id = value;
	}

	public int getId() {
		return this.id;
	}

	public void setFirstName(String value) {
		this.firstName = value;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setLastName(String value) {
		this.lastName = value;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setSalary(double value) {
		this.salary = value;
	}

	public double getSalary() {
		return this.salary;
	}

	public void setHireDate(Date value) {
		this.hireDate = value;
	}

	public Date getHireDate() {
		return this.hireDate;
	}

}
