package com.crud.service;

import com.crud.dto.BankAccount;

import java.util.List;

public interface BankAccountService {
    public void addRecord(BankAccount bankAccount);
    public void updateRecord(BankAccount bankAccount);
    public List<BankAccount> showAll();
    public void deleteRecord(BankAccount bankAccount);
}
