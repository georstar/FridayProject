package eu.afse.service;

import eu.afse.data.CustomerRepository;
import eu.afse.data.OrderRepository;
import eu.afse.model.Customer;
import eu.afse.model.Order;

public class CustomerService {


    public boolean pendingOrders(String id) {
        boolean pending = false;
        int countPending = 0;
        String currentId;
        CustomerRepository customerRepository = new CustomerRepository();
        OrderRepository orderRepository = new OrderRepository();

        for (Order order : orderRepository.getOrders()) {
            if (order.getCustomer().getId().equals(id)) {
                if (order.isPending()) {
                    countPending++;
                }
            }
        }


        if (countPending > 1) pending = true;
        return pending;
    }


}
