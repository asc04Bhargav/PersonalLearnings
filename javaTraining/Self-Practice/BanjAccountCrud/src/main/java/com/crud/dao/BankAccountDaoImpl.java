package com.crud.dao;

import com.crud.dto.BankAccount;
import com.crud.exception.AccountNotFountException;

import java.util.LinkedList;
import java.util.List;

public class BankAccountDaoImpl implements BankAccountDao{

    List<BankAccount> listRecords= new LinkedList<>();

    @Override
    public void addRecord(BankAccount bankAccount) {
        listRecords.add(bankAccount);

    }

    @Override
    public void updateRecord(BankAccount bankAccount) {
        if(!listRecords.contains(bankAccount)){
            try {
                throw new AccountNotFountException();
            } catch (AccountNotFountException e) {
                System.out.println(e.toString());
            }
        }
        int index= listRecords.indexOf(bankAccount);
        listRecords.set(index,bankAccount);

    }

    @Override
    public List<BankAccount> showAll() {
        return listRecords;
    }

    @Override
    public void deleteRecord(BankAccount bankAccount) {
        if (!listRecords.contains(bankAccount)){
            try {
                throw new AccountNotFountException();
            } catch (AccountNotFountException e) {
                System.out.println(e.toString());
            }
        }
        listRecords.remove(bankAccount);
    }
}
