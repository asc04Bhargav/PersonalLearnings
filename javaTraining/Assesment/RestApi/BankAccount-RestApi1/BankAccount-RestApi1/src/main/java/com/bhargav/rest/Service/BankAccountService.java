package com.bhargav.rest.Service;

import com.bhargav.rest.exception.BankAccountNotFoundException;
import com.bhargav.rest.repo.BankAccountRepository;
import com.bhargav.rest.dvo.BankAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankAccountService {

    @Autowired
    private BankAccountRepository repo;

    public BankAccount save(BankAccount bankAccount){
        return repo.save(bankAccount);
    }

    public List<BankAccount> findAll(){
        return repo.findAll();
    }

    public void deleteById(int bankNumber){
        repo.deleteById(bankNumber);
    }

    public BankAccount findById(int bankNumber){
        return repo.findById(bankNumber).orElseThrow(()-> new BankAccountNotFoundException(bankNumber));
    }


}
