package pt.softinsa.com.testequarkus.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CreditResponse{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private boolean isCreditAproved;
	private String clientName;
	private int amountBorrowed;
	private int creditDuration;
	private double monthlyPayment;


	public CreditResponse() {
	}

	public boolean isCreditAproved() {
		return isCreditAproved;
	}

	public void setCreditAproved(boolean creditAproved) {
		isCreditAproved = creditAproved;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public int getAmountBorrowed() {
		return amountBorrowed;
	}

	public void setAmountBorrowed(int amountBorrowed) {
		this.amountBorrowed = amountBorrowed;
	}

	public int getCreditDuration() {
		return creditDuration;
	}

	public void setCreditDuration(int creditDuration) {
		this.creditDuration = creditDuration;
	}

	public double getMonthlyPayment() {
		return monthlyPayment;
	}

	public void setMonthlyPayment(double monthlyPayment) {
		this.monthlyPayment = monthlyPayment;
	}
}