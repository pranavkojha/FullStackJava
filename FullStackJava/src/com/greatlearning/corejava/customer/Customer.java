package com.greatlearning.corejava.customer;

public class Customer {
    public String name;
    private int id;
    protected String emailId;

    public Customer(String name, int id, String email) {
        this.name = name;
        this.emailId = email;
        this.id = id;
    }

    void display() {
        System.out.println("Name : " + this.name);
        System.out.println("Id   : " + this.id);
        System.out.println("Email: " + this.emailId);
        System.out.println("--------------");
    }
}
