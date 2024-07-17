package entities;

public class Individual extends Person{
    private Double healthExpenditures;

    public Individual(){
        super();
    }

    public Individual(String name, Double annualIncome , Double healthExpenditures) {
        super(name, annualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }
    public Double payTax(){
        if(annualIncome <  20000.0){
            return annualIncome * 0.15 - healthExpenditures * 0.5;
        }else{
            return annualIncome * 0.25 -healthExpenditures * 0.5;
        }

    }
}
