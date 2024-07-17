package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Account acc = new Account(1001, "Alex", 1000.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 1000.0,500.0);
        SavingsAccount savv = new SavingsAccount(1005,"Sophie",1000.0,0.5);

        // UPCASTING
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003,"John",1000.0,500.1);
        Account acc3 = new SavingsAccount(1004, "Julio", 300.0, 0.1);

        // DOWNCASTING
        // BusinessAccount acc4 = (BusinessAccount) acc3;
        BusinessAccount acc5 = null;
        SavingsAccount acc6 = null;
        if(acc2 instanceof BusinessAccount){
            acc5 = (BusinessAccount) acc2;
            acc5.loan(300.0);
        }
        if(acc3 instanceof SavingsAccount){
            acc6 = (SavingsAccount) acc3;
        }

        // metodos sobrescritos da super classe
        acc.withDraw(200);
        bacc.withDraw(200);
        savv.withDraw(200);

        System.out.println(acc);
        System.out.println(bacc);
        System.out.println(savv);



    }

}
