package pt.softinsa.com.testequarkus.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CreditRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int clientId;
    private String clientName;
    private int clientSalary;
    private int clientYearsWorking;
    private int desireQuantity;
    private int numberOfPayingMonths;

    public CreditRequest() {
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public int getClientSalary() {
        return clientSalary;
    }

    public void setClientSalary(int clientSalary) {
        this.clientSalary = clientSalary;
    }

    public int getClientYearsWorking() {
        return clientYearsWorking;
    }

    public void setClientYearsWorking(int clientYearsWorking) {
        this.clientYearsWorking = clientYearsWorking;
    }

    public int getDesireQuantity() {
        return desireQuantity;
    }

    public void setDesireQuantity(int desireQuantity) {
        this.desireQuantity = desireQuantity;
    }

    public int getNumberOfPayingMonths() {
        return numberOfPayingMonths;
    }

    public void setNumberOfPayingMonths(int numberOfPayingMonths) {
        this.numberOfPayingMonths = numberOfPayingMonths;
    }
}
