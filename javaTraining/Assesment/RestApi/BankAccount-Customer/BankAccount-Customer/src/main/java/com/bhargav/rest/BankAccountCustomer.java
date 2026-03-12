package com.bhargav.rest;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

public class BankAccountCustomer {
    static String url = "http://localhost:8081/bankaccounts";
    static String urlWithParams= "http://localhost:8081/bankaccounts/{accountNumber}";
    static RestTemplate template = new RestTemplate();

    public static void add(){
        BankAccount b1 = new BankAccount(101,"Ravi",12000);
        BankAccount b2 = new BankAccount(102,"Raghu",13000);
        BankAccount b3 = new BankAccount(103,"Shravan",14000);
        BankAccount b4 = new BankAccount(104,"Abhishek",10000);
        BankAccount b5 = new BankAccount(105,"Pratik",13000);
        BankAccount b6 = new BankAccount(106,"Rohit",15000);

        template.postForEntity(url,b1, BankAccount.class);
        template.postForEntity(url,b2, BankAccount.class);
        template.postForEntity(url,b3, BankAccount.class);
        template.postForEntity(url,b4, BankAccount.class);
        template.postForEntity(url,b5, BankAccount.class);
        template.postForEntity(url,b6, BankAccount.class);

        System.out.println("HTTP Poste Executed");
    }

    public static void getAllAccounts(){
        BankAccount ba[] = template.getForObject(url, BankAccount[].class);

        for (BankAccount temp : ba){
            System.out.println(temp.getAccountNumber()+" "+temp.getCustomerName()+" "+temp.getActBalance());
        }
    }

    public static void delete(){
        Map<String, Integer> paraMap = new HashMap<>();
        paraMap.put("accountNumber", 101);

        template.delete(urlWithParams, paraMap);
    }


    public static void getById(){
        Map<String,Integer> paraMap= new HashMap<>();
        paraMap.put("accountNumber",103);

        ResponseEntity<BankAccount> entity = template.getForEntity(urlWithParams, BankAccount.class,paraMap);

        MediaType mt =entity.getHeaders().getContentType();
        System.out.println("ContentType"+ mt);
        System.out.println("status code: "+entity.getStatusCode());
    }

    public static void update(){
        BankAccount ba1 = new BankAccount(104,"Akshay",14000);

        Map<String,Integer> paraMap = new HashMap<>();
        paraMap.put("accountNumber",104);


        template.put(urlWithParams,ba1,paraMap);
        System.out.println("Account updated successfully");
    }

    public static void main(String[] args) {
        add();
        getAllAccounts();
        delete();
        getById();
        update();
        getById();
    }
}
