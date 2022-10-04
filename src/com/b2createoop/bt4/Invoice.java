package com.b2createoop.bt4;

import com.b2createoop.bt4.Customer;

public class Invoice {
    private final int id;
    private final com.b2createoop.bt4.Customer Customer;
    private double amount;

    public Invoice(int id, Customer Customer, double amount) {
        this.id = id;
        this.Customer = Customer;
        this.amount = amount;
    }

    public int getID() {
        return id;
    }

    public Customer getCustomer() {
        return Customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getCustomerID() {
        return Customer.getID();
    }

    public String getCustomerName() {
        return Customer.getName();
    }

    public int getCustomerDiscount() {
        return Customer.getDiscount();
    }

    public double getAmountAfterDiscount() {
        return amount - (amount * Customer.getDiscount() / 100);
    }

    public String toString() {
        return "Invoice [id = " + id + " customer = " + Customer + " amount = " + amount + "]";
    }

}