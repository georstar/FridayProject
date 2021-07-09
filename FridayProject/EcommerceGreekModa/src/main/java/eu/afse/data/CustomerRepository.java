package eu.afse.data;


import eu.afse.model.Customer;


import java.util.ArrayList;
import java.util.List;


public class CustomerRepository {
    private List<Customer> customers;


    public CustomerRepository() {
        customers = new ArrayList<>();

        Customer customer1 = new Customer("123", "George", "Papadopoulos", "address0", "123456789", "g.papadopoulos@gmail.com", CustomerType.B2B, PaymentMethod.WIRE_TRANSFER);
        Customer customer2 = new Customer("321", "John", "Papadopoulos", "address1", "987654321", "j.papadopoulos@gmail.com", CustomerType.B2C, PaymentMethod.CASH);
        Customer customer3 = new Customer("132", "Maria", "Papadopoulos", "address2", "012345678", "m.papadopoulos@gmail.com", CustomerType.B2G , PaymentMethod.CREDIT_CARD);
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);

    }

    public List<Customer> getCustomers() {
        return customers;
    }

    @Override
    public String toString() {
        return "CustomerRepository{" +
                "customers=" + customers +
                '}';
    }
}


