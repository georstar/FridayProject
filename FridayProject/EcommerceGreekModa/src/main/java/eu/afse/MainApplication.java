package eu.afse;

import eu.afse.data.*;
import eu.afse.service.CustomerService;
import eu.afse.service.Discount;

public class MainApplication {



    public static void main(String[] args) {


        OrderRepository orderRepository = new OrderRepository();
        Discount discount = new Discount();
        CustomerService customerService = new CustomerService();
        System.out.println(customerService.pendingOrders("123"));


    }

}
