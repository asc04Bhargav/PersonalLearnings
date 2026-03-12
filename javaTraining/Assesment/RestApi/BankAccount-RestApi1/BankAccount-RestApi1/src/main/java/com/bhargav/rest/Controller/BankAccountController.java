package com.bhargav.rest.Controller;

import com.bhargav.rest.Service.BankAccountService;
import com.bhargav.rest.dvo.BankAccount;
import com.bhargav.rest.repo.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bankaccounts")

public class BankAccountController {
    @Autowired
    private BankAccountService service;

    @GetMapping()
    public List<BankAccount> findAll(){
        return service.findAll();
    }

    @PostMapping
    public BankAccount add(@RequestBody BankAccount bankAccount){
        return service.save(bankAccount);
    }

    @PutMapping("/{accountNumber}")
    public BankAccount update(@RequestBody BankAccount bankAccount){
        service.findById(bankAccount.getAccountNumber());
        return service.save(bankAccount);
    }

    @DeleteMapping("/{accountNumber}")
    public void delete(@PathVariable("accountNumber") int accountNumber){
        service.findById(accountNumber);
        service.deleteById(accountNumber);
    }

    @GetMapping("/{accountNumber}")
    public BankAccount findById(@PathVariable("accountNumber") int accountNumber){
        return service.findById(accountNumber);
    }
}
