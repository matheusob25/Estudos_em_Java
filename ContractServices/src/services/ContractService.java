package services;

import entities.Contract;
import entities.Installment;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void proccessContract(Contract contract, Integer months){
        Double amount;
        for(int i = 0; i < months; i++){
            amount = contract.getTotalValue() / months;
            amount += onlinePaymentService.interest(amount, i+1);
            amount += onlinePaymentService.paymentFee(amount);
            contract.addInstallments(new Installment((contract.getDate().plusMonths(i+1)), amount));
        }
    }

}
