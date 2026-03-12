package com.java8;

public class Customer {
    private int custId;
    private String custName;

    public Customer() {
    }

    public Customer(int custId, String custName) {
        this.custId = custId;
        this.custName = custName;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }
}
