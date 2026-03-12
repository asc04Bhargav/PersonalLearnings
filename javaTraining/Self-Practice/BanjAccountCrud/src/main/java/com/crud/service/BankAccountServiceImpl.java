package com.crud.service;

import com.crud.dao.BankAccountDao;
import com.crud.dao.BankAccountDaoImpl;
import com.crud.dto.BankAccount;

import java.util.List;

public class BankAccountServiceImpl implements BankAccountService{

    BankAccountDao ba1= new BankAccountDaoImpl();

    @Override
    public void addRecord(BankAccount bankAccount) {
        ba1.addRecord(bankAccount);
    }

    @Override
    public void updateRecord(BankAccount bankAccount) {
        ba1.updateRecord(bankAccount);
    }

    @Override
    public List<BankAccount> showAll() {
        return ba1.showAll();
    }

    @Override
    public void deleteRecord(BankAccount bankAccount) {
        ba1.deleteRecord(bankAccount);

    }
}
