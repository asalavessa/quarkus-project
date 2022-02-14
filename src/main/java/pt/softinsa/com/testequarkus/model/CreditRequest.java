package pt.softinsa.com.testequarkus.model;

import javax.persistence.*;

@Entity
public class CreditRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="client_id")
    private int clientId;

    @Column(name="client_name")
    private String clientName;

    @Column(name="client_salary")
    private int clientSalary;

    @Column(name="client_years_working")
    private int clientYearsWorking;

    @Column(name="desired_quantity")
    private int desireQuantity;

    @Column(name="number_of_paying_months")
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
