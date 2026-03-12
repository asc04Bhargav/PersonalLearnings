package com.crud.main;

import com.crud.dto.BankAccount;
import com.crud.service.BankAccountService;
import com.crud.service.BankAccountServiceImpl;

import java.util.List;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccountService bs1 = new BankAccountServiceImpl();

        bs1.addRecord(new BankAccount(1,"savings",12000));
        bs1.addRecord(new BankAccount(2,"savings",11000));
        bs1.addRecord(new BankAccount(3,"current",25000));
        bs1.addRecord(new BankAccount(4,"current",32000));
        bs1.addRecord(new BankAccount(5,"premium",43000));
        bs1.addRecord(new BankAccount(6,"demat",12312000));

        List<BankAccount>bk1= bs1.showAll();
        for (BankAccount b1: bk1){
            System.out.println(b1.getAccountNumber()+" "+b1.getAccountType()+" "+b1.getBalance());
        }


        BankAccount temp = new BankAccount(3,"savings",350000);
        bs1.updateRecord(temp);

        System.out.println("After updating all records");
        bk1=bs1.showAll();
        for (BankAccount b1: bk1){
            System.out.println(b1.getAccountNumber()+" "+b1.getAccountType()+" "+b1.getBalance());
        }

        BankAccount temp1 = new BankAccount(2,"savings",11000);
        bs1.deleteRecord(temp1);

        System.out.println("After deleting record");
        bk1=bs1.showAll();
        for (BankAccount b1: bk1){
            System.out.println(b1.getAccountNumber()+" "+b1.getAccountType()+" "+b1.getBalance());
        }


    }
}
