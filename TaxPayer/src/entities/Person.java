package entities;

public abstract class Person {
    private String name;
    protected Double annualIncome;

    public Person(){

    }

    public Person(String name, Double annualIncome) {
        this.name = name;
        this.annualIncome = annualIncome;
    }

    public Double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(Double currentIncome) {
        this.annualIncome = currentIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract Double payTax();
}
