package entities;

public class BusinessAccount extends Account{

    private Double loanLimit;

    public BusinessAccount(){
        super();
    }
    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public void loan(Double amount){
        if(amount < loanLimit){
            balance += amount;
            loanLimit -= amount;
        }else{
            System.out.println("NO LIMIT FOR LOAN");
        }
    }
    @Override
    public void withDraw(double amount){
        super.withDraw(amount);
        balance -= 2.0;
    }


    @Override
    public String toString() {
        return super.toString() +
                ", loanLimit: " + String.format("%.2f", loanLimit);
    }
}
