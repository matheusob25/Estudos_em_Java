package application;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre os dados do contrato:");
        System.out.print("Numero: ");
        int numero = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        sc.nextLine();
        LocalDate contractDate = LocalDate.parse(sc.nextLine(), formatter);
        System.out.print("Valor do contrato: ");
        Double totalValue = sc.nextDouble();
        Contract contract = new Contract(numero, contractDate, totalValue);
        System.out.print("Entre com o numero de parcelas: ");
        int installments = sc.nextInt();
        ContractService contractService = new ContractService(new PaypalService());
        contractService.proccessContract(contract, installments);
        System.out.println("Parcelas: ");
        for(Installment e : contract.getInstallments()){
            System.out.println(e.getDueDate().format(formatter) + " - " + String.format("%.2f", e.getAmount()));
        }


        sc.close();
    }
}