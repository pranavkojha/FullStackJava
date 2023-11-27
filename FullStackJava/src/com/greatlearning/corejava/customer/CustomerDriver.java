package com.greatlearning.corejava.customer;

import com.greatlearning.corejava.customer.Customer;

public class CustomerDriver {
    public static void main(String[] args) {
        Customer c1 = new Customer("ram", 1, "ram@gmail.com");
        Customer c2 = new Customer("sita", 2, "sita@gmail.com");

        c1.display();
        c2.display();
    }
}
