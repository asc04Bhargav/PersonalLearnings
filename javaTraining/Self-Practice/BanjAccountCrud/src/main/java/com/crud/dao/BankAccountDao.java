package com.crud.dao;

import com.crud.dto.BankAccount;

import java.util.List;

public interface BankAccountDao {
    public void addRecord(BankAccount bankAccount);
    public void updateRecord(BankAccount bankAccount);
    public List<BankAccount> showAll();
    public void deleteRecord(BankAccount bankAccount);

}
