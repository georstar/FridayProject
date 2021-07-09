package eu.afse.data;

import eu.afse.model.Order;
import eu.afse.model.Product;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class OrderRepository {


    private List<Order> orders;

    public OrderRepository() {
        orders = new ArrayList<>();
        CustomerRepository customerRepository = new CustomerRepository();
        ProductRepository productRepository = new ProductRepository();
        List<Product> orderItem1 = new ArrayList<>();
        List<Product> orderItem2 = new ArrayList<>();
        List<Product> orderItem3 = new ArrayList<>();
        orderItem1.add(productRepository.getProducts().get(0));
        orderItem1.add(productRepository.getProducts().get(0));
        orderItem1.add(productRepository.getProducts().get(1));
        orderItem1.add(productRepository.getProducts().get(1));
        orderItem2.add(productRepository.getProducts().get(0));
        orderItem2.add(productRepository.getProducts().get(1));
        orderItem1.add(productRepository.getProducts().get(0));
        orderItem1.add(productRepository.getProducts().get(1));
        orderItem1.add(productRepository.getProducts().get(2));
        orderItem1.add(productRepository.getProducts().get(2));
        Order order1 = new Order(new Date(2020, 1, 1), "001", "ship0", customerRepository.getCustomers().get(0), orderItem1 , true);
        Order order2 = new Order(new Date(2020, 2, 2), "002", "ship1", customerRepository.getCustomers().get(1), orderItem2, false);
        Order order3 = new Order(new Date(2020, 3, 3), "003", "ship2", customerRepository.getCustomers().get(2), orderItem3, false);
        Order order4 = new Order(new Date(2020, 1, 1), "004", "ship3", customerRepository.getCustomers().get(0), orderItem1 , true);

        orders.add(order1);
        orders.add(order2);
        orders.add(order3);


    }

    public List<Order> getOrders() {
        return orders;
    }

    @Override
    public String toString() {
        return "OrderRepository{" +
                "orders=" + orders +
                '}';
    }


}
