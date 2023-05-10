package com.jvm.prez.performance;

public class Customer {
    public Customer(String name, Integer rank) {
        this.name = name;
        this.numberModulo10 = Integer.valueOf(rank % 10).toString().intern();
    }

    private final String name;
    private final String numberModulo10;

    public String getName() {
        return name;
    }

    public static void main(String[] args) {

    }
}
