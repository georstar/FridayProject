package eu.afse.model;

import eu.afse.data.CustomerRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public class Order {
    private Date orderDate;
    private String id;
    private String shipment;
    private List<Product> orderItems = new ArrayList<>();
    private Customer customer;
    private boolean pending;

    public Order() {}

    public Order(Date orderDate, String id, String shipment, Customer customer, List orderItems, boolean pending) {
        this.orderDate = orderDate;
        this.id = id;
        this.shipment = shipment;
        this.customer = customer;
        this.orderItems = orderItems;
        this.pending = pending;

    }


    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getShipment() {
        return shipment;
    }

    public void setShipment(String shipment) {
        this.shipment = shipment;
    }

    public List getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List orderItems) {
        this.orderItems = orderItems;
    }

    public void addOrderItems(Product product) {
        this.orderItems.add(product);
    }

    public Customer getCustomer() {
        return customer;
    }


    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public boolean isPending() {
        return pending;
    }

    public void setPending(boolean pending) {
        this.pending = pending;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderDate=" + orderDate +
                ", id='" + id + '\'' +
                ", shipment='" + shipment + '\'' +
                ", orderItems=" + orderItems +
                ", customer=" + customer +
                ", pending=" + pending +
                '}';
    }




    //////////////////////////////////
    // CRUD interface for a list,  create, read, update, delete

/*
    public void create(Product product) {
        orderItems.add(product);
    }

    public void createCustomer(Customer customer) {
        customers.add(customer);
    }

    public Product read(int index) {
        if (index<orderItems.size() && index>=0)
            return orderItems.get(index);
        return null;
    }

    //changes price to a Product
    public void update(int index, double newPrice) {
        orderItems.get(index).setPrice(newPrice);
    }

    public void delete(int index) {
        orderItems.remove(index);
    }

    ///print the order




    // calculate total
    public double calculateTotal() {
        double calculation = 0;
//        for (int index = 0 ; index < products.size(); index ++){
//            calculation += products.get(index).getPrice();
//        }

        for (Product product : orderItems) {
            calculation += product.getPrice();
        }

//      calculation = orderItems.stream().map(product ->product.getPrice())
//              .reduce( (value1, value2) -> value1+value2).get();

        return calculation;
    }

    public int countProducts(){
        return orderItems.size();
    }

*/


}
