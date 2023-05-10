package com.jvm.prez.performance;

import java.util.HashMap;
import java.util.Map;

public class CustomerService {

    private Map<String, Customer> customers = new HashMap<>();

    public void addCustomer(Customer customer){
        customers.put(customer.getName(), customer);
    }

    public void deleteCustomer(String name){
        customers.remove(name);
    }
}
