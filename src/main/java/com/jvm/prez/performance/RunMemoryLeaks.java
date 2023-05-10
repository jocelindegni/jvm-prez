package com.jvm.prez.performance;

public class RunMemoryLeaks{

    private int customer_nb;

    private final CustomerService customerService = new CustomerService();


    public RunMemoryLeaks(int nb){
        this.customer_nb = nb;
    }

    public void run() {

        Integer i = 0;

        while(i <= customer_nb){
            i++;
            var name = "Customer " + i;

            customerService.addCustomer(new Customer(name, i));
            if (i % 1000 == 0){
                for (int j=0; j<100; j++){
                    customerService.deleteCustomer("Customer " + j);
                }
            }
//            try {
//                Thread.sleep(5);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }
    }
}
